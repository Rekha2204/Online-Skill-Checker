
package com.cjits.service;
import com.cjits.entity.OnlineSkillsChecker;
import com.cjits.repository.OnlineSkillsCheckerRepository;
import com.cjits.service.OnlineSkillsCheckerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OnlineSkillsCheckerServiceImpl implements OnlineSkillsCheckerService {

    private final OnlineSkillsCheckerRepository onlineSkillsCheckerRepository;

    @Autowired
    public OnlineSkillsCheckerServiceImpl(OnlineSkillsCheckerRepository onlineSkillsCheckerRepository) {
        this.onlineSkillsCheckerRepository = onlineSkillsCheckerRepository;
    }

    @Override
    public OnlineSkillsChecker createOnlineSkillsChecker(OnlineSkillsChecker onlineSkillsChecker) {
        return onlineSkillsCheckerRepository.save(onlineSkillsChecker);
    }

    @Override
    public OnlineSkillsChecker getOnlineSkillsCheckerById(Long id)throws RuntimeException {
        return onlineSkillsCheckerRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("OnlineSkillsChecker not found with id: " + id));
    }

    @Override
    public void updateOnlineSkillsChecker(Long id, OnlineSkillsChecker onlineSkillsChecker)throws RuntimeException {
        OnlineSkillsChecker existingOnlineSkillsChecker = getOnlineSkillsCheckerById(id);
        if (existingOnlineSkillsChecker != null) {
            existingOnlineSkillsChecker.setId(onlineSkillsChecker.getId());
            existingOnlineSkillsChecker.setName(onlineSkillsChecker.getName());
            existingOnlineSkillsChecker.setDescription(onlineSkillsChecker.getDescription());
            onlineSkillsCheckerRepository.save(existingOnlineSkillsChecker);
        } else {
            throw new IllegalArgumentException("OnlineSkillsChecker not found with id: " + id);
        }
    }

    @Override
    public void deleteOnlineSkillsChecker(Long id) {

    }

    @Override
    public List<OnlineSkillsChecker> getAllOnlineSkillsChecker() {
        return null;
    }

    @Override
    public OnlineSkillsChecker findOnlineSkillsCheckerById(long productId) {
        return null;
    }

    @Override
    public List<OnlineSkillsChecker> getAllOnlineSkillsCheckerByName(String name) {
        return onlineSkillsCheckerRepository.findByName(name);
    }


}