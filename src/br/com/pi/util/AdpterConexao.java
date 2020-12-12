package br.com.pi.util;

import br.com.pi.interfaces.AdapterConexaoInterface;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class AdpterConexao implements AdapterConexaoInterface {

    ConexaoPostRead conexaoPost = ConexaoPostRead.getInstance();
//    ConexaoPostConfigInterne conexaoPost =  ConexaoPostConfigInterne.getInstance();

    @Override
    public Connection getConnectionAdapter() {
//            return conexaoPost.getConnectionConfigDateIntern();
        return conexaoPost.getConnectionAdapter();
    }

    @Override
    public void closeConnection() {
        try {
            conexaoPost.closeConnection();
        } catch (Exception e) {
        }
    }

    @Override
    public void closeStatement(Statement st) {
        try {
            st.close();
        } catch (Exception e) {
        }
    }

    @Override
    public void closeResultSet(ResultSet rs) {
        try {
            rs.close();
        } catch (Exception e) {
        }
    }

    @Override
    public Properties loadProperties() {
        throw new IllegalArgumentException("Connection class não usa properties");
    }
}
