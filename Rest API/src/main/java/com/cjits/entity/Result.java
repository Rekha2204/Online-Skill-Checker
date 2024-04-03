package com.cjits.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="result1")
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resultId; // Changed to resultId

    private Long userId;
    private Long subjectId;
    private Long levelId;
    private String performance;
    private String performanceDate;
    private String grade;
    private String feedback;

    // Constructors, getters, and setters

    public Result() {
    }

    public Result(Long userId, Long subjectId, Long levelId, String performance, String performanceDate, String grade, String feedback) {
        this.userId = userId;
        this.subjectId = subjectId;
        this.levelId = levelId;
        this.performance = performance;
        this.performanceDate = performanceDate;
        this.grade = grade;
        this.feedback = feedback;
    }

    public Long getResultId() {
        return resultId;
    }

    public void setResultId(Long resultId) {
        this.resultId = resultId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public Long getLevelId() {
        return levelId;
    }

    public void setLevelId(Long levelId) {
        this.levelId = levelId;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public String getPerformanceDate() {
        return performanceDate;
    }

    public void setPerformanceDate(String performanceDate) {
        this.performanceDate = performanceDate;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "Result{" +
                "resultId=" + resultId +
                ", userId=" + userId +
                ", subjectId=" + subjectId +
                ", levelId=" + levelId +
                ", performance='" + performance + '\'' +
                ", performanceDate=" + performanceDate +
                ", grade='" + grade + '\'' +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
