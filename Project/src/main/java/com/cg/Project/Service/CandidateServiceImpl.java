package com.cg.Project.Service;

import java.util.ArrayList;
import java.util.List;
















import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Project.Bean.Candidate;
import com.cg.Project.Bean.JobApplied;
import com.cg.Project.Bean.JobRequirements;
import com.cg.Project.Dao.CandidatePersonalDAO;
import com.cg.Project.Dao.CandidateQualificationsDAO;
import com.cg.Project.Dao.CandidateWorkHistoryDAO;
import com.cg.Project.Dao.JobAppliedDao;
import com.cg.Project.Dao.JobRequirementsDao;



@Service

public class CandidateServiceImpl implements CandidateService {
	
	@Autowired
	CandidatePersonalDAO cpdao;
	@Autowired
	CandidateQualificationsDAO cqdao;
	@Autowired
	CandidateWorkHistoryDAO cwkdao;
	@Autowired
	JobRequirementsDao jdao;
	@Autowired
	JobAppliedDao jao;
	
	/*// Search for jobs based on qualification, position, years of experience,location
	@Override
	public ArrayList<JobRequirements> findBy(String qualification,
			String position, int experience,String location) {
		
          
            return jdao.findBy(qualification,position,experience,location);
       
	}*/
	
	// Add Resume
	@Override
	public String addResume(Candidate candidate)  {
		
			if(cpdao.existsById(candidate.getCandidatePersonal().getCandidateId())){
					return "resume already exists";
		}
			else{
		 cpdao.save(candidate.getCandidatePersonal());
		 cqdao.save(candidate.getCandidateQualifications());
		 cwkdao.save(candidate.getCandidateWorkHistory());
			}
		return "Resume added";
	}
	
	//Modify Resume
	@Override
	public String modifyResume(Candidate candidate,String candidateId) {
		// TODO Auto-generated method stub
		if(cpdao.existsById(candidate.getCandidatePersonal().getCandidateId())){
			 cpdao.save(candidate.getCandidatePersonal());
			 cqdao.save(candidate.getCandidateQualifications());
			 cwkdao.save(candidate.getCandidateWorkHistory());
}
	else{
return "Resume does not exists";
	}
		return "Resume updated";
	}
	
	//Apply for job
	@Override
	public int applyForJob(JobApplied job)
			 {
		jao.save(job);
		return 1;
	}
	

	
	//Candidate to get job requirements of the company
	@Override
	public List<JobRequirements> getJobRequirements()
			 {
		// TODO Auto-generated method stub
		return  jdao.findAll();
	}



	

}
