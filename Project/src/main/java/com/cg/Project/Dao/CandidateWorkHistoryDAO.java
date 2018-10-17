package com.cg.Project.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.Project.Bean.CandidateWorkHistory;



public interface CandidateWorkHistoryDAO extends JpaRepository <CandidateWorkHistory,String> {


}