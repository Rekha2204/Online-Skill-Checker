package com.cjits.service;

import com.cjits.entity.Exam;
import com.cjits.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExamServiceImpl implements ExamService {

    @Autowired
    private ExamRepository examRepository;

    @Override
    public Exam saveExam(Exam exam) {
        return examRepository.save(exam);
    }

    @Override
    public List<Exam> getAllExams() {
        return examRepository.findAll();
    }

    @Override
    public Exam getExamById(long id) {
        Optional<Exam> optionalExam = examRepository.findById(id);
        return optionalExam.orElse(null);
    }

    @Override
    public Exam updateExam(Exam exam, long id) {
        Exam existingExam = examRepository.findById(id).orElse(null);
        if (existingExam != null) {
            existingExam.setName(exam.getName());
            existingExam.setDescription(exam.getDescription());
            existingExam.setDurationMinutes(exam.getDurationMinutes());
            existingExam.setTotalMarks(exam.getTotalMarks());
            existingExam.setPassingMarks(exam.getPassingMarks());
            existingExam.setStartTime(exam.getStartTime());
            existingExam.setEndTime(exam.getEndTime());
            existingExam.setInstructions(exam.getInstructions());
            existingExam.setStatus(exam.getStatus());
            return examRepository.save(existingExam);
        } else {
            return null;
        }
    }

    @Override
    public void deleteExam(long id) {
        examRepository.deleteById(id);
    }
}
