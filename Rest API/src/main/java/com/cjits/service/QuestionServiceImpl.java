package com.cjits.service;

import com.cjits.entity.Question;
import com.cjits.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public Question getQuestionById(long id) {
        Optional<Question> optionalQuestion = questionRepository.findById(id);
        return optionalQuestion.orElse(null);
    }

    @Override
    public Question updateQuestion(Question question, long id) {
        Question existingQuestion = questionRepository.findById(id).orElse(null);
        if (existingQuestion != null) {
            existingQuestion.setQuestionText(question.getQuestionText());
            existingQuestion.setOptionA(question.getOptionA());
            existingQuestion.setOptionB(question.getOptionB());
            existingQuestion.setOptionC(question.getOptionC());
            existingQuestion.setOptionD(question.getOptionD());
            existingQuestion.setCorrectOption(question.getCorrectOption());
            return questionRepository.save(existingQuestion);
        } else {
            return null;
        }
    }

    @Override
    public void deleteQuestion(long id) {
        questionRepository.deleteById(id);
    }

    @Override
    public Question addQuestion(Question question) {
        return null;
    }
}