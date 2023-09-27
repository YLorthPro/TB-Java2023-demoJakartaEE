package be.bstorm.ylorth.tbarlondemojakartaee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/personne")
public class PersonneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Personne p = new Personne();
        p.nom = req.getParameter("nom");
        p.prenom = req.getParameter("prenom");
        p.age= LocalDate.parse((req.getParameter("naissance")));

        resp.getWriter().println("<h1 style='color: chartreuse'>Va voir dans ta console!</h1>");

        resp.setStatus(200);

        System.out.println(p);
    }
}
