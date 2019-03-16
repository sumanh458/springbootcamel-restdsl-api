package com.service;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicLong;

import com.example.pojo.Student;

public class ServiceImpl implements Service {

	@Override
	public Student getStudent(String name) throws Exception {
		final AtomicLong counter = new AtomicLong();
		// ResourceBundle rb=ResourceBundle.getBundle("com.utils.details");
		String subject = null;
		if (name.equalsIgnoreCase("Suman"))
			subject = "Maths";
		else if (name.equalsIgnoreCase("Minu"))
			subject = "Benagali";
		else
			subject = "Mechanical";

		return new Student(counter.incrementAndGet(), name, subject);
	}

}
