package com.radiomed.demoDB.admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository <admin, Long> {

    @Query("SELECT u FROM admin u WHERE u.username=?1")
    Optional <admin> findAdminByName(String username);
}//interfaz
