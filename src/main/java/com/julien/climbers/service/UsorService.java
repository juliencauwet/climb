package com.julien.climbers.service;

import com.julien.climbers.entities.Usor;
import com.julien.climbers.entities.UsorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsorService {

    @Autowired
    private UsorRepository usorRepository;

    public Usor getUsorByEmail(String email){
        return usorRepository.findUsorByEmail(email);
    }

    public Usor getUsorByPseudo(String pseudo){
        return usorRepository.findUsorByPseudo(pseudo);
    }

    public void addUsor(Usor usor){
        usorRepository.save(usor);
    }
}
