package com.interview.udaan.entity;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "SUBMIT_QUIZ")
public class SubmitQuiz {
    @SequenceGenerator(name = "SUBQUIZ_SEQ" , initialValue = 1,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SUBQUIZ_SEQ")
    @Id
    private int id;

    @Column(name = "QUIZ_ID")
    private int quizId;


    @OneToMany(mappedBy = "question" )
    private Set<SubmitQues> submitQues;

    public SubmitQuiz() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuizId() {
        return quizId;
    }

    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }

    public Set<SubmitQues> getSubmitQues() {
        return submitQues;
    }

    public void setSubmitQues(Set<SubmitQues> submitQues) {
        this.submitQues = submitQues;
    }
}
