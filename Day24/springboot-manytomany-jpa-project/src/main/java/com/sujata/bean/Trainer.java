package com.sujata.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
public class Trainer {

	@Id
	private String trainerId;
	private String trainerName;
	
	public Trainer() {
		
	}

	public Trainer(String trainerId, String trainerName) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
	}

	public String getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	
	
	
}
