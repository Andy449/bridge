package com.nuctech.bridge.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dangerous")
public class Dangerous {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)// 自增长策略
	private Integer id;
	
	@Column(name = "label")
	private String label;
	
	@Column(name = "confidence")
	private double confidence;

	public Integer getId() {
		return id;
	}


	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public double getConfidence() {
		return confidence;
	}

	public void setConfidence(double confidence) {
		this.confidence = confidence;
	}
}
