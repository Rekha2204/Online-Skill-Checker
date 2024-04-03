
package com.cjits.repository;

import com.cjits.entity.OnlineSkillsChecker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OnlineSkillsCheckerRepository extends JpaRepository<OnlineSkillsChecker, Long> {
    List<OnlineSkillsChecker> findByName(String name);

    // Additional custom queries can be added here
}