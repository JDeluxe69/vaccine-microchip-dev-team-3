/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.care.server.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import smart.care.comm.ContextKeys;

/**
 *
 * @author jakubmol
 */
public class LoginFilter implements Filter {
    
    
    public LoginFilter() {
    }    

    /**
     *
     * @param request The servlet request we are processing
     * @param response The servlet response we are creating
     * @param chain The filter chain we are processing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
    HttpServletRequest httpRequest = (HttpServletRequest)request;
    HttpServletResponse httpResponse = (HttpServletResponse)response;
    HttpSession session = httpRequest.getSession(false);
    
    String loginUri = httpRequest.getContextPath() + "/login"; 
    String registerUri = httpRequest.getContextPath() + "/register"; 
    boolean sessionIsNotNull = (session != null) && (session.getAttribute(ContextKeys.Client) != null);
    String requestUri = httpRequest.getRequestURI(); //TODO: Remove this line 
    boolean loginRequest = httpRequest.getRequestURI().equals(loginUri);
    boolean registerRequest = httpRequest.getRequestURI().equals(registerUri);
       
         if (sessionIsNotNull || loginRequest || registerRequest) {
            chain.doFilter(httpRequest, httpResponse);
        } else {
           httpResponse.sendRedirect(loginUri);
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {
    }

}
