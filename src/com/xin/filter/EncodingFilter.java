package com.xin.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * 字符集乱码过滤器
 */
public class EncodingFilter implements Filter {

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 服务器端反馈给客户端资源没有乱码：
		response.setContentType("text/html;charset=UTF-8");

		String method = ((HttpServletRequest) request).getMethod();
		if ("GET".equals(method.toUpperCase())) {
			// get方式
			//request = new MyHttpServletRequestWrapper((HttpServletRequest) request);
		} else if ("POST".equals(method.toUpperCase())) {
			// post方式
			request.setCharacterEncoding("UTF-8");
		}

		// 必须放行
		chain.doFilter(request, response);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.Filter#destroy()
	 */
	@Override
	public void destroy() {

	}

}
