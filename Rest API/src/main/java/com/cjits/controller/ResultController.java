package com.cjits.controller;

import com.cjits.entity.Result;
import com.cjits.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/results")
public class ResultController {

    @Autowired
    private ResultService resultService;

    // Endpoint to add a new result
    @PostMapping
    public ResponseEntity<Result> addResult(@RequestBody Result result) {
        Result savedResult = resultService.saveResult(result);
        return new ResponseEntity<>(savedResult, HttpStatus.CREATED);
    }

    // Endpoint to retrieve all results
    @GetMapping
    public ResponseEntity<List<Result>> getAllResults() {
        List<Result> results = resultService.getAllResults();
        return new ResponseEntity<>(results, HttpStatus.OK);
    }

    // Endpoint to retrieve result by ID
    @GetMapping("{id}")
    public ResponseEntity<Result> getResultById(@PathVariable("id") long id) {
        Result result = resultService.getResultById(id);
        if (result != null) {
            return new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint to update result
    @PutMapping("/{id}")
    public ResponseEntity<Result> updateResult(@PathVariable("id") long id, @RequestBody Result result) {
        Result updatedResult = resultService.updateResult(result, id);
        if (updatedResult != null) {
            return new ResponseEntity<>(updatedResult, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint to delete result
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteResult(@PathVariable("id") long id) {
        resultService.deleteResult(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
