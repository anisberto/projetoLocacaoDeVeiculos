package br.com.pi.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexao {

    private static Conexao conexao = null;
    private static Connection conect = null;

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
            } catch (Exception errorConectCreate) {
                throw new Exception("Erro ao conectar no banco de dados! " + errorConectCreate.getMessage());
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
        try (FileInputStream fs = new FileInputStream(".\\src\\br\\com\\pi\\util\\db.properties")) {
            Properties fileProperties = new Properties();
            fileProperties.load(fs);
            return fileProperties;
        } catch (IOException error) {
            throw new IOException("Erro ao Carre");
        }
    }
}
