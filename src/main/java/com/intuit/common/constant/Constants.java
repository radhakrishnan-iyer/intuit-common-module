package com.intuit.common.constant;

import com.google.common.collect.Lists;

import java.util.List;

public class Constants {
    public static final List<String> UNWANTED_URL = Lists.newArrayList("admin" , "swagger", "error", "actuator", "api-docs", "csrf");
    public static final String request_id = "request-id";
    public static final String customer_id = "customer-id";
    public static final String SUCCESS_MESSAGE = "Request is being processed. Kindly check the status using correlationId";
    public static final String ERROR_MESSAGE = "Error while processing the request ";
    public static final String PROFILE_SERVICE_UNAVAILABLE = "Profile Service is currently unavailable. Please try after sometime";
    public static final String PRODUCT_VALIDATION_SUCCESS = "All products have validated the profile create/update operation";
    public static final String PRODUCT_VALIDATION_FAILURE = "One or more products have not validated the profile create/update operation";
    public static final String PRODUCT_VALIDATION_NO_SUBSCRIPTION = "Not subscribed yet to perform create/update profile operation";
    public static final String REQUEST_ACCEPTED = "Request has been accepted by profile service and is being served";
    public static final String PROFILE_CREATED = "Profile has been created/updated successfully";
    public static final String PROFILE_REJECTED = "Profile creation/updation was rejected by one or more products subscribed by the customer";
    public static final String PROFILE_IN_PROGRESS = "Profile creation/updating is still in progress";
}
