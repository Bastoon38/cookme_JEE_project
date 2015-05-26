package db;

import model.UserModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DB {

    private static final String DB_HOST="localhost";
    private static final String DB_PORT="3306";
    private static final String DB_NAME="stepbystep";
    private static final String DB_USER="root";
    private static final String DB_PWD="";
    private Connection connection;
    public DB() {
        try {
// Chargement du Driver, puis �tablissement de la connexion
            Class.forName("com.mysql.jdbc.Driver");
//create connection
            connection =
                    java.sql.DriverManager.getConnection("jdbc:mysql://"+DB_HOST+":"+DB_PORT+"/"+DB_NAME, DB_USER, DB_PWD);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<UserModel> getData(){
        //return value
        ArrayList<UserModel> userList=new ArrayList<UserModel>();
        // Cr�ation de la requ�te
        java.sql.Statement query;

        try {
            query = connection.createStatement();
            //PreparedStatement querySt = connection.prepareStatement("SELECT * FROM user");
            ResultSet rst = query.executeQuery("SELECT * FROM user");

            while (rst.next()) {
                System.out.println("Chaine : " + rst.getString("surname"));
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }
    public void addUser(UserModel user) {
// Cr�ation de la requ�te
        java.sql.Statement query;
        try {
//Creation de l'�l�ment de requ�te
            query = connection.createStatement();
//TODO cr�ez la requ�te permettant d�ajout un utilisateur avec ts ces param�tres
//((`surname`, `lastname`, `age`, `login`, `pwd`)
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
