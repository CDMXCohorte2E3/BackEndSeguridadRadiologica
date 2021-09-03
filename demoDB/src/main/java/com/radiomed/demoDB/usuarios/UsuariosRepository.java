package com.radiomed.demoDB.usuarios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuariosRepository extends JpaRepository <Usuarios,Long> {
    @Query("SELECT u FROM Usuarios u WHERE u.email=?1")
    Optional<Usuarios> findUserByEmail(String email);

}//UsuariosRepository

//public interface Usuarios extends JpaRepository<Usuarios, Long>{
//    @Query("SELECT u FROM LoginData u WHERE u.email=")
//}
