package com.cg.Project.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.Project.Bean.CandidatePersonal;



public interface CandidatePersonalDAO extends JpaRepository <CandidatePersonal,String> {


}