package com.intuit.common.config;

import com.intuit.common.filter.HeaderEnrichingFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

public class WebConfig {

    @Bean
    public FilterRegistrationBean<HeaderEnrichingFilter> headerFilter() {
        FilterRegistrationBean<HeaderEnrichingFilter> headerFilter = new FilterRegistrationBean();
        headerFilter.setFilter(new HeaderEnrichingFilter());
        headerFilter.addUrlPatterns("/*");
        return headerFilter;
    }
}
