
package com.cjits.service;

import com.cjits.entity.Student;

import java.util.List;

public interface StudentService {
    static List<Student> findByUserType(String userType) {
        return null;
    }

    Student login(String username, String password);



}
