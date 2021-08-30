package com.radiomed.demoDB.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }//AdminService

    public List<admin> getAdmins() {
        return adminRepository.findAll();
    }//getAdmins

    public admin getAdmin(Long adminId) {
       // return adminRepository.getById(adminId);
        return adminRepository.findById(adminId).orElseThrow(
                () -> new IllegalStateException("User does not exists " + adminId));
    }//getAdmin

    public void deleteAdmin(Long adminId) {
        if (adminRepository.existsById(adminId)) {
            adminRepository.deleteById(adminId);
        } else {
            throw new IllegalStateException("User does not exist" + adminId);
        }//else
    }//deleteAdmin

    public void addAmin(admin admn) {
        Optional<admin> adminByName = adminRepository.findAdminByName(admn.getUsername());
        if (adminByName.isPresent()) {
            throw new IllegalStateException("admin name already exists");
        }//if
        adminRepository.save(admn);
    }//addAdmin

    public void updateAdmin(Long adminId, String oldPassword, String newPassword) {
       // admin admn = adminRepository.getById(adminId);
        if (! adminRepository.existsById(adminId)) {
            throw new IllegalStateException("Admin does not exist " + adminId);
        }//if ! exists
        admin admn = adminRepository.getById(adminId);
        if (! admn.getPassword().equals(oldPassword)) {
            throw new IllegalStateException("Password does not match " + adminId);
        }//if ! exists
        if (newPassword!=null && newPassword.length()>=4 &&
                (! admn.getPassword().equals(newPassword)) &&
                (admn.getPassword().equals(oldPassword)) ) {
            admn.setPassword(newPassword);

            adminRepository.save(admn);
        }//if
    }// updateUser

}//class AdminService
