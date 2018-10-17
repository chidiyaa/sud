package com.cg.Project.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
@Table(name="candidate_qualifications")
public class CandidateQualifications {
	@Id
    @Column(name="qualification_id")
    private String qualificationId;
    @Column(name="qualification_name")
    private String qualificationName;
    @Column(name="specialization_area")
    private String specializationArea;
    @Column(name="college_name")
    private String collegeName;
    @Column(name="university_name")
    private String universityName;
    @Column(name="year_of_passing")
    private String yearOfpassing;
    @Column(name="percentage")
    private double percentage;
    @Column(name="candidate_id")
    private String candidateId;
    public CandidateQualifications(String qualificationId,
            String qualificationName, String specializationArea,
            String collegeName, String universityName, String yearOfpassing,
            double percentage, String candidateId) {
        super();
        this.qualificationId = qualificationId;
        this.qualificationName = qualificationName;
        this.specializationArea = specializationArea;
        this.collegeName = collegeName;
        this.universityName = universityName;
        this.yearOfpassing = yearOfpassing;
        this.percentage = percentage;
        this.candidateId = candidateId;
    }
   
    public CandidateQualifications() {
        super();
    }
    @Override
    public String toString() {
        return "CandidateQualifications [qualificationId=" + qualificationId
                + ", qualificatioName=" + qualificationName
                + ", specializationArea=" + specializationArea
                + ", collegeName=" + collegeName + ", universityName="
                + universityName + ", yearOfpassing=" + yearOfpassing
                + ", percentage=" + percentage + ", candidateId=" + candidateId
                + "]";
    }
    public String getQualificationId() {
        return qualificationId;
    }
    public void setQualificationId(String qualificationId) {
        this.qualificationId = qualificationId;
    }
    public String getQualificationName() {
        return qualificationName;
    }
    public void setQualificationName(String qualificatioName) {
        this.qualificationName = qualificatioName;
    }
    public String getSpecializationArea() {
        return specializationArea;
    }
    public void setSpecializationArea(String specializationArea) {
        this.specializationArea = specializationArea;
    }
    public String getCollegeName() {
        return collegeName;
    }
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    public String getUniversityName() {
        return universityName;
    }
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    public String getYearOfpassing() {
        return yearOfpassing;
    }
    public void setYearOfpassing(String yearOfpassing) {
        this.yearOfpassing = yearOfpassing;
    }
    public double getPercentage() {
        return percentage;
    }
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    public String getCandidateId() {
        return candidateId;
    }
    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }
    
    

}