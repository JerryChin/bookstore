package com.example.init;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * Created by Developer on 2016/9/14.
 */
@Configuration //Specifies the class as configuration
@ComponentScan("com.example") //Specifies which package to scan
@EnableWebMvc //Enables to use Spring's annotations in the code
@Import({ WebStaticResConfig.class, InfrastructureConfig.class})
public class WebAppConfig {
    @Bean
    public UrlBasedViewResolver setupViewResolver() {
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();
        resolver.setPrefix("/WEB-INF/pages/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }

}