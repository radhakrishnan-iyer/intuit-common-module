package com.intuit.common.model.mq;

import com.google.gson.Gson;
import com.intuit.common.model.Request;

import java.io.Serializable;

public class EventReply implements Serializable {

    private String correlationId;
    private boolean isValid;
    private String customerId;
    private String message;
    private Request request;

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public String toString() {
        return new Gson().toJson(this);
    }
}
