package com.mycompany.service;

import org.springframework.stereotype.Service;

@Service
public class EndorsementService extends RiskService {

  @Override
  public String printService() {
    return EndorsementService.class.getSimpleName();
  }
}
