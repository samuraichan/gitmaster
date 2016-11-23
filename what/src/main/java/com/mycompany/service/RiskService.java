package com.mycompany.service;

import org.springframework.stereotype.Service;

@Service
public class RiskService implements MyService {

  @Override
  public String printService() {
    return RiskService.class.getSimpleName();
  }

}
