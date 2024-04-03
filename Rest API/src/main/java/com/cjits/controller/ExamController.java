package com.cjits.controller;

import com.cjits.entity.Exam;
import com.cjits.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exams")
public class ExamController {

    @Autowired
    private ExamService examService;

    // Endpoint to add a new exam
    @PostMapping
    public ResponseEntity<Exam> addExam(@RequestBody Exam exam) {
        Exam savedExam = examService.saveExam(exam);
        return new ResponseEntity<>(savedExam, HttpStatus.CREATED);
    }

    // Endpoint to retrieve all exams
    @GetMapping
    public ResponseEntity<List<Exam>> getAllExams() {
        List<Exam> exams = examService.getAllExams();
        return new ResponseEntity<>(exams, HttpStatus.OK);
    }

    // Endpoint to retrieve exam by ID
    @GetMapping("/{id}")
    public ResponseEntity<Exam> getExamById(@PathVariable("id") long id) {
        Exam exam = examService.getExamById(id);
        if (exam != null) {
            return new ResponseEntity<>(exam, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint to update exam
    @PutMapping("/{id}")
    public ResponseEntity<Exam> updateExam(@PathVariable("id") long id, @RequestBody Exam exam) {
        Exam updatedExam = examService.updateExam(exam, id);
        if (updatedExam != null) {
            return new ResponseEntity<>(updatedExam, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint to delete exam
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExam(@PathVariable("id") long id) {
        examService.deleteExam(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
