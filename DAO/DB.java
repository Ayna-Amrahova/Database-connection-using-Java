package DAO;

import java.util.*;
import java.sql.*;
import model.Millioner;

public class DB {

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public DB() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String username = "yourUserName";
            String password = "yourPassword";
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/millioner?useEncoding=true&characterEncoding-UTF8",
                    username, password);
            System.out.println("Connection success!");

        } catch (Exception ex) {
            System.out.println("Exception occured in connection: " + ex.toString());
        }
    }

    public void closeConnection() {
        try {
            conn.close();
            ps.close();
        } catch (Exception ex) {
            System.out.println("Exception occured during close: " + ex.toString());

        }
    }

    public boolean saveQuestion(String question, String answer, String variant1, String variant2, String variant3) {
        try {
            ps = conn.prepareCall("insert into millioner(question,answer,variant1,variant2,variant3)values (?,?,?,?,?)");
            ps.setString(1, question);
            ps.setString(2, answer);
            ps.setString(3, variant1);
            ps.setString(4, variant2);
            ps.setString(5, variant3);
            ps.execute();
            return true;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return false;
        }
    }

    public List<Millioner> getQuestions() {
        try {
            List<Millioner> list = new ArrayList<>();
            String sql = "select id,question,answer,variant1,variant2,variant3 from millioner";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Millioner m = new Millioner(rs.getInt("id"), rs.getString("question"), rs.getString("answer"),
                        rs.getString("variant1"), rs.getString("variant2"), rs.getString("variant3"));
                list.add(m);
            }
            return list;

        } catch (Exception ex) {
            System.out.println(ex.toString());
            return null;
        }

    }

}
