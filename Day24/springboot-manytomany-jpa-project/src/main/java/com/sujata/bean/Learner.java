package com.sujata.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
public class Learner {
	@Id
	private String learnerId;
	private String learnerName;
	@ManyToMany  //One learner is being taught by many trainers
	private List<Trainer> trainers=new ArrayList<>();
	
	public Learner() {
		super();
		
	}
	public Learner(String learnerId, String learnerName) {
		super();
		this.learnerId = learnerId;
		this.learnerName = learnerName;
	}
	public String getLearnerId() {
		return learnerId;
	}
	public void setLearnerId(String learnerId) {
		this.learnerId = learnerId;
	}
	public String getLearnerName() {
		return learnerName;
	}
	public void setLearnerName(String learnerName) {
		this.learnerName = learnerName;
	}
	public List<Trainer> getTrainers() {
		return trainers;
	}
	public void setTrainers(List<Trainer> trainers) {
		this.trainers = trainers;
	}
	
	
}
