
package com.cjits.service;

import com.cjits.entity.OnlineSkillsChecker;

import java.util.List;

public interface OnlineSkillsCheckerService {
    OnlineSkillsChecker createOnlineSkillsChecker(OnlineSkillsChecker onlineSkillsChecker);
    OnlineSkillsChecker getOnlineSkillsCheckerById(Long id)throws RuntimeException;
    void updateOnlineSkillsChecker(Long id, OnlineSkillsChecker onlineSkillsChecker)throws RuntimeException;
    void deleteOnlineSkillsChecker(Long id);

    List<OnlineSkillsChecker> getAllOnlineSkillsChecker();

    OnlineSkillsChecker findOnlineSkillsCheckerById(long productId);
    List<OnlineSkillsChecker> getAllOnlineSkillsCheckerByName(String name);
}