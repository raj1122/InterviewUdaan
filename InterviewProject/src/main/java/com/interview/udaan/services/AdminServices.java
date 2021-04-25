package com.interview.udaan.services;


import com.interview.udaan.entity.Question;
import com.interview.udaan.repository.QuestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServices {


    @Autowired
    QuestRepo questRepo;

    public Object addQuestion(Question question) {
        return  createQuestionIfNotFound(question.getQuesName());
    }

    private Question createQuestionIfNotFound(String questName) {
        Question question = questRepo.findByQuesName(questName);
        if(question==null)
        {
            question=new Question();
            question.setQuesName(questName);
            questRepo.save(question);
        }
        return question;

    }
}
