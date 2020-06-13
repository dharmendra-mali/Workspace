package com.tavant.hibernate.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tavant.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.openSession();

		try {
			System.out.println("Create new 3 student object");
			Student student = new Student("kabhu", "chodry", "kabhu@gamil.com");

			/*
			 * Student student1 = new Student("kalin", "bhaiya",
			 * "kalin@gmail.com"); Student student2 = new Student("munaa",
			 * "bhaiya", "munaa@email"); Student student3 = new Student("godu",
			 * "bhaiya", "godu@email");
			 */
			session.beginTransaction();
			System.out.println("save the student");
			System.out.println(student);
			session.save(student);
			/*
			 * session.save(student1); session.save(student2);
			 * session.save(student3);
			 */
			session.getTransaction().commit();
			System.out.println("Done!");

			System.out.println("save student . generate id: " + student.getId());
			session = factory.openSession();
			session.beginTransaction();
			Student std = session.get(Student.class, student.getId());
			System.out.println("get completed!" + std);
			session.getTransaction().commit();
			System.out.println("Done!");

		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			factory.close();
		}

	}

}
