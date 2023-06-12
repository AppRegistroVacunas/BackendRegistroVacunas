package com.project.AppRegistroVacunas.Repositories;

import com.project.AppRegistroVacunas.Models.Rols;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rols,Long> {

}
