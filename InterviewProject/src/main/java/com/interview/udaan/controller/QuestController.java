package com.interview.udaan.controller;


import com.interview.udaan.entity.Question;
import com.interview.udaan.services.AdminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
@RequestMapping("question")
public class QuestController {

    @Autowired
    AdminServices adminServices;
    @PostMapping()

    public ResponseEntity<Object> addQuestion(Question question)
    {
        return new ResponseEntity(adminServices.addQuestion(question), HttpStatus.OK);
    }
}
