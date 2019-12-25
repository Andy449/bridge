package com.nuctech.bridge.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "goods")
public class Goods {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)// 自增长策略
	private Integer id;
	
	@Column(name="label")
	private String label;
	
	@Column(name="description")
	private String description;
	
	@Column(name="image")
	private String image;
	
	@Column(name="score")
	private double score;

	
	public Integer getId() {
		return id;
	}


	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	
}
