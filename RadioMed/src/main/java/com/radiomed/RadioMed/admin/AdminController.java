package com.radiomed.RadioMed.admin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/admin")
public class AdminController {
    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }//constructor

    @GetMapping
    public List<Admin> getAdmins(){
        return adminService.getAdmins();
    }//getAdmins

    @GetMapping(path = "{adminId}")
    public Admin getAdmin(@PathVariable("adminId") Long adminId){
        return adminService.getAdmin(adminId);
    }//getAdmin

    @DeleteMapping(path="{adminId}")
    public void deleteAdmin(@PathVariable("adminId") Long adminId){
        adminService.deleteAdmin(adminId);
    }//deleteAdmin

    @PostMapping
    public void addAdmin(@RequestBody Admin admin){
        adminService.addAdmin(admin);
    }//addAdmin

    @PutMapping(path="{adminId}")
    public void updateAdmin(@PathVariable("adminId") Long adminId,
                              @RequestParam(required=false)String name,
                              @RequestParam (required=false)String email,
                              @RequestParam(required = false)String password){
        adminService.updateAdmin(adminId,name,email, password);
    }//updateAdmin


}//AdminController
