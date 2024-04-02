package com.ktga.SpringMVCAnnotation.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.ktga.SpringMVCAnnotation.AnnotationConfig;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {AnnotationConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"} ;
	}

}
