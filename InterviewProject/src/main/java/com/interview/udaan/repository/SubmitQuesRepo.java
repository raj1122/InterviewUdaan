package com.interview.udaan.repository;

import com.interview.udaan.entity.SubmitQues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubmitQuesRepo extends JpaRepository<SubmitQues,Integer> {
}
