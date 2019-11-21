package model;

import java.util.*;
import java.sql.*;

public class Millioner {

    private int id;
    private String question;
    private String answer;
    private String variant1;
    private String variant2;
    private String variant3;

    public Millioner(int id, String question, String answer, String variant1, String variant2, String variant3) {
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.variant1 = variant1;
        this.variant2 = variant2;
        this.variant3 = variant3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getVariant1() {
        return variant1;
    }

    public void setVariant1(String variant1) {
        this.variant1 = variant1;
    }

    public String getVariant2() {
        return variant2;
    }

    public void setVariant2(String variant2) {
        this.variant2 = variant2;
    }

    public String getVariant3() {
        return variant3;
    }

    public void setVariant3(String variant3) {
        this.variant3 = variant3;
    }

}
