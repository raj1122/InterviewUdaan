package com.interview.udaan.repository;


import com.interview.udaan.entity.SubmitQuiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubQuizRepo extends JpaRepository<SubmitQuiz,Integer> {
}
