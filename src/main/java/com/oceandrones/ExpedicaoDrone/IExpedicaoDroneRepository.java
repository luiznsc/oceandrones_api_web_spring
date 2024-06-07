package com.oceandrones.ExpedicaoDrone;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IExpedicaoDroneRepository extends JpaRepository<ExpedicaoDrone, Long> {
    Page<ExpedicaoDrone> findAll(Pageable paginacao);
    Page<ExpedicaoDrone> findAllByIdExpDrone(Long idExpDrone, Pageable pageable);
}
