package com.allocation.dto;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Team
 * @date 24-06-2016
 *
 */
@XmlRootElement
public class ResourceDto {

	String sno;
	
	String employeeID;
	
	String employeeName;
	
	Date doj;
	
	List<String> skills;
	
	List<String> domainExperience;
	
	String rating;
	
	String communicationsRating;
	
	String nagp;
	
	List<String> certifications;
	
	double yearsOfExperience;
	
	String currentRole;
	
	List<String> PreviousCustomerExperience;
	
	double Costperhour;
	
	Date availableFromDate;
	
	public String getSno() {
		return sno;
	}
	
	public void setSno(String sno) {
		this.sno = sno;
	}
	
	public String getEmployeeID() {
		return employeeID;
	}
	
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public Date getDoj() {
		return doj;
	}
	
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	
	public List<String> getSkills() {
		return skills;
	}
	
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	
	public List<String> getDomainExperience() {
		return domainExperience;
	}
	
	public void setDomainExperience(List<String> domainExperience) {
		this.domainExperience = domainExperience;
	}
	
	public String getRating() {
		return rating;
	}
	
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public String getCommunicationsRating() {
		return communicationsRating;
	}
	
	public void setCommunicationsRating(String communicationsRating) {
		this.communicationsRating = communicationsRating;
	}
	
	public String getNagp() {
		return nagp;
	}
	
	public void setNagp(String nagp) {
		this.nagp = nagp;
	}
	
	public List<String> getCertifications() {
		return certifications;
	}
	
	public void setCertifications(List<String> certifications) {
		this.certifications = certifications;
	}
	
	public double getYearsOfExperience() {
		return yearsOfExperience;
	}
	
	public void setYearsOfExperience(double yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public String getCurrentRole() {
		return currentRole;
	}
	
	public void setCurrentRole(String currentRole) {
		this.currentRole = currentRole;
	}
	
	public List<String> getPreviousCustomerExperience() {
		return PreviousCustomerExperience;
	}
	
	public void setPreviousCustomerExperience(
			List<String> previousCustomerExperience) {
		PreviousCustomerExperience = previousCustomerExperience;
	}
	
	public double getCostperhour() {
		return Costperhour;
	}
	
	public void setCostperhour(double costperhour) {
		Costperhour = costperhour;
	}
	
	public Date getAvailableFromDate() {
		return availableFromDate;
	}
	
	public void setAvailableFromDate(Date availableFromDate) {
		this.availableFromDate = availableFromDate;
	}
}
