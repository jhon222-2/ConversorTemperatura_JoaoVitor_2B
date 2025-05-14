
public class Livro {
    private static int proximoisbn=1;
    private int isbn;
    private String autor;
    private String titulo;
    private int ano;
    private boolean disponivel;
    
    public Livro(int isbn, String titulo, String autor, int ano){
        
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.ano = ano;
        this.disponivel = true;
    }
    
    //getter e setter de todas os itens l:19-56
    
    public int getISBN(){
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
     public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public String ToString() {
        return titulo + " - " + autor + " (" + ano + ") [ISBN: " + isbn + "] " +
               (disponivel ? "[Disponível]" : "[Emprestado]");
    }
}
