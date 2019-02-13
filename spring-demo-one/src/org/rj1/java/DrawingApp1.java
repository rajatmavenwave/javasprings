package org.rj1.java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class DrawingApp1 {

	public static void main(String[] args) {
		//application context is used only once and also we r using getbean method once and it ll be populated by the spring itself
		ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml"); 
		Triangle1 triangle = (Triangle1)context.getBean("triangle2");

		triangle.draw();
		
		

	}

}
