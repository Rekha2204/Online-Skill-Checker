package com.cjits.controller;

import com.cjits.entity.Question;
import com.cjits.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    // Endpoint to add a new question
    @PostMapping
    public ResponseEntity<Question> saveQuestion(@RequestBody Question question) {
//        logger.warning("question:"+question);
        Question savedQuestion = questionService.addQuestion(question);
        return new ResponseEntity<Question>(questionService.saveQuestion(question), HttpStatus.CREATED);
    }

    // Endpoint to retrieve all questions
    @GetMapping
    public ResponseEntity<List<Question>> getAllQuestions() {
        List<Question> questions = questionService.getAllQuestions();
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }

    // Endpoint to retrieve question by ID
    @GetMapping("/{id}")
    public ResponseEntity<Question> getQuestionById(@PathVariable("id") Long id) {
        Question question = questionService.getQuestionById(id);
        if (question != null) {
            return new ResponseEntity<>(question, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint to update question
    @PutMapping("/{id}")
    public ResponseEntity<Question> updateQuestion(@PathVariable("id") Long id, @RequestBody Question question) {
        Question updatedQuestion = questionService.updateQuestion(question, id);
        if (updatedQuestion != null) {
            return new ResponseEntity<>(updatedQuestion, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint to delete question
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuestion(@PathVariable("id") Long id) {
        questionService.deleteQuestion(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
