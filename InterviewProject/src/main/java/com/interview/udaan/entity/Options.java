package com.interview.udaan.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.interview.udaan.constants.OPTIONSELECTED;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Collections;
import java.util.Set;

@Entity
@Table(name = "OPTIONS")
public class Options {

    @SequenceGenerator(name = "OPT_SEQ" , initialValue = 1,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "OPT_SEQ")
    @Id
    private int id;


    @Column(name = "OPTION_NAME")
    private String quizName;

    @Column(name = "OPTION_SELECTED")
    private OPTIONSELECTED optionselected;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="QUESTION_ID",referencedColumnName="id")
    @OnDelete(action = OnDeleteAction.CASCADE)
//    @JsonIgnore
    private Question question;


//    @ManyToOne(fetch = FetchType.LAZY)
//    @JsonIgnore
//    @JoinColumn(referencedColumnName = "ques_id",foreignKey = "id")
//    private Collections<Question> questionSet;

    public Options() {
    }


    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public OPTIONSELECTED getOptionselected() {
        return optionselected;
    }

    public void setOptionselected(OPTIONSELECTED optionselected) {
        this.optionselected = optionselected;
    }

}
