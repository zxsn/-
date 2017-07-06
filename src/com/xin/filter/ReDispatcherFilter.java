/**  
* @Title:  ReDispatcherFilter.java
* @Package com.xin.filter
* @Description: TODO(用一句话描述该文件做什么)
* @author Hou Dongchang
* @date  2017年5月7日 下午6:03:58
* @version V1.0  
* Update Logs:
* ****************************************************
* Name:
* Date:
* Description:
******************************************************
*/
package com.xin.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: ReDispatcherFilter
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Hou Dongchang
 * @date 2017年5月7日 下午6:03:58
 *
 */
public class ReDispatcherFilter implements Filter {

    private ArrayList<String> includes = new ArrayList<String>();

    /*
     * (非 Javadoc) <p>Title: init</p> <p>Description: </p>
     * 
     * @param filterConfig
     * 
     * @throws ServletException
     * 
     * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
	this.includes.addAll(Arrays.asList(filterConfig.getInitParameter("includeServlets").split(",")));

    }

    /*
     * (非 Javadoc) <p>Title: doFilter</p> <p>Description: </p>
     * 
     * @param request
     * 
     * @param response
     * 
     * @param chain
     * 
     * @throws IOException
     * 
     * @throws ServletException
     * 
     * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest,
     * javax.servlet.ServletResponse, javax.servlet.FilterChain)
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
	    throws IOException, ServletException {
	HttpServletRequest req = (HttpServletRequest) request;
	String target = req.getRequestURI();
	target = target.lastIndexOf("?") > 0
		? target.substring(target.lastIndexOf("/") + 1, target.lastIndexOf("?") - target.lastIndexOf("/"))
		: target.substring(target.lastIndexOf("/") + 1);
	System.out.println(target);
	if (this.includes.contains(target)) {
	    RequestDispatcher rdsp = request.getRequestDispatcher(target);
	    System.out.println("go..............." + rdsp);
	    rdsp.forward(req, response);
	} else
	    chain.doFilter(req, response);

    }

    /*
     * (非 Javadoc) <p>Title: destroy</p> <p>Description: </p>
     * 
     * @see javax.servlet.Filter#destroy()
     */
    @Override
    public void destroy() {

    }

}
