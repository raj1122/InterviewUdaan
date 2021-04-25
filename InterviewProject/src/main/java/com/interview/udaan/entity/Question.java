package com.interview.udaan.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "QUES")
public class Question {

    @SequenceGenerator(name = "QUES_SEQ" , initialValue = 1,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "QUES_SEQ")
    @Id
    private int id;

    @Column(name = "QUES_NAME")
    private String quesName;


    //intermediate table
    @ManyToMany(mappedBy = "questionSet")
    private Set<Quiz> questionSet;



    public Question() {
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getQuesName() {
        return quesName;
    }

    public void setQuesName(String quesName) {
        this.quesName = quesName;
    }

    public Set<Quiz> getQuestionSet() {
        return questionSet;
    }

    public void setQuestionSet(Set<Quiz> questionSet) {
        this.questionSet = questionSet;
    }


}
