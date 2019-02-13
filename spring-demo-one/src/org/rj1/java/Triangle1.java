package org.rj1.java;
import java.util.List;
import org.rj1.java.Point1;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


//(8)we are implementing the application context interface so it will call set application context and pass the context to this method and capture the context save it as main variable
public class Triangle1 implements ApplicationContextAware,BeanNameAware {
	
//	(6)initializing list and getting the values from the spring beans
//	private List<Point1> points;
//	public List<Point1> getPoints(){
//		return points;
//	}
//	public void setPoints(List<Point1> points) {
//		this.points = points;
//	}
//	public void draw() {
//		for(Point1 point : points) {
//			System.out.println("Point = ("+point.getX()+","+point.getY()+")");
//		}
		
		
//	(7)auto wiring helps to reduce the configuration that we have to by intelligently

	private Point1 pointA;
	private Point1 pointB;
	private Point1 pointC;
	private ApplicationContext context=null;
	public Point1 getPointA() {
		return pointA;
	}

	public void setPointA(Point1 pointA) {
		this.pointA = pointA;
	}

	public Point1 getPointB() {
		return pointB;
	}

	public void setPointB(Point1 pointB) {
		this.pointB = pointB;
	}

	public Point1 getPointC() {
		return pointC;
	}

	public void setPointC(Point1 pointC) {
		this.pointC = pointC;
	}

 public void draw() {
	 System.out.println("Point A = ("+getPointA().getX()+","+getPointA().getY()+")");
	 System.out.println("Point B = ("+getPointB().getX()+","+getPointB().getY()+")");
	 System.out.println("Point C = ("+getPointC().getX()+","+getPointC().getY()+")");
 }

 
 //(8-b) and also their are other interfaces even publisher aware, bean class loader aware and has their own setter
 
@Override
public void setApplicationContext(ApplicationContext context) throws BeansException {
	this.context=context;
	
}
//(8-c) another interface Bean name aware interface
//it ll call set bean name before the code executes so spring call it itself and print the result before another results
@Override
public void setBeanName(String beanName) {
	System.out.println("Bean name is: "+beanName);
	
}
}


