package be.bstorm.ylorth.tbarlondemojakartaee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@WebServlet("/personne")
public class PersonneServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Personne p = new Personne();
        p.nom = req.getParameter("nom");
        p.prenom = req.getParameter("prenom");
        p.age= LocalDate.parse((req.getParameter("naissance")));

        Personne p2 = new Personne();
        p2.nom = "Gaetan";
        p2.prenom ="Test";

        Personne p3 = new Personne();
        p3.prenom = "Samuel";
        p3.nom = "Depierreux";

        List<Personne> liste = new ArrayList<>();
        liste.add(p);
        liste.add(p2);
        liste.add(p3);

        Random rdm = new Random();


        //resp.getWriter().println("<h1 style='color: chartreuse'>Va voir dans ta console!</h1>");

        resp.setStatus(200);

        //envoyer l'info à ma jsp
        req.setAttribute("test",liste.get(rdm.nextInt(liste.size())));

        req.setAttribute("liste",liste);

        //déléguer le reste du travail (l'affichage) à la jsp
        req.getRequestDispatcher("/getone.jsp").forward(req,resp);
    }
}
