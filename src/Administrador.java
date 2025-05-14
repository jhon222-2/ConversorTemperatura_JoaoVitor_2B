 
 public class Administrador{
     private static final int proximoId=1;
     private int id;
     private String nome;
     private String email;
     private String cargo;
     
     public Administrador(String nome, String email, String cargo, int proximoId) {
        this.id = id + proximoId;
        proximoId++;
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
    }
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String ToString() {
        return nome + " [ID: " + id + ", Email: " + email + ", Cargo: " + cargo + "]";
    }
}
