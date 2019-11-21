package db.millioner;

import DAO.DB;
import java.util.*;
import java.sql.*;
import model.Millioner;

public class Main {

    public static void main(String[] args) {
        DB db = new DB();

        List<Millioner> m = db.getQuestions();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter question:");
        String q = sc.nextLine();
        System.out.println("Enter answer:");
        String a = sc.nextLine();
        System.out.println("Enter variant1:");
        String v1 = sc.nextLine();
        System.out.println("Enter variant2:");
        String v2 = sc.nextLine();
        System.out.println("Enter variant3:");
        String v3 = sc.nextLine();

        db.saveQuestion(q, a, v1, v2, v3);

        db.closeConnection();
        System.out.println(m.size() + 1);
    }

}
