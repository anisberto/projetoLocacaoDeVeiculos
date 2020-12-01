package br.com.pi.model;

public class AdministradorModel {

    private int administrador_idem;
    private String administrador_nome;
    private String administrador_usuario;
    private String administrador_senha;

    public int getAdministrador_idem() {
        return administrador_idem;
    }

    public void setAdministrador_idem(int administrador_idem) {
        this.administrador_idem = administrador_idem;
    }

    public String getAdministrador_nome() {
        return administrador_nome;
    }

    public void setAdministrador_nome(String administrador_nome) {
        this.administrador_nome = administrador_nome;
    }

    public String getAdministrador_usuario() {
        return administrador_usuario;
    }

    public void setAdministrador_usuario(String administrador_usuario) {
        this.administrador_usuario = administrador_usuario;
    }

    public String getAdministrador_senha() {
        return administrador_senha;
    }

    public void setAdministrador_senha(String administrador_senha) {
        this.administrador_senha = administrador_senha;
    }

    @Override
    public String toString() {
        return "administrador_idem=" + administrador_idem + ", administrador_nome=" + administrador_nome + ", administrador_usuario=" + administrador_usuario + ", administrador_senha=" + administrador_senha;
    }

}
