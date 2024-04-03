package com.cjits.controller;

import com.cjits.entity.OnlineSkillsChecker;
import com.cjits.service.OnlineSkillsCheckerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/api/levels")
public class OnlineSkillsCheckerController {

    private final OnlineSkillsCheckerService onlineSkillsCheckerService;

    @Autowired
    public OnlineSkillsCheckerController(OnlineSkillsCheckerService onlineSkillsCheckerService) {
        this.onlineSkillsCheckerService = onlineSkillsCheckerService;
    }

    @PostMapping
    public ResponseEntity<OnlineSkillsChecker> createOnlineSkillsChecker(@RequestBody OnlineSkillsChecker onlineSkillsChecker) {
        OnlineSkillsChecker createdOnlineSkillsChecker = onlineSkillsCheckerService.createOnlineSkillsChecker(onlineSkillsChecker);
        return new ResponseEntity<>(createdOnlineSkillsChecker, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<OnlineSkillsChecker>> getAllOnlineSkillsChecker() {
        List<OnlineSkillsChecker> onlineSkillsCheckers = onlineSkillsCheckerService.getAllOnlineSkillsChecker();
        return new ResponseEntity<>(onlineSkillsCheckers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OnlineSkillsChecker> getOnlineSkillsCheckerById(@PathVariable Long id) {
        try {
            OnlineSkillsChecker onlineSkillsChecker = onlineSkillsCheckerService.getOnlineSkillsCheckerById(id);
            return new ResponseEntity<>(onlineSkillsChecker, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateOnlineSkillsChecker(@PathVariable Long id, @RequestBody OnlineSkillsChecker onlineSkillsChecker) {
        try {
            onlineSkillsCheckerService.updateOnlineSkillsChecker(id, onlineSkillsChecker);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOnlineSkillsChecker(@PathVariable Long id) {
        onlineSkillsCheckerService.deleteOnlineSkillsChecker(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @GetMapping("/byName/{name}")
    public ResponseEntity<List<OnlineSkillsChecker>> getAllOnlineSkillsCheckerByName(@PathVariable String name) {
        List<OnlineSkillsChecker> onlineSkillsCheckers = onlineSkillsCheckerService.getAllOnlineSkillsCheckerByName(name);
        if (onlineSkillsCheckers.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(onlineSkillsCheckers, HttpStatus.OK);
        }
    }
}
