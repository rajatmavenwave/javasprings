package org.rj.java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class DrawingApp {

	public static void main(String[] args) {
//		Triangle triangle =  new Triangle();
		
		//Bean Factory Example
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//		Triangle triangle = (Triangle)factory.getBean("triangle");
		
		//Application Context Example
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
		Triangle triangle = (Triangle)context.getBean("triangle");
//(for-alias)		Triangle triangle = (Triangle)context.getBean("triangle-alias");
		triangle.draw();
		
		

	}

}
