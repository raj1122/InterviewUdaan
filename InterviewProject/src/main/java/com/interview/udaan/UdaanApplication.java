package com.interview.udaan;

import com.interview.udaan.entity.Question;
import com.interview.udaan.repository.QuestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UdaanApplication implements CommandLineRunner {


    @Autowired
    QuestRepo questRepo;
    public static void main(String[] args) {
        SpringApplication.run(UdaanApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        createQuestionIfNotFound("Quest1");
        createQuestionIfNotFound("Quest2");
        createQuestionIfNotFound("Quest3");
        createQuestionIfNotFound("Quest4");
    }

    private void createQuestionIfNotFound(String questName) {
        Question question = questRepo.findByQuesName(questName);
        if(question==null)
        {
            question=new Question();
            question.setQuesName(questName);
            questRepo.save(question);
        }

    }
}
