package br.com.pi.interfaces;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;


public interface AdapterConexaoInterface {
    Connection getConnectionAdapter();
    void closeConnection();
    void closeStatement(Statement st);
    void closeResultSet(ResultSet rs);
    Properties loadProperties();
}
