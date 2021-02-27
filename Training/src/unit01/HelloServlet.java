package unit01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse responce)
    		throws ServletException, IOException{
    	//클라이언트에게 응답할 페이지 정보를 셋팅한다.
    	responce.setContentType("text/html");
    	// [Ctrl+Shift+O(알파벳)] : 자동 import
    	PrintWriter out = responce.getWriter();
    	out.print("<html><body><h1>");
    	out.print("Hello Servelt");
    	out.print("</h1></body></html>");
    	out.close();
    }
}