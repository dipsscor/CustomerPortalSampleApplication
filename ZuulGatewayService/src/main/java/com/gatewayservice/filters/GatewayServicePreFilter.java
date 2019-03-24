package com.gatewayservice.filters;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Configuration;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Configuration
public class GatewayServicePreFilter extends ZuulFilter{

	@Override
	public String filterType() {
		return "pre";
	}
	
	@Override
	public int filterOrder() {
		return 1;  // PRE FILTER ORDER .THIS IS THE FIRST PRE FILTER
	}
	
	@Override
	public boolean shouldFilter() {
		return true;
	}

	
	@Override
	public Object run() {

	    RequestContext ctx = RequestContext.getCurrentContext();
	    HttpServletRequest request = ctx.getRequest();
	    
	    System.out.println(String.format("%s Pre Filter: request to %s", request.getMethod(), request.getRequestURL().toString()));
		return null;
	}
	
	

}
