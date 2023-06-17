package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Testing {

	public static void main(String[] args) {
	Resource res=new ClassPathResource("cfg.xml");
	BeanFactory bf=new XmlBeanFactory(res);
	Student s=(Student)bf.getBean("std");
	System.out.println(s);
	}

}
