package org.acndemo.intake.models;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.mongodb.panache.PanacheMongoRepository;

@ApplicationScoped
public class IntakeRecordRepository implements PanacheMongoRepository<IntakeRecord> {
    public List<IntakeRecord> findAllIntakeRecords() {
        return listAll();
    }

    public IntakeRecord findByClaimNumber(String claimNumber) {
        return find("claimNumber", claimNumber).firstResult();
    }

    public IntakeRecord findById(String iid) {
        return find("entryId", iid).firstResult();
    }
}
