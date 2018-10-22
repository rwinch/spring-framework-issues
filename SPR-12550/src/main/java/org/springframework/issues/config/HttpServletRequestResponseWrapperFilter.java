package org.springframework.issues.config;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;

/**
 * @author Rob Winch
 */
public class HttpServletRequestResponseWrapperFilter extends OncePerRequestFilter {
	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		if(request.getParameter("wrapRequest") != null) {
			request = new HttpServletRequestWrapper(request){};
		}
		if(request.getParameter("wrapResponse") != null) {
			response = new HttpServletResponseWrapper(response){};
		}

		filterChain.doFilter(request, response);
	}
}
