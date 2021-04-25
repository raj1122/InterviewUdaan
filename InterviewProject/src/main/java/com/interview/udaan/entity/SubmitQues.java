package com.interview.udaan.entity;

import javax.persistence.*;


@Entity
@Table(name = "SUBMIT_QUES")
public class SubmitQues {

    @SequenceGenerator(name = "SUBQUES_SEQ" , initialValue = 1,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SUBQUES_SEQ")
    @Id
    private int id;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ques_id", referencedColumnName = "id")
    private  Question question;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "option_id", referencedColumnName = "id")
    private  Options options;

    public SubmitQues() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }
}
