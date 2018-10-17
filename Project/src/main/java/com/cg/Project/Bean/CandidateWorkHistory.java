package com.cg.Project.Bean;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
@Table(name="candidate_work_history")
public class CandidateWorkHistory {
	@Id
    @Column(name="work_id")
    private String workId;
    @Column(name="candidate_Id")
    private String candidateId;
    @Column(name="which_Employer")
    private String whichEmployer;
    @Column(name="contact_person")
    private String contactPerson;
    @Column(name="position_held")
    private String positionHeld;
    @Column(name="company_name")
    private String companyName;
    @Column(name="employment_from")
    private LocalDate employmentFrom;
    @Column(name="employment_to")
    private LocalDate employmentTo;
    @Column(name="reason_For_Leaving")
    private String reasonForLeaving;
    @Column(name="responsibilities")
    private String responsibilities;
    @Column(name="hr_rep_name")
    private String hrRepName;
    @Column(name="hr_rep_contact_num")
    private String hrRepContactNum;
    public String getWorkId() {
        return workId;
    }
    public void setWorkId(String workId) {
        this.workId = workId;
    }
    public String getCandidateId() {
        return candidateId;
    }
    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }
    public String getWhichEmployer() {
        return whichEmployer;
    }
    public void setWhichEmployer(String whichEmployer) {
        this.whichEmployer = whichEmployer;
    }
    public String getContactPerson() {
        return contactPerson;
    }
    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }
    public String getPositionHeld() {
        return positionHeld;
    }
    public void setPositionHeld(String positionHeld) {
        this.positionHeld = positionHeld;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public LocalDate getEmploymentFrom() {
        return employmentFrom;
    }
    public void setEmploymentFrom(LocalDate employmentFrom) {
        this.employmentFrom = employmentFrom;
    }
    public LocalDate getEmploymentTo() {
        return employmentTo;
    }
    public void setEmploymentTo(LocalDate employmentTo) {
        this.employmentTo = employmentTo;
    }
    public String getReasonForLeaving() {
        return reasonForLeaving;
    }
    public void setReasonForLeaving(String reasonForLeaving) {
        this.reasonForLeaving = reasonForLeaving;
    }
    public String getResponsibilities() {
        return responsibilities;
    }
    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }
    public String getHrRepName() {
        return hrRepName;
    }
    public void setHrRepName(String hrRepName) {
        this.hrRepName = hrRepName;
    }
    public String getHrRepContactNum() {
        return hrRepContactNum;
    }
    public void setHrRepContactNum(String hrRepContactNum) {
        this.hrRepContactNum = hrRepContactNum;
    }
    public CandidateWorkHistory(String workId, String candidateId,
            String whichEmployer, String contactPerson, String positionHeld,
            String companyName, LocalDate employmentFrom, LocalDate employmentTo,
            String reasonForLeaving, String responsibilities, String hrRepName,
            String hrRepContactNum) {
        super();
        this.workId = workId;
        this.candidateId = candidateId;
        this.whichEmployer = whichEmployer;
        this.contactPerson = contactPerson;
        this.positionHeld = positionHeld;
        this.companyName = companyName;
        this.employmentFrom = employmentFrom;
        this.employmentTo = employmentTo;
        this.reasonForLeaving = reasonForLeaving;
        this.responsibilities = responsibilities;
        this.hrRepName = hrRepName;
        this.hrRepContactNum = hrRepContactNum;
    }
    public CandidateWorkHistory() {
    }
    @Override
    public String toString() {
        return "CandidateWorkHistory [workId=" + workId + ", candidateId="
                + candidateId + ", whichEmployer=" + whichEmployer
                + ", contactPerson=" + contactPerson + ", positionHeld="
                + positionHeld + ", companyName=" + companyName
                + ", employmentFrom=" + employmentFrom + ", employmentTo="
                + employmentTo + ", reasonForLeaving=" + reasonForLeaving
                + ", responsibilities=" + responsibilities + ", hrRepName="
                + hrRepName + ", hrRepContactNum=" + hrRepContactNum + "]";
    }
}


