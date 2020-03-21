package hr.entity;

public class ConfigPrimaryKey {
    private Integer prkId;

    private String primaryKeyTable;

    private String primaryKey;

    private String keyName;

    private Integer primaryKeyStatus;

    public Integer getPrkId() {
        return prkId;
    }

    public void setPrkId(Integer prkId) {
        this.prkId = prkId;
    }

    public String getPrimaryKeyTable() {
        return primaryKeyTable;
    }

    public void setPrimaryKeyTable(String primaryKeyTable) {
        this.primaryKeyTable = primaryKeyTable == null ? null : primaryKeyTable.trim();
    }

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey == null ? null : primaryKey.trim();
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName == null ? null : keyName.trim();
    }

    public Integer getPrimaryKeyStatus() {
        return primaryKeyStatus;
    }

    public void setPrimaryKeyStatus(Integer primaryKeyStatus) {
        this.primaryKeyStatus = primaryKeyStatus;
    }
}