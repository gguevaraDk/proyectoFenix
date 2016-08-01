package com.premize.samples.web.jsf.prime.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.premize.pmz.api.util.UrlAplicacionHolder;

/**
 * Filtro para obtener la url de la aplicacion y colocarla en el threadlocal
 * para poder ser utilizada en el envio de notificaciones.
 * 
 * @author <a href="mailto:jorge.middleton@gmail.com">Jorge L. Middleton</a>
 * @date Jan 6, 2011
 * 
 */
public class UrlAplicacionFilter implements Filter {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(UrlAplicacionFilter.class);

	public UrlAplicacionFilter() {
	}

	public void init(FilterConfig filterConfig) throws ServletException {
	    LOGGER.info("init");
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		if (UrlAplicacionHolder.getInstance().getUrl() == null) {

			String scheme = request.getScheme(); // http
			String serverName = request.getServerName(); // hostname.com
			int serverPort = request.getServerPort(); // 80
			String contextPath = ((HttpServletRequest) request)
					.getContextPath(); // /mywebapp

			String url = scheme + "://" + serverName
					+ (serverPort > 0 ?":"+serverPort:"") + contextPath;
			UrlAplicacionHolder.getInstance().setUrl(url);
		}

		chain.doFilter(request, response);
	}

	public void destroy() {
	    LOGGER.info("destroy");
	}

}
