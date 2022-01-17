package org.acndemo.intake.models;

import java.sql.Date;

import io.quarkus.mongodb.panache.PanacheMongoEntity;

public class IntakeRecord extends PanacheMongoEntity {
    private String claimNumber;
    private String entryId;
    private Date recordDate;
    
    public String getClaimNumber() {
        return claimNumber;
    }
    public void setClaimNumber(String claimNumber) {
        this.claimNumber = claimNumber;
    }
    public String getEntryId() {
        return entryId;
    }
    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }
    public Date getRecordDate() {
        return recordDate;
    }
    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    
}
