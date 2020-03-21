package hr.entity;

public class ConfigMajorKind {
    private Integer mfkId;

    private String majorKindId;

    private String majorKindName;

    public Integer getMfkId() {
        return mfkId;
    }

    public void setMfkId(Integer mfkId) {
        this.mfkId = mfkId;
    }

    public String getMajorKindId() {
        return majorKindId;
    }

    public void setMajorKindId(String majorKindId) {
        this.majorKindId = majorKindId == null ? null : majorKindId.trim();
    }

    public String getMajorKindName() {
        return majorKindName;
    }

    public void setMajorKindName(String majorKindName) {
        this.majorKindName = majorKindName == null ? null : majorKindName.trim();
    }
}