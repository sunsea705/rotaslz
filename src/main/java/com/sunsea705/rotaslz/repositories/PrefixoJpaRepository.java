package com.sunsea705.rotaslz.repositories;

import com.sunsea705.rotaslz.entities.Prefixo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrefixoJpaRepository extends JpaRepository<Prefixo, Long> {
}
