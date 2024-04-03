
package com.cjits.service;

import com.cjits.entity.Student;
import com.cjits.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student login(String username, String password) {
        return studentRepository.findByUsernameAndPassword(username, password);
    }
//    @Override
//    public List<Student> findByUserType(String userType) {
//        return studentRepository.findByUserType(userType);
//    }



}


