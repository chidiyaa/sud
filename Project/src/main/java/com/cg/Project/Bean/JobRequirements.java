package com.cg.Project.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
@Table(name="job_requirements")
public class JobRequirements {
    
@javax.persistence.Id
@Column(name="job_id")
private String jobId;
@Column(name="company_id")
private String companyId;
@Column(name="position_required")
private String positionRequired;
@Column(name="numbers_required")
private int numbersRequired;
@Column(name="experience_required")
private int experienceRequired;
@Column(name="qualification_required")
private String qualificationRequired;
@Column(name="job_location")
private String jobLocation;
@Column(name="job_description")
private String jobDescription;
public String getJobId() {
    return jobId;
}
public void setJobId(String jobId) {
    this.jobId = jobId;
}
public String getCompanyId() {
    return companyId;
}
public void setCompanyId(String companyId) {
    this.companyId = companyId;
}
public String getPositionRequired() {
    return positionRequired;
}
public void setPositionRequired(String positionRequired) {
    this.positionRequired = positionRequired;
}
public int getNumbersRequired() {
    return numbersRequired;
}
public void setNumbersRequired(int numbersRequired) {
    this.numbersRequired = numbersRequired;
}
public int getExperienceRequired() {
    return experienceRequired;
}
public void setExperienceRequired(int experienceRequired) {
    this.experienceRequired = experienceRequired;
}
public String getQualificationRequired() {
    return qualificationRequired;
}
public void setQualificationRequired(String qualificationRequired) {
    this.qualificationRequired = qualificationRequired;
}
public String getJobLocation() {
    return jobLocation;
}
public void setJobLocation(String jobLocation) {
    this.jobLocation = jobLocation;
}
public String getJobDescription() {
    return jobDescription;
}
public void setJobDescription(String jobDescription) {
    this.jobDescription = jobDescription;
}
public JobRequirements() {
    super();
    // TODO Auto-generated constructor stub
}
public JobRequirements(String jobId, String companyId, String positionRequired,
        int numbersRequired, int experienceRequired,
        String qualificationRequired, String jobLocation, String jobDescription) {
    super();
    this.jobId = jobId;
    this.companyId = companyId;
    this.positionRequired = positionRequired;
    this.numbersRequired = numbersRequired;
    this.experienceRequired = experienceRequired;
    this.qualificationRequired = qualificationRequired;
    this.jobLocation = jobLocation;
    this.jobDescription = jobDescription;
}
@Override
public String toString() {
    return "JobRequirements [jobId=" + jobId + ", companyId=" + companyId
            + ", positionRequired=" + positionRequired + ", numbersRequired="
            + numbersRequired + ", experienceRequired=" + experienceRequired
            + ", qualificationRequired=" + qualificationRequired
            + ", jobLocation=" + jobLocation + ", jobDescription="
            + jobDescription + "]";
}


}