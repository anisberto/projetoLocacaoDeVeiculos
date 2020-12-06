package br.com.pi.util;

import br.com.pi.interfaces.ConnectionObservable;
import br.com.pi.interfaces.ConnectionObserver;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoMySQLConfigInterne implements ConnectionObservable {

    private static ConexaoMySQLConfigInterne conexao = null;
    private static Connection conect = null;
    List<ConnectionObserver> connectionObservers = new ArrayList<>();
    private boolean isConnected = true;

    private ConexaoMySQLConfigInterne() {
    }

    public static ConexaoMySQLConfigInterne getInstance() {
        if (conexao == null) {
            conexao = new ConexaoMySQLConfigInterne();
        }
        return conexao;
    }

    public Connection getConnection() throws Exception {
        try {
            String driver = "org.postgresql.Driver";
            String url = "jdbc:postgresql://localhost:5432/tfilmes";
            String user = "postgres";
            String password = "123";

            Class.forName(driver);
            conect = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            notifyObservers();
            throw new Exception("Erro: " + e.getMessage());
            
        }
        return conect;
    }

    public void closeConnection() {
        if (conect != null) {
            try {
                conect.close();
            } catch (SQLException e) {
                try {
                    throw new Exception("Erro ao fechar conexao");
                } catch (Exception ex) {
                    Logger.getLogger(ConexaoMySQLConfigInterne.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void closeStatement(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (Exception e) {
                try {
                    throw new Exception("Erro ao fechar statement");
                } catch (Exception ex) {
                    Logger.getLogger(ConexaoMySQLConfigInterne.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (Exception e) {
                try {
                    throw new Exception("Erro ao fechar resultSet");
                } catch (Exception ex) {
                    Logger.getLogger(ConexaoMySQLConfigInterne.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public void addConnectionObserver(ConnectionObserver connectionObserver) {
        connectionObservers.add(connectionObserver);
    }

    @Override
    public void removeConnectionObserver(ConnectionObserver connectionObserver) {
        connectionObservers.remove(connectionObserver);
    }

    @Override
    public void notifyObservers() {
        connectionObservers.forEach(connect -> {
            connect.onConnectionChange(isConnected);
        });
    }
}
