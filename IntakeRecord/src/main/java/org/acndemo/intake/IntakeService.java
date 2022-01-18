package org.acndemo.intake;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acndemo.intake.models.IntakeRecord;
import org.acndemo.intake.models.IntakeRecordRepository;

@Path("/IntakeRecord")
@Produces(MediaType.APPLICATION_JSON)
public class IntakeService {

    private IntakeRecordRepository inTakeRep;

    @Inject
    public IntakeService(IntakeRecordRepository repo) {
        this.inTakeRep = repo;
    }

    @GET
    @Path("/{id}")
    public IntakeRecord get(@PathParam("id") String iid) {
        return inTakeRep.findById(iid);
    }

    @GET
    public List<IntakeRecord> list() {
        return inTakeRep.listAll();
    }

    @GET
    @Path("/{claimnumber}")
    public IntakeRecord searchClaim(@PathParam("claimnumber") String clnumber) {
        return inTakeRep.findByClaimNumber(clnumber);
    }
}