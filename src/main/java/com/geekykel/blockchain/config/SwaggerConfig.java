package com.geekykel.blockchain.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SwaggerConfig {

    // http://localhost:8080/swagger-ui
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.geekykel.blockchain.controller"))
                .paths(PathSelectors.ant("/api/v1/*"))
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Blockchain Demo Project",
                "This is a Blockchain Demo Project.",
                "API V1",
                "Terms of service",
                new Contact("Kelvin Obukome", "http://kelvinator07.github.io", "Kelvinator4leo@gmail.com"),
                "License of API", "API license URL", Collections.emptyList());
    }
}
