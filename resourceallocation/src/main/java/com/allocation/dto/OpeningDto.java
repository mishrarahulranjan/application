package com.allocation.dto;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Team
 * @Date 24-06-2016
 *
 */
@XmlRootElement
public class OpeningDto {
	
	double requestID;
	
	String clientKey;
	
	String projectKey;
	
	String customerName;
	
	String projectName;
	
	boolean isKeyProject;
	
	List<String> projectDomain;
	
	Date projectStartDate;
	
	Date projectEndDate;
	
	String role;
	
	boolean isKeyPosition;
	
	double yearsOfExperience;
	
	List<String> mandatorySkills;
	
	List<String> optionalSkills;
	
	List<String> domainExperience;
	
	String clientCommunication;
	
	List<String> CertificationRequirement;
	
	Date requestStartDate;
	
	Date allocationStartDate;
	
	Date allocationEndDate;
	
	double billingRate;
	
	double billingAllocation;
	
	public double getRequestID() {
		return requestID;
	}

	public void setRequestID(double requestID) {
		this.requestID = requestID;
	}

	public String getClientKey() {
		return clientKey;
	}

	public void setClientKey(String clientKey) {
		this.clientKey = clientKey;
	}

	public String getProjectKey() {
		return projectKey;
	}

	public void setProjectKey(String projectKey) {
		this.projectKey = projectKey;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public boolean isKeyProject() {
		return isKeyProject;
	}

	public void setKeyProject(boolean isKeyProject) {
		this.isKeyProject = isKeyProject;
	}

	public List<String> getProjectDomain() {
		return projectDomain;
	}

	public void setProjectDomain(List<String> projectDomain) {
		this.projectDomain = projectDomain;
	}

	public Date getProjectStartDate() {
		return projectStartDate;
	}

	public void setProjectStartDate(Date projectStartDate) {
		this.projectStartDate = projectStartDate;
	}

	public Date getProjectEndDate() {
		return projectEndDate;
	}

	public void setProjectEndDate(Date projectEndDate) {
		this.projectEndDate = projectEndDate;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isKeyPosition() {
		return isKeyPosition;
	}

	public void setKeyPosition(boolean isKeyPosition) {
		this.isKeyPosition = isKeyPosition;
	}

	public double getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(double yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public List<String> getMandatorySkills() {
		return mandatorySkills;
	}

	public void setMandatorySkills(List<String> mandatorySkills) {
		this.mandatorySkills = mandatorySkills;
	}

	public List<String> getOptionalSkills() {
		return optionalSkills;
	}

	public void setOptionalSkills(List<String> optionalSkills) {
		this.optionalSkills = optionalSkills;
	}

	public List<String> getDomainExperience() {
		return domainExperience;
	}

	public void setDomainExperience(List<String> domainExperience) {
		this.domainExperience = domainExperience;
	}

	public String getClientCommunication() {
		return clientCommunication;
	}

	public void setClientCommunication(String clientCommunication) {
		this.clientCommunication = clientCommunication;
	}

	public List<String> getCertificationRequirement() {
		return CertificationRequirement;
	}

	public void setCertificationRequirement(List<String> certificationRequirement) {
		CertificationRequirement = certificationRequirement;
	}

	public Date getRequestStartDate() {
		return requestStartDate;
	}

	public void setRequestStartDate(Date requestStartDate) {
		this.requestStartDate = requestStartDate;
	}

	public Date getAllocationStartDate() {
		return allocationStartDate;
	}

	public void setAllocationStartDate(Date allocationStartDate) {
		this.allocationStartDate = allocationStartDate;
	}

	public Date getAllocationEndDate() {
		return allocationEndDate;
	}

	public void setAllocationEndDate(Date allocationEndDate) {
		this.allocationEndDate = allocationEndDate;
	}

	public double getBillingRate() {
		return billingRate;
	}

	public void setBillingRate(double billingRate) {
		this.billingRate = billingRate;
	}

	public double getBillingAllocation() {
		return billingAllocation;
	}

	public void setBillingAllocation(double billingAllocation) {
		this.billingAllocation = billingAllocation;
	}
}
