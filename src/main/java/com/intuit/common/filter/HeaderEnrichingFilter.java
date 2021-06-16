package com.intuit.common.filter;

import org.slf4j.MDC;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HeaderEnrichingFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        MDC.clear();
        if(servletRequest instanceof HttpServletRequest
            && servletResponse instanceof HttpServletResponse
            && HeaderEnricher.isValid((HttpServletRequest) servletRequest)) {
            HttpServletRequest request = (HttpServletRequest) servletRequest;
            HttpServletResponse response = (HttpServletResponse) servletResponse;

            HeaderEnricher.enrichMDC(request);
            HeaderEnricher.enrich(response);

            filterChain.doFilter(request, response);
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    public void destroy() {

    }
}
