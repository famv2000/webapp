package fam.v.coursework.repositories;

import fam.v.coursework.models.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


//@Repository
public interface WarehousesRepositories extends JpaRepository<Warehouse, Integer> {

    List<Warehouse> findByName(String warehouseName);
}
