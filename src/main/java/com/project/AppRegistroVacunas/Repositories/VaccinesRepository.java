package com.project.AppRegistroVacunas.Repositories;

import com.project.AppRegistroVacunas.Models.Vaccines;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface VaccinesRepository extends CrudRepository<Vaccines,Integer> {
    @Query(value = "from Vaccines ")
    List<Vaccines> findAll();
    @Modifying
    @Query(value = "INSERT INTO Vaccines(id, name, madeIn, madeBy, againstTo, creationDate, dueDate) "+
            "VALUES(:id, :name, :madeIn, :madeBy, :againstTo, :creationDate, :dueDate)")
    public void addVaccines(@Param("id") int id,
                            @Param("name") String name,
                            @Param("madeIn") String madeIn,
                            @Param("madeBy") String madeBy,
                            @Param("againstTo") String againstTo,
                            @Param("creationDate")Date creationDate,
                            @Param("dueDate") Date dueDate
    );
                            /*@Param("name") String name,
                            @Param("made_in") String made_in,
                            @Param("made_by") String made_by,
                            @Param("against_to") String against_to,
                            @Param("creation_date")Date creation_date,
                            @Param("due_date") Date due_date
                            );*/

    @Query("from Vaccines vac where  vac.id = :id")
    Vaccines findById(@Param("id") int id);

    @Modifying
    @Query(value= "UPDATE Vaccines SET name=:name,madeIn=:madeIn,madeBy=:madeBy,againstTo=:againstTo,creationDate=:creationDate,dueDate=:dueDate"+
    " WHERE id=:id ")
    public  void updateVaccine (
            @Param("id") int id,
            @Param("name") String name,
            @Param("madeIn") String madeIn,
            @Param("madeBy") String madeBy,
            @Param("againstTo") String againstTo,
            @Param("creationDate")Date creationDate,
            @Param("dueDate") Date dueDate
    );
    @Modifying
    @Query (value = "delete  from Vaccines vac where vac.id =:id")
    public void deleteVaccine(@Param("id")int id);
}
