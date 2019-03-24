package com.accountmanagement.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;


@Configuration
@PropertySources({
	@PropertySource("classpath:application.properties"),
	@PropertySource("classpath:${config.props.path}/app-config.properties"),
	@PropertySource("classpath:${config.props.path}/swagger-config.properties")
})
public class ApplicationConfigurationLoader {
	
	/**
	 *********** SWAGGER PROPERTIES***********
	 */
	@Value("${api.accountmanagement.title}")
	public String ACCT_MGMT_API_TITLE;
	
	@Value("${api.accountmanagement.description}")
	public String ACCT_MGMT_API_DESCRIPTION;
	
	@Value("${api.accountmanagement.contact.name}")
	public String ACCT_MGMT_API_CONTACT_NAME;
	
	@Value("${api.accountmanagement.contact.email}")
	public String ACCT_MGMT_API_CONTACT_EMAIL;
	
	@Value("${api.accountmanagement.version}")
	public String ACCT_MGMT_API_VERSION;
	
	@Value("${api.accountmanagement.terms_of_service_url}")
	public String ACCT_MGMT_API_TERMS_SERVICE_URL;
	
	@Value("${api.accountmanagement.license}")
	public String ACCT_MGMT_API_LICENSE;
	
	@Value("${api.accountmanagement.license_url}")
	public String ACCT_MGMT_API_LICENSE_URL;	
	
	
	


	
	/**
	 ***************APPLICATION PROPERTIES****************
	 */

	

}
