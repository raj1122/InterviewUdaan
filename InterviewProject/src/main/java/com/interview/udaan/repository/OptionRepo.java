package com.interview.udaan.repository;


import com.interview.udaan.entity.Options;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionRepo extends JpaRepository<Options,Integer> {
}
