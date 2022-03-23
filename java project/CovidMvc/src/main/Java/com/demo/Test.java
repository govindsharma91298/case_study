package com.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Test {
	
	@RequestMapping("/covid")
	public ModelAndView subt(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","Deadp00l");
		Statement stmt = conn.createStatement();
		
		
		
		//String s = rs.getString("location");
		Map<String, Integer> m1 = new HashMap();
		String s = request.getParameter("t1");
		
		ResultSet rs = stmt.executeQuery(s);
		while(rs.next()) {
			m1.put(rs.getString("location"), rs.getInt("count"));
		}
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("s", m1);
		
		return mv;
	}
}
	

