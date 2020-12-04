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
import java.util.Properties;
import java.util.Stack;

public class Conexao implements ConnectionObservable {

    private static Conexao conexao = null;
    private static Connection conect = null;
    private boolean isConnected;
    private Stack<ConnectionObserver> connectionObservers = new Stack<>();

    private Conexao() {
    }

    public static Conexao getInstance() {
        if (conexao == null) {
            conexao = new Conexao();
        }
        return conexao;
    }

    public Connection getConnection() throws Exception {
        if (conect == null) {
            try {
                Properties props = loadProperties();
                String urlDb = props.getProperty("dburl");
                conect = DriverManager.getConnection(urlDb, props);
                isConnected = true;
            } catch (Exception errorConectCreate) {
                isConnected = false;
                throw new Exception("Erro ao conectar no banco de dados! " + errorConectCreate.getMessage());
            } finally {
                notifyObservers();
            }
        }
        return conect;
    }

    public static void closeConnection() throws Exception {
        if (conect != null) {
            try {
                conect.close();
            } catch (SQLException e) {
                throw new Exception("Erro ao fechar conexao");
            }
        }
    }

    public static void closeStatement(Statement st) throws Exception {
        if (st != null) {
            try {
                st.close();
            } catch (Exception e) {
                throw new Exception("Erro ao fechar statement");
            }
        }
    }

    public static void closeResultSet(ResultSet rs) throws Exception {
        if (rs != null) {
            try {
                rs.close();
            } catch (Exception e) {
                throw new Exception("Erro ao fechar resultSet");
            }
        }
    }

    private static Properties loadProperties() throws IOException {
        try (FileInputStream fs = new FileInputStream("./src/br/com/pi/util/db.properties")) {
            Properties fileProperties = new Properties();
            fileProperties.load(fs);
            return fileProperties;
        } catch (IOException error) {
            throw new IOException("Erro ao Carre");
        }
    }

    @Override
    public void addConnectionObserver(ConnectionObserver connectionObserver) {
        this.connectionObservers.add(connectionObserver);
    }

    @Override
    public void removeConnectionObserver(ConnectionObserver connectionObserver) {
        this.connectionObservers.remove(connectionObserver);
    }

    @Override
    public void notifyObservers() {
        connectionObservers.forEach(connect -> {
            connect.onConnectionChange(isConnected);
        });
    }
}
