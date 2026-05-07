import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter pw = response.getWriter();

        String user =
                request.getParameter("uname");

        String pass =
                request.getParameter("pass");

        pw.println("<h1>Username: "
                + user + "</h1>");

        pw.println("<h1>Password: "
                + pass + "</h1>");
    }

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        doGet(request, response);

    }
}
