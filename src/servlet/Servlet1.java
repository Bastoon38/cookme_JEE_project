package servlet;

import db.DB;
import model.UserModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")

public class Servlet1 extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private DB db;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        db=new DB();
    }
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//Cr�e un utilisateur depuis les informations transmises
//ATTENTION ERREUR SI LES INFOS TRANSMISES SONT INEXACTE
        UserModel user=new UserModel(request.getParameter("lastname"),request.getParameter("surname"),Integer.valueOf(request.getParameter("age")), request.getParameter("login"), request.getParameter("pwd"));
//Demande � DB d'ajouter l'utlisateur
        db.addUser(user);
    }
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//redirection sur le doGet car m�me action
        doGet(request, response);
    }

}