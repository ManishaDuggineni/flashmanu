package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class loginDao {
	String query=" select * from student where uname=? and pass=? ";
	     public boolean check(String uname, String pass) {
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/logindata","root","manisha");
	            PreparedStatement st= con.prepareStatement(query);
				st.setString(1, uname);
				st.setString(2, pass);
				ResultSet rs=st.executeQuery();
				if(rs.next())
				{
					return true;
					
				}
				}catch(Exception e)
				{ System.out.println(e);}
			
			
				return false;
			
		}


	}


