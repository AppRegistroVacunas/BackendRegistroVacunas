package com.project.AppRegistroVacunas.Repositories;

import com.project.AppRegistroVacunas.Models.Workers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<Workers,Long> {
    Workers findByUsername(String username);
}
