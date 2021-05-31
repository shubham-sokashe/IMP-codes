package com.qickStart.demo.HIbernateFirstDemo;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class TestHibernateDemo {
	
	
	public static void main(String[] args) {
		
		Configuration hbCfg = new Configuration();
		hbCfg.configure("hibernate.cfg.xml");
		SessionFactory stuDBSessFac = hbCfg.buildSessionFactory();
		Session session1 = stuDBSessFac.openSession();
		StudentPersistentClass student1 = new StudentPersistentClass();
		student1.setStudentId(102);
		student1.setStudentName("Aniket Shinde");
		student1.setStudentAddress("Islampur");
		student1.setStudentMarks(90);
		
		Transaction firstTran = session1.beginTransaction();
		session1.save(student1);
		System.out.println("|||||||||||| Student object has successfully ||||||||||||||||");
		firstTran.commit();
		session1.close();
		stuDBSessFac.close();
		
		
		
		
		
	}

}
