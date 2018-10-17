package com.cg.Project.Service;

import java.util.ArrayList;
import java.util.List;

import com.cg.Project.Bean.Candidate;
import com.cg.Project.Bean.JobApplied;
import com.cg.Project.Bean.JobRequirements;




public interface CandidateService {
		
		public String addResume(Candidate candidate)  ;
	
			List<JobRequirements> getJobRequirements() ;

			
					

			int applyForJob(JobApplied job);

			//ArrayList<JobRequirements> findBy(String qualificationRequired,
					//String positionRequired, int experienceRequired,
				//	String jobLocation);

			String modifyResume(Candidate candidate, String candidateId);

}
