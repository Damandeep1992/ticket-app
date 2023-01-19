package com.gl.bedgroupassign.ticketapp.util;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ApplicationConfiguration implements CommandLineRunner{
	
	@Autowired
	private ApplicationContext applicationContext;

	@Override
	public void run(String... args) throws Exception {
		//System.out.println("Hello World");
//		String[] beanNameArray= this.applicationContext.getBeanDefinitionNames();
//		Stream.of(beanNameArray).forEach(bean -> System.out.println(bean));
	}

}
