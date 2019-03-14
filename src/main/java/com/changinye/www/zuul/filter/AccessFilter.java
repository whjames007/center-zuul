package com.changinye.www.zuul.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class AccessFilter extends ZuulFilter{
	
	private static Logger logger = LoggerFactory.getLogger(AccessFilter.class);
	

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		RequestContext rc = RequestContext.getCurrentContext();
		HttpServletRequest req = rc.getRequest();
		logger.info("【请求的方法是{}】【请求的路径是{}】", req.getMethod(), req.getRequestURI());
		Object token = req.getHeader("Authorization");
		if (token == null) {
			logger.warn("你的token空空如也。。。");
		} else {
			logger.info("很好，你携带有token！");
		}
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}
