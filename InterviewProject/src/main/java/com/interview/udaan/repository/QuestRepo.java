package com.interview.udaan.repository;

import com.interview.udaan.entity.Options;
import com.interview.udaan.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface QuestRepo extends JpaRepository<Question,Integer> {

    Question findByQuesName(String qname);
}
