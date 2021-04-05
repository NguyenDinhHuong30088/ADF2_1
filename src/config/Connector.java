package config;

import java.sql.DriverManager;
import java.sql.Statement;

public class Connector {
    public static Connector connector;

    Statement statement;

    private Connector(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connector conn = DriverManager.getConnection(connectString, user, password);
            setStatement()
        }catch (Exception e);
    }

    public static Connector getInstance(){
        if (connector == null)
            connector = new Connector();
        return connector;
    }

    public static Connector getConnector() {
        return connector;
    }

    public Statement getStatement() {
        return statement;
    }
}
