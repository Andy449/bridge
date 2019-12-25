package com.nuctech.bridge.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_operation")
public class UserOperation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)// 自增长策略
	private Integer id;
	
	@Column(name = "user_id")
	private Integer userId;
	
	@Column(name = "mode_type")
	private String modeType;
	
	@Column(name = "result_id")
	private Integer resultId;
	
	@Column(name = "isaccept")
	private Integer isaccept;
	
	@Column(name = "createtime")
	private Date createTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getModeType() {
		return modeType;
	}

	public void setModeType(String modeType) {
		this.modeType = modeType;
	}

	public Integer getResultId() {
		return resultId;
	}

	public void setResultId(Integer resultId) {
		this.resultId = resultId;
	}

	public Integer getIsaccept() {
		return isaccept;
	}

	public void setIsaccept(Integer isaccept) {
		this.isaccept = isaccept;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
}
