package com.thaseenjsp;

	import java.io.IOException;
	import java.io.PrintWriter;

	import jakarta.servlet.RequestDispatcher;
	import jakarta.servlet.ServletException;
	import jakarta.servlet.annotation.WebServlet;
	import jakarta.servlet.http.Cookie;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;
	import jakarta.servlet.http.HttpSession;

	@WebServlet("/add")

	public class AddServlet extends HttpServlet
	{
		public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
		{
			int i = Integer.parseInt(req.getParameter("num1"));
			int j = Integer.parseInt(req.getParameter("num2"));
			
			int k = i+j;
			
			
			PrintWriter out  = res.getWriter();
//			out.print("<html><body bgcolor='gold'>");
//			out.print("<div class='contain'>");
//			out.print("<div class='Result' style='background-color:red; height:20vh; width:30%; margin-left:25%; margin-top:10%; text-align:center;'>");
			out.println("<h2>The Result is "+ k);
//			out.print("</h2>");
//			out.print("</div>");
//			out.print("</div>");
//			out.print("</body></html>");
}
}