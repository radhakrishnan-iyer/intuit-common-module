package com.intuit.common.model.mq;

import com.google.gson.Gson;
import com.intuit.common.model.Request;

import java.io.Serializable;

public class Event implements Serializable {

    private String correlationId;
    private Request request;
    private String customerId;

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String toString() {
        return new Gson().toJson(this);
    }
}
