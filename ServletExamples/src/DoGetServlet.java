import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DoGetServlet")
public class DoGetServlet extends HttpServlet 
{
	PrintWriter p;
	String username,password;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		  //p=response.getWriter();
		  username=request.getParameter("un");
		  password=request.getParameter("pw");
		  p=response.getWriter();
          p.println("<html>");
          p.println("<body>");
          if((username.compareTo("admin")==0)&&(password.compareTo("admin")==0))
          {
              //rd=request.getRequestDispatcher("MyHttp2");
        	  p.println("Login Success");
          }
          else
          {
        	  //rd=request.getRequestDispatcher("Fail.html");
        	  p.println("Login Fail");
          }
         // rd.forward(request, response);
          p.println("</body>");
          p.println("</html>");

	}

}
