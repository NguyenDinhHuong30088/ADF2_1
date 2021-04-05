package demo.s9;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args){
        ResourceBundle us = ResourceBundle.getBundle("demo.s9.Session9_Messages",Locale.US);
        Locale vi = new Locale("vi,VN");
        ResourceBundle vn = ResourceBundle.getBundle("demo.s9.      Session0_Messages",vi);
        System.out.println("Xin chao bang tieng anh:"+us.getString("Hello"));
        System.out.println("Xin chao bang tieng viet:"+vn.getString("Hello"));
    }
}
