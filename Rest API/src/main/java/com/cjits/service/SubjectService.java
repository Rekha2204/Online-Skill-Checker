package com.cjits.service;

import com.cjits.entity.Subject;

import java.util.List;

public interface SubjectService {
    Subject createSubject(Subject subject);

    List<Subject> getAllSubjects();

    Subject getSubjectById(Long id);

    Subject updateSubject(Long id, Subject subject);

    void deleteSubject(Long id);
}