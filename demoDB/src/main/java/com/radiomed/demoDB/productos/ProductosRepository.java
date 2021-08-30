package com.radiomed.demoDB.productos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Long> {
    @Query("SELECT p FROM Productos p WHERE p.title=?1")
    Optional<Productos> findProductByName (String title);

}
