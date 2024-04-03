package com.cjits.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "question_text")
    private String questionText;

    @Column(name = "optionA")
    private String optionA;

    @Column(name = "optionB")
    private String optionB;

    @Column(name = "optionC")
    private String optionC;

    @Column(name = "optionD")
    private String optionD;

    @Column(name = "correct_option")
    private String correctOption;

    // Constructors, getters, and setters

    public Question() {
    }

//    public Question(String questionText, String optionA, String optionB, String optionC, String optionD, String correctOption) {
//        this.questionText = questionText;
//        this.optionA = optionA;
//        this.optionB = optionB;
//        this.optionC = optionC;
//        this.optionD = optionD;
//        this.correctOption = correctOption;
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getCorrectOption() {
        return correctOption;
    }

    public void setCorrectOption(String correctOption) {
        this.correctOption = correctOption;
    }

    @Override
    public String toString() {
        return  id +
                ", " + questionText +
                ", " + optionA +
                ", " + optionB +
                ", " + optionC +
                ", " + optionD +
                ", " + correctOption ;
    }
}