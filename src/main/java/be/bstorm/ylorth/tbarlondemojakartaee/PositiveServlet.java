package be.bstorm.ylorth.tbarlondemojakartaee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/positive")
public class PositiveServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();

        int nombre = Integer.parseInt(req.getParameter("nombre"));

        out.println("<html>");
        out.println("<body>");

        if(nombre>0)
            out.print("Nombre positif");
        else
            out.print("Nombre pas positif");

        out.println("</body>");
        out.println("</html>");

        resp.setStatus(200);

        resp.setHeader("content-type","text/html");

    }
}
