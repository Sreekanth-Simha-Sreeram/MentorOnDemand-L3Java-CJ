package com.mentor.hibernate.application;

import java.io.InputStream;
import java.security.cert.LDAPCertStoreParameters;

import javax.servlet.ServletContext;

import org.hibernate.engine.jdbc.internal.LogicalConnectionImpl;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mentor.hibernate.dao.LoginServiceDao;
import com.mentor.hibernate.dao.LoginServiceDaoImpl;


public class App {
	
	static LoginServiceDao ld;

	
	
	
	  public static void main( String[] args )
	    {
		  	ld = new LoginServiceDaoImpl();
		  	
		  	
	        System.out.println(ld.signIn("M", "M"));
	        

	       
	    }

}
