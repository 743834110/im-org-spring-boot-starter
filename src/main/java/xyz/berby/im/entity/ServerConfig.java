package xyz.berby.im.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "server_config", schema = "imServer")
public class ServerConfig {
    private String configId;
    private String mappingKey;
    private String mappingValue;
    private String createPerson;
    private Timestamp createTime;
    private String modifyPerson;
    private Timestamp modifyTime;

    @Id
    @Column(name = "config_id")
    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    @Basic
    @Column(name = "mapping_key")
    public String getMappingKey() {
        return mappingKey;
    }

    public void setMappingKey(String mappingKey) {
        this.mappingKey = mappingKey;
    }

    @Basic
    @Column(name = "mapping_value")
    public String getMappingValue() {
        return mappingValue;
    }

    public void setMappingValue(String mappingValue) {
        this.mappingValue = mappingValue;
    }

    @Basic
    @Column(name = "create_person")
    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "modify_person")
    public String getModifyPerson() {
        return modifyPerson;
    }

    public void setModifyPerson(String modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    @Basic
    @Column(name = "modify_time")
    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServerConfig that = (ServerConfig) o;

        if (configId != null ? !configId.equals(that.configId) : that.configId != null) return false;
        if (mappingKey != null ? !mappingKey.equals(that.mappingKey) : that.mappingKey != null) return false;
        if (mappingValue != null ? !mappingValue.equals(that.mappingValue) : that.mappingValue != null) return false;
        if (createPerson != null ? !createPerson.equals(that.createPerson) : that.createPerson != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (modifyPerson != null ? !modifyPerson.equals(that.modifyPerson) : that.modifyPerson != null) return false;
        if (modifyTime != null ? !modifyTime.equals(that.modifyTime) : that.modifyTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = configId != null ? configId.hashCode() : 0;
        result = 31 * result + (mappingKey != null ? mappingKey.hashCode() : 0);
        result = 31 * result + (mappingValue != null ? mappingValue.hashCode() : 0);
        result = 31 * result + (createPerson != null ? createPerson.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (modifyPerson != null ? modifyPerson.hashCode() : 0);
        result = 31 * result + (modifyTime != null ? modifyTime.hashCode() : 0);
        return result;
    }
}
