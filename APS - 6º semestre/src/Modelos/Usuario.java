package Modelos;

public class Usuario {
    private int id;
    private String cargo;
    private String nome;
    private String sobrenome;
    private int permissao;
    private String login;
    private String senha;
   
    public Usuario() {
    }

    public Usuario(int id, String cargo, String nome, String sobrenome, int permissao, String login, String senha) {
        this.id = id;
        this.cargo = cargo;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.permissao = permissao;
        this.login = login;
        this.senha = senha;
    }

    public Usuario(String cargo, String nome, String sobrenome, int permissao, String login, String senha) {
        this.cargo = cargo;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.permissao = permissao;
        this.login = login;
        this.senha = senha;
    }
          
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getPermissao() {
        return permissao;
    }

    public void setPermissao(int permissao) {
        this.permissao = permissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", cargo=" + cargo + ", nome=" + nome + ", sobrenome=" + sobrenome + ", permissao=" + permissao + ", login=" + login + ", senha=" + senha + '}';
    }
}
