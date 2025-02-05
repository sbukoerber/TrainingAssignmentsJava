package com.springboot.config;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(
                title = "EmployeeDetail app",
                description = "Training project",
                version = "v1",
                contact = @Contact(
                        name = "Anil",
                        email = "anil@gmail.com",
                        url = ""
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.cbre.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description =  "",
                url = "https://www.xyz.com/swagger-ui.html"
        )
)
@Configuration
public class SwaggerConfig {
}