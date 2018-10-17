package com.cg.Project.Controller;

import java.util.ArrayList;
import java.util.List;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Project.Bean.Candidate;
import com.cg.Project.Bean.JobApplied;
import com.cg.Project.Bean.JobRequirements;
import com.cg.Project.Service.CandidateService;



@RestController
@RequestMapping("/candidate")
public class CandidateController {
	@Autowired
	CandidateService service;
	/*@GetMapping("/find/{qual}/{pos}/{exp}/{loc}")
	public ArrayList<JobRequirements> find(@PathVariable("qual") String qualification,
			@PathVariable("pos") String position,@PathVariable("exp")  int experience,@PathVariable("loc") String location)
	{
		return service.findBy(qualification,position, experience,location);
	}*/
	@PostMapping("/insert")
	public String insert(@RequestBody Candidate e)
	{String s=service.addResume(e);
		
		return s;
	}
	@PostMapping("/modify/{cId}")
	public String modify(@PathVariable("cId") String candidateId,@RequestBody Candidate e)
	{String s=service.modifyResume(e,candidateId);
		
		return s;
	}
	@PostMapping("/apply")
	public String insert(@RequestBody JobApplied e)
	{
		service.applyForJob(e);
		return "SUCCESS";
	}
@GetMapping("/allJob")
public List<JobRequirements> getJobRequirements(){
	return service.getJobRequirements();
	
	
}
}
