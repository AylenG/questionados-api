package com.app.Questionados.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
	
	private final static String BASE_PACKAGE = "com.github.sanchezih.ownblog.controller";

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)//
				.select()//
				.apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))//
				.paths(PathSelectors.any()) //
				.build().apiInfo(getApiInfo()); //
	}

	private ApiInfo getApiInfo() {
		return new ApiInfoBuilder() //
				.title("Questionados API") //
				.version("1.0.0") //
				.description("Api de preguntas y respuestas estilo 'Preguntados'") //
				.termsOfServiceUrl("http://en.wikipedia.org/wiki/Terms_of_service") //
				.contact(new Contact("Aylen Paula Gomez", "https://github.com/AylenG", "aylen.p.gomez@gmail.com")) //
				.license("Apache License Version 2.0").licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html") //
				.build();
	}
	
}
