package hr.entity;

import java.util.Date;


import com.fasterxml.jackson.annotation.JsonFormat;

public class ConfigMajorDesignation {
    private Integer desId;

    private Integer desFfkId;

    private Integer desFskId;

    private Integer desFtkId;

    private Integer desRecId;

    private Integer desMfkId;

    private Integer desMakId;

    private Integer desNum;
   //标签形式处理json中的日期格式
  	@JsonFormat(pattern="yyyy-MM-dd")
    private Date desExpirationDate;

    private String desUser;
    //标签形式处理json中的日期格式
  	@JsonFormat(pattern="yyyy-MM-dd")
    private Date desRecordDate;

    private String desDescription;

    private String desRequire;
    
    //二级结构对象
    private ConfigFileSecondKind second;

    //职业名称表
    private ConfigMajor major;
    
    //招聘类型表
    private ConfigRecruitmentType type;
    
    
    
    
    public ConfigRecruitmentType getType() {
		return type;
	}

	public void setType(ConfigRecruitmentType type) {
		this.type = type;
	}

	public ConfigFileSecondKind getSecond() {
		return second;
	}

	public void setSecond(ConfigFileSecondKind second) {
		this.second = second;
	}

	public ConfigMajor getMajor() {
		return major;
	}

	public void setMajor(ConfigMajor major) {
		this.major = major;
	}

	public Integer getDesId() {
        return desId;
    }

    public void setDesId(Integer desId) {
        this.desId = desId;
    }

    public Integer getDesFfkId() {
        return desFfkId;
    }

    public void setDesFfkId(Integer desFfkId) {
        this.desFfkId = desFfkId;
    }

    public Integer getDesFskId() {
        return desFskId;
    }

    public void setDesFskId(Integer desFskId) {
        this.desFskId = desFskId;
    }

    public Integer getDesFtkId() {
        return desFtkId;
    }

    public void setDesFtkId(Integer desFtkId) {
        this.desFtkId = desFtkId;
    }

    public Integer getDesRecId() {
        return desRecId;
    }

    public void setDesRecId(Integer desRecId) {
        this.desRecId = desRecId;
    }

    public Integer getDesMfkId() {
        return desMfkId;
    }

    public void setDesMfkId(Integer desMfkId) {
        this.desMfkId = desMfkId;
    }

    public Integer getDesMakId() {
        return desMakId;
    }

    public void setDesMakId(Integer desMakId) {
        this.desMakId = desMakId;
    }

    public Integer getDesNum() {
        return desNum;
    }

    public void setDesNum(Integer desNum) {
        this.desNum = desNum;
    }

    public Date getDesExpirationDate() {
        return desExpirationDate;
    }

    public void setDesExpirationDate(Date desExpirationDate) {
        this.desExpirationDate = desExpirationDate;
    }

    public String getDesUser() {
        return desUser;
    }

    public void setDesUser(String desUser) {
        this.desUser = desUser == null ? null : desUser.trim();
    }

    public Date getDesRecordDate() {
        return desRecordDate;
    }

    public void setDesRecordDate(Date desRecordDate) {
        this.desRecordDate = desRecordDate;
    }

    public String getDesDescription() {
        return desDescription;
    }

    public void setDesDescription(String desDescription) {
        this.desDescription = desDescription == null ? null : desDescription.trim();
    }

    public String getDesRequire() {
        return desRequire;
    }

    public void setDesRequire(String desRequire) {
        this.desRequire = desRequire == null ? null : desRequire.trim();
    }

	@Override
	public String toString() {
		return "ConfigMajorDesignation [desId=" + desId + ", desFfkId=" + desFfkId + ", desFskId=" + desFskId
				+ ", desFtkId=" + desFtkId + ", desRecId=" + desRecId + ", desMfkId=" + desMfkId + ", desMakId="
				+ desMakId + ", desNum=" + desNum + ", desExpirationDate=" + desExpirationDate + ", desUser=" + desUser
				+ ", desRecordDate=" + desRecordDate + ", desDescription=" + desDescription + ", desRequire="
				+ desRequire + "]";
	}

	public ConfigMajorDesignation(Integer desFfkId, Integer desFskId, Integer desFtkId, Integer desRecId,
			Integer desMfkId, Integer desMakId, Integer desNum, Date desExpirationDate, String desUser,
			Date desRecordDate, String desDescription, String desRequire) {
		super();
		this.desFfkId = desFfkId;
		this.desFskId = desFskId;
		this.desFtkId = desFtkId;
		this.desRecId = desRecId;
		this.desMfkId = desMfkId;
		this.desMakId = desMakId;
		this.desNum = desNum;
		this.desExpirationDate = desExpirationDate;
		this.desUser = desUser;
		this.desRecordDate = desRecordDate;
		this.desDescription = desDescription;
		this.desRequire = desRequire;
	}

	public ConfigMajorDesignation() {
		super();
	}
    
}