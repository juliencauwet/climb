package com.julien.climbers.service;

import com.julien.climbers.entities.UsorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsorService {

    @Autowired
    private UsorRepository usorRepository;
}
