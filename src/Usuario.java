
public class Usuario {
    private static final int proximoId=1;
    private int id;
    private String nome;
    private String email;
    
    public Usuario(int id, String nome, String email){
        this.id = proximoId + id;
        this.nome = nome;
        this.email = email;
    }
    //getter e setter de todas os itens l:14-36
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
    
    public String ToString(){
        return nome + " [ID: " + id + ", Email: " + email + "]";
    
    }
}
