package com.mycompany.what;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycompany.model.Type;
import com.mycompany.service.MyService;
import com.mycompany.service.TypeLocator;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
  
  @Autowired
  private TypeLocator typeLocator;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
  public String homeTest(@RequestParam(value="type") Type type, Locale locale, Model model) {
    
	  MyService myService = typeLocator.getService(type+"Service");
    
    Date date = new Date();
    DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
    
    String formattedDate = dateFormat.format(date);
    
    model.addAttribute("serverTime", myService.printService());
    
    return "home";
  }
	
}
