package com.intuit.common.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import com.intuit.common.model.profile.Profile;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response implements Serializable {
    private static final long serialVersionUID = 120;

    private String correlationId;
    private String message;
    private String transactionStatus;
    private String profileId;
    private Profile profile;

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String toString() {
        return new Gson().toJson(this);
    }
}
