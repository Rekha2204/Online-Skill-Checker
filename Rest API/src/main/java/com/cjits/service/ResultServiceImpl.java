package com.cjits.service;

import com.cjits.entity.Result;
import com.cjits.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResultServiceImpl implements ResultService {

    @Autowired
    private ResultRepository resultRepository;

    @Override
    public Result saveResult(Result result) {
        return resultRepository.save(result);
    }

    @Override
    public List<Result> getAllResults() {
        return resultRepository.findAll();
    }

    @Override
    public Result getResultById(long id) {
        Optional<Result> optionalResult = resultRepository.findById(id);
        return optionalResult.orElse(null);
    }

    @Override
    public Result updateResult(Result result, long id) {
        Result existingResult = resultRepository.findById(id).orElse(null);
        if (existingResult != null) {
            existingResult.setUserId(result.getUserId());
            existingResult.setSubjectId(result.getSubjectId());
            existingResult.setLevelId(result.getLevelId());
            existingResult.setPerformance(result.getPerformance());
            existingResult.setPerformanceDate(result.getPerformanceDate());
            existingResult.setGrade(result.getGrade());
            existingResult.setFeedback(result.getFeedback());
            return resultRepository.save(existingResult);
        } else {
            return null;
        }
    }

    @Override
    public void deleteResult(long id) {
        resultRepository.deleteById(id);
    }
}
