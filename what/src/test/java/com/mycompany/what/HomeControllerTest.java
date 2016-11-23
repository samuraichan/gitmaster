package com.mycompany.what;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

// just run this class alone - no need to deploy anything in the IDEA and get a success!

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/root-context.xml", "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
public class HomeControllerTest {
	
	@Autowired
	private HomeController homeController;
	
	private MockMvc mockMvc;

	@Test
    public void testOrderService() throws Exception {
		 mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();
		 mockMvc.perform(get("/")).andExpect(status().isOk());
    }
	
}

