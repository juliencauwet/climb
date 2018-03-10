package com.julien.climbers.entities;

import org.springframework.data.repository.CrudRepository;

public interface UsorRepository extends CrudRepository<Usor,Integer> {

    Usor findUsorByEmail(String email);

    Usor findUsorByPseudo(String pseudo);
}
