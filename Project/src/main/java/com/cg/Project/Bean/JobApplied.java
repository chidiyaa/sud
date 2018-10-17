package com.cg.Project.Bean;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.annotation.Id;


@Entity
@XmlRootElement
@Table(name="job_Applied")
public class JobApplied {
	private String jobId;
	@javax.persistence.Id
	private String candidateId;
	public JobApplied() {
		super();
	}
	public JobApplied(String jobId, String candidateId) {
		super();
		this.jobId = jobId;
		this.candidateId = candidateId;
	}
	@Override
	public String toString() {
		return "JobApplied [jobId=" + jobId + ", candidateId=" + candidateId
				+ "]";
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}

}
