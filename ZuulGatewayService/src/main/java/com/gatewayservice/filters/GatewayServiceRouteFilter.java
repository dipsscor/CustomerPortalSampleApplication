package com.gatewayservice.filters;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Configuration;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Configuration
public class GatewayServiceRouteFilter extends ZuulFilter{
	

	@Override
	public String filterType() {
		return "route";
	}
	
	@Override
	public int filterOrder() {
		return 1;  // ROUTE FILTER ORDER .THIS IS THE FIRST ROUTE FILTER
	}
	
	@Override
	public boolean shouldFilter() {
		return true;
	}

	
	@Override
	public Object run() {

	    RequestContext ctx = RequestContext.getCurrentContext();
	    HttpServletRequest request = ctx.getRequest();
	    
	    System.out.println(String.format("%s Route Filter : request to %s", request.getMethod(), request.getRequestURL().toString()));
		return null;
	}

}
