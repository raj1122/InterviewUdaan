package com.interview.udaan.entity;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "QUIZ")
public class Quiz {

    @SequenceGenerator(name = "QUIZ_SEQ" , initialValue = 1,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "QUIZ_SEQ")
    @Id
    private int id;

    @Column(name = "QUIZ_NAME")
    private String quizName;


    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(
            name = "QUIZ_QUES",
            joinColumns = @JoinColumn(
                    name = "quiz_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "ques_id", referencedColumnName = "id"))
    private Set<Question> questionSet;

    public Quiz() {
    }

    public Quiz(int id, String quizName, Set<Question> questionSet) {
        this.id = id;
        this.quizName = quizName;
        this.questionSet = questionSet;
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

    public Set<Question> getQuestionSet() {
        return questionSet;
    }

    public void setQuestionSet(Set<Question> questionSet) {
        this.questionSet = questionSet;
    }
}
