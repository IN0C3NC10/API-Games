package com.in0c3nc10.games.games.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.in0c3nc10.games"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo("Documentation for API - Games",
                "These are a simple documentation for you understand exactly what my API can do, let's go? Starting, you can see the Endpoints, with these 'fellas' you can know what method and your syntax, if need a parameter or not anyway, for search data from my API. After that we have the Models, in our case, we just have one 'Games' and if you click in him it's possible see their attributes. Well, it's so simple right? Then 'let's rock'!",
                "v1.0.0",
                "https://github.com/IN0C3NC10",
                new Contact("Bruno Inocêncio", "https://github.com/IN0C3NC10", "bruno.inocencio@fatec.sp.gov.br"),
                "License",
                "https://github.com/IN0C3NC10",
                Collections.emptyList());
    }
}