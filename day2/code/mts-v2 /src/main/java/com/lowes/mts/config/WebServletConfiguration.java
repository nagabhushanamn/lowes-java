package com.lowes.mts.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebServletConfiguration implements WebApplicationInitializer {

	public void onStartup(ServletContext context) throws ServletException {

		System.out.println("onStartup");

		// Root WebApplicationContext
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(MTSConfig.class);
		ContextLoaderListener contextLoaderListener = new ContextLoaderListener(rootContext);
		context.addListener(contextLoaderListener);

		// Child WebApplicationContext
		AnnotationConfigWebApplicationContext webCtx = new AnnotationConfigWebApplicationContext();
		webCtx.register(WebConfig.class);
		webCtx.setServletContext(context);

		ServletRegistration.Dynamic servlet = context.addServlet("dispatcher", new DispatcherServlet(webCtx));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("*.htm");

	}

}
