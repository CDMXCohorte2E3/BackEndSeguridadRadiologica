package com.radiomed.demoDB.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path="api/admin/")
public class adminController {
    private  final AdminService adminService;

    @Autowired
    public adminController(AdminService adminService) {
        this.adminService = adminService;
    }//constructor

    @GetMapping
    public List<admin> getAdmins(){
        return adminService.getAdmins();
    }//getAdmins

    @GetMapping(path="{adminId}")
    public admin getAdmin(@PathVariable("adminId") Long adminId){
        return (admin) adminService.getAdmin(adminId);
    }//getAdmin

    @DeleteMapping(path = "{adminId}")
    public void deleteAdmin(@PathVariable("adminId") Long adminId){
        adminService.deleteAdmin(adminId);
    }//deleteAdmin

    @PostMapping
    public void addAdmin(@RequestBody admin admn){
        adminService.addAmin(admn);
    }//addAdmin

    @PutMapping(path="{adminId}")
    public void updateAdmin(@PathVariable("adminId") Long adminId,
        @RequestParam String oldPassword,
        @RequestParam String newPassword){
        adminService.updateAdmin(adminId, oldPassword,newPassword);
    }//updateAdmin


}//adminController
