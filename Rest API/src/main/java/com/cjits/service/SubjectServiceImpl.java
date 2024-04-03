package com.cjits.service;

import com.cjits.entity.Subject;
import com.cjits.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public Subject createSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject getSubjectById(Long id) {
        Optional<Subject> optionalSubject = subjectRepository.findById(id);
        return optionalSubject.orElse(null);
    }

    @Override
    public Subject updateSubject(Long id, Subject subject) {
        Subject existingSubject = subjectRepository.findById(id).orElse(null);
        if (existingSubject != null) {
            // Update subject properties
            existingSubject.setName(subject.getName());
            // Save and return updated subject
            return subjectRepository.save(existingSubject);
        }
        return null;
    }

    @Override
    public void deleteSubject(Long id) {
        subjectRepository.deleteById(id);
    }
}