package com.intuit.common.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import com.intuit.common.model.profile.Profile;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Request implements Serializable {
    private static final long serialVersionUID = 10l;

    private String correlationId;
    private Profile profile;

    public Request(){}

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
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
