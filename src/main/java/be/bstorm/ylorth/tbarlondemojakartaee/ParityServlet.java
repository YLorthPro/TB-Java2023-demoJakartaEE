package be.bstorm.ylorth.tbarlondemojakartaee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/pair")
public class ParityServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //cette ligne permet de faire out.println au lieu de resp.getWriter().println
        //PrintWriter out = resp.getWriter();


        try{
            if((Integer.parseInt(req.getParameter("number"))%2) ==0){
                resp.getWriter().print("Le nombre est pair");
            }
            else{
                resp.getWriter().print("Le nombre est impair");
            }


        } catch(NumberFormatException e){
            resp.setStatus(400);
            resp.getWriter().println("<title>Erreur 400 quelque chose...</title>");
            resp.getWriter().print("Oh oh je ne sais pas ce qu'est un nombre");

        }


    }

}
