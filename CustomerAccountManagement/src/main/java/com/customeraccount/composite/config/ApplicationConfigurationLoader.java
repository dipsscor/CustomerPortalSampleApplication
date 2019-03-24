package com.customeraccount.composite.config;

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
	@Value("${api.custacctreg.title}")
	public String API_TITLE;
	
	@Value("${api.custacctreg.description}")
	public String API_DESCRIPTION;
	
	@Value("${api.custacctreg.contact.name}")
	public String API_CONTACT_NAME;
	
	@Value("${api.custacctreg.contact.email}")
	public String API_CONTACT_EMAIL;
	
	@Value("${api.custacctreg.version}")
	public String API_VERSION;
	
	@Value("${api.custacctreg.terms_of_service_url}")
	public String API_TERMS_SERVICE_URL;
	
	@Value("${api.custacctreg.license}")
	public String API_LICENSE;
	
	@Value("${api.custacctreg.license_url}")
	public String API_LICENSE_URL;	
	
	
	


	
	/**
	 ***************APPLICATION PROPERTIES****************
	 */

	

}
