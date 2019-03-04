package com.spring.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class DoctorIdGenerator implements IdentifierGenerator {

@Override
public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
	 String prefix = "Doc";
	    Connection connection = session.connection();
	    String generatedId="empty";
	    try {
	        Statement statement=connection.createStatement();

	        ResultSet rs=statement.executeQuery("select count(DoctorId) as Id from Doctor_Hcs");
	        if(rs.next())
	        {
	            int id=rs.getInt(1)+101;
	            generatedId = prefix + new Integer(id).toString();
	            return generatedId;
	        }
	    } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	return generatedId;
}
}
