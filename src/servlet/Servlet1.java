package servlet;

import db.DB;

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
     * @see /*HttpServletdoGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//TODO Lors de l�appel de http get utiliser les classes pr�c�dement cr�er pour r�cup�rer la liste des utilisateurs
//TODO �crire la liste des utilisateurs dans le flux de r�ponse HttpServletResponse
    }
    /**
     * @see HttpServlet/*doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}