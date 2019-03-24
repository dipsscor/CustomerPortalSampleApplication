package com.accountmanagement.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguation {

	@Autowired
	ApplicationConfigurationLoader CONFIG;

	// SWAGGER 2.0 INITIATION

			// DOCKET FOR ACCTOMER MANAGEMENT API
			@Bean
			public Docket ACCTomerManagementApi() {
				return new Docket(DocumentationType.SWAGGER_2)
						.groupName("ACCOUNT-MANAGEMENT").select()
						.apis(RequestHandlerSelectors.any())
						.paths(PathSelectors.ant("/ACCOUNT-MANAGEMENT/V1.0/**")).build()
						.apiInfo(accountManagementMetaData());
			}
		

			

			//ACCOUNT MANAGEMENT METADATA
			private ApiInfo accountManagementMetaData() {
				ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
				apiInfoBuilder
						.title(CONFIG.ACCT_MGMT_API_TITLE)
						.description(CONFIG.ACCT_MGMT_API_DESCRIPTION)
						.contact(
								new Contact(CONFIG.ACCT_MGMT_API_CONTACT_NAME, "",
										CONFIG.ACCT_MGMT_API_CONTACT_EMAIL))
						.version(CONFIG.ACCT_MGMT_API_VERSION)
						.termsOfServiceUrl(CONFIG.ACCT_MGMT_API_TERMS_SERVICE_URL)
						.license(CONFIG.ACCT_MGMT_API_LICENSE)
						.licenseUrl(CONFIG.ACCT_MGMT_API_LICENSE_URL);
		
				return apiInfoBuilder.build();
			}
			
			
}
