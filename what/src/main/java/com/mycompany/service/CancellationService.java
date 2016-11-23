package com.mycompany.service;

import org.springframework.stereotype.Service;

@Service
public class CancellationService extends EndorsementService {

  @Override
  public String printService() {
    return CancellationService.class.getSimpleName();
  }
}
