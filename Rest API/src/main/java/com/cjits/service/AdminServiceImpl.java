
package com.cjits.service;

import com.cjits.entity.Admin;
import com.cjits.repository.AdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin login(String username, String password) {
        return adminRepository.findByUsernameAndPassword(username, password);
    }


//    public List<Admin> findByUserType(String userType) {
//        return adminRepository.findByUserType(userType);
//    }



}



