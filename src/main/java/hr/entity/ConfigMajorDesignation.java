package hr.entity;

import java.util.Date;

public class ConfigMajorDesignation {
    private Integer desId;

    private Integer desFfkId;

    private Integer desFskId;

    private Integer desFtkId;

    private Integer desRecId;

    private Integer desMfkId;

    private Integer desMakId;

    private Integer desNum;

    private Date desExpirationDate;

    private String desUser;

    private Date desRecordDate;

    private String desDescription;

    private String desRequire;

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
}