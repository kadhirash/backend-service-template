package com.kadhirash.backend_service_template;

import org.springframework.boot.SpringApplication;

public class TestBackendServiceTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.from(BackendServiceTemplateApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
