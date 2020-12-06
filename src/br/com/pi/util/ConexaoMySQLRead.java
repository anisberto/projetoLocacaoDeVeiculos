package br.com.pi.util;

import br.com.pi.interfaces.ConnectionObservable;
import br.com.pi.interfaces.ConnectionObserver;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConexaoMySQLRead implements ConnectionObservable {

    private static ConexaoMySQLRead conexao = null;
    private static Connection conect = null;
    List<ConnectionObserver> connectionObservers = new ArrayList<>();
    private boolean isConnected = true;

    private ConexaoMySQLRead() {
    }

    public static ConexaoMySQLRead getInstance() {
        if (conexao == null) {
            conexao = new ConexaoMySQLRead();
        }
        return conexao;
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

    public Connection getConnection() {
        if (conect == null) {
            try {
                Properties props = loadProperties();
                String urlDb = props.getProperty("dburl");
                conect = DriverManager.getConnection(urlDb, props);
            } catch (Exception errorConectCreate) {
                isConnected = false;
                try {
                    throw new Exception("Erro ao conectar no banco de dados! 22655" + errorConectCreate.getMessage());
                } catch (Exception ex) {
                    Logger.getLogger(ConexaoMySQLRead.class.getName()).log(Level.SEVERE, null, ex);
                }
            } finally {
                notifyObservers();
            }
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
                    Logger.getLogger(ConexaoMySQLRead.class.getName()).log(Level.SEVERE, null, ex);
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
                    Logger.getLogger(ConexaoMySQLRead.class.getName()).log(Level.SEVERE, null, ex);
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
                    Logger.getLogger(ConexaoMySQLRead.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("./src/br/com/pi/util/db.properties")) {
            Properties fileProperties = new Properties();
            fileProperties.load(fs);
            return fileProperties;
        } catch (IOException error) {
            try {
                throw new IOException("Erro ao Carre");
            } catch (IOException ex) {
                Logger.getLogger(ConexaoMySQLRead.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
