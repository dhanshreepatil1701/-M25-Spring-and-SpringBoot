package org.tnsindia.springbeans;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//driver class
public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*StudentDAO obj=new StudentDAO();
		obj.selectALLrows();*/
		
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		StudentDAO s1=c.getBean("studentdao",StudentDAO.class);
		s1.selectALLrows();
		
	}

}