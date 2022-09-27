package com.elisa.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elisa.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
