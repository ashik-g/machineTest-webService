package com.faith.app.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Request {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer requestId;
	private String causeTravel;
	private String source;
	private String destination;
	private String mode;
	private LocalDate fromDate;
	private LocalDate toDate;
	private Integer noOfDays;
	private String priority;

	private Integer projectId;
	private Integer empId;
	private String Status;
	
	@JoinColumn(name="projectId",insertable = false,updatable = false)
	@ManyToOne
	private Project project;
	
	@JoinColumn(name="empId",insertable = false,updatable = false)
	@ManyToOne
	private Employee employee;
	
	//parameterized constructors
	public Request(Integer requestId, String causeTravel, String source, String destination, String mode,
			LocalDate fromDate, LocalDate toDate, Integer noOfDays, String priority, Integer projectId, Integer empId,
			String status) {
		super();
		this.requestId = requestId;
		this.causeTravel = causeTravel;
		this.source = source;
		this.destination = destination;
		this.mode = mode;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.noOfDays = noOfDays;
		this.priority = priority;
		this.projectId = projectId;
		this.empId = empId;
		Status = status;
	}

	
	//getters and setters
	public Integer getRequestId() {
		return requestId;
	}

	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
	}

	public String getCauseTravel() {
		return causeTravel;
	}

	public void setCauseTravel(String causeTravel) {
		this.causeTravel = causeTravel;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	public Integer getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(Integer noOfDays) {
		this.noOfDays = noOfDays;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}


	@Override
	public String toString() {
		return "Request [requestId=" + requestId + ", causeTravel=" + causeTravel + ", source=" + source
				+ ", destination=" + destination + ", mode=" + mode + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ ", noOfDays=" + noOfDays + ", priority=" + priority + ", projectId=" + projectId + ", empId=" + empId
				+ ", Status=" + Status + "]";
	}
	
	
	
	
	
}
