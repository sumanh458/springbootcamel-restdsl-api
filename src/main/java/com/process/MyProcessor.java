package com.process;

import java.util.concurrent.atomic.AtomicLong;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.example.pojo.Student;
import com.service.Service;
import com.service.ServiceImpl;

public class MyProcessor implements Processor{
	final AtomicLong counter = new AtomicLong();
	@Override
	public void process(Exchange exchange) throws Exception {
		final String name=exchange.getIn().getHeader("name",String.class);
		//Suman
		Service service=new ServiceImpl();
		Student student=service.getStudent(name);
		//Suman
		exchange.getIn().setBody(student);
		
	}

}
