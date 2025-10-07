package com.qsp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Driver {

	public static void main(String[] args) {
	Resource resource=new ClassPathResource("config.xml");
	BeanFactory factory=new XmlBeanFactory(resource);
	
	Student s=(Student)factory.getBean("myStudent");
	s.study();

	}

}
