package com.sujata.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
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
	@ManyToOne //Many learners can have one trainer
	private Trainer trainer;
	
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
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	
	
	
}
