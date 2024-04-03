package com.cjits.service;

import com.cjits.entity.Result;

import java.util.List;

public interface ResultService {

    Result saveResult(Result result);

    List<Result> getAllResults();

    Result getResultById(long id);

    Result updateResult(Result result, long id);

    void deleteResult(long id);
}
