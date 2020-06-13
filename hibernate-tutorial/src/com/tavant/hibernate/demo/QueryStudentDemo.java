package com.tavant.hibernate.demo;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.tavant.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args)

	{

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.openSession();

		try {

			session.beginTransaction();
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			displayStudents(theStudents);
			theStudents = session.createQuery("from Student s where s.lastName='kumar'").getResultList();
			System.out.println("\n\nStudents who have last name of kumar");
			displayStudents(theStudents);
			theStudents = session.createQuery("from Student s where" + " s.lastName='bhaiya' OR s.firstName='vikram'")
					.getResultList();
			System.out.println("\n\nStudents who have last name of bhaiya OR first name vikram");
			displayStudents(theStudents);
			theStudents = session.createQuery("from Student s where" + " s.email LIKE '%gmail.com'").getResultList();
			System.out.println("\n\nStudents whose email ends with gmail.com");
			displayStudents(theStudents);
			session.getTransaction().commit();
			System.out.println("Done!");

		} finally {
			factory.close();
		}
	}

	private static void displayStudents(List<Student> theStudents) {
		
		
		theStudents.forEach(e->System.out.println(e));
	}

}
