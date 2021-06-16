package com.intuit.common.filter;

import com.intuit.common.constant.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Optional;
import java.util.UUID;


public class HeaderEnricher {
    private static Logger logger = LoggerFactory.getLogger(HeaderEnricher.class);

    public static boolean isValid(HttpServletRequest request) {
        return Constants.UNWANTED_URL.stream().noneMatch(request.getRequestURI()::contains);
    }

    public static void enrichMDC(HttpServletRequest request) {
        MDC.put(Constants.request_id , getHeader(request, Constants.request_id).orElse(UUID.randomUUID().toString()));
        MDC.put(Constants.customer_id , getHeader(request, Constants.customer_id).orElse(""));
    }

    public static void enrich(HttpServletResponse response) {
        if(!response.containsHeader(Constants.request_id)) {
            response.addHeader(Constants.request_id, MDC.get(Constants.request_id));
        }
        if(!response.containsHeader(Constants.customer_id)) {
            response.addHeader(Constants.customer_id, MDC.get(Constants.customer_id));
        }
    }

    private static Optional<String> getHeader(HttpServletRequest request, String headerName) {
        String headerValue = request.getHeader(headerName);
        if(headerValue==null || headerValue.length()==0) {
            logger.warn("Request did not have header {}" , headerName);
            return Optional.empty();
        }
        return Optional.of(headerValue);
    }
}
