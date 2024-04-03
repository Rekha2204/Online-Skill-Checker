package com.cjits.service;

import com.cjits.entity.Exam;

import java.util.List;

public interface ExamService {

    Exam saveExam(Exam exam);

    List<Exam> getAllExams();

    Exam getExamById(long id);

    Exam updateExam(Exam exam, long id);

    void deleteExam(long id);
}
