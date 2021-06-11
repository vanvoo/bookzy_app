package com.pied_piper.bookzy_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@SpringBootApplication
public class BookzyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookzyAppApplication.class, args);
	}

}

public class Hello extends HttpServlet implements Servlet {
       
    public Hello() {}

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Servlet Example</title></head>");
        out.println("<body>Hello from a Java Servlet</body>");
        out.println("</html>");
        out.close();
    }
}
