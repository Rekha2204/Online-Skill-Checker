package com.cjits.service;

import com.cjits.entity.Question;

import java.util.List;

public interface QuestionService {

    Question saveQuestion(Question question);

    List<Question> getAllQuestions();

    Question getQuestionById(long id);

    Question updateQuestion(Question question, long id);

    void deleteQuestion(long id);

    Question addQuestion(Question question);
}