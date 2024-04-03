
package com.cjits.repository;

import com.cjits.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByUsername(String username);

    Student findByUsernameAndPassword(String username, String password);
}