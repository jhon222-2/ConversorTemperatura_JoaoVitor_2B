
package biblioteca.de;
 
import java.util.ArrayList;

public class armazamento {
    public class Biblioteca {
    private ArrayList<Livro> livro;
    private ArrayList<Usuario> usuario;
    private ArrayList<Administrador> administrador;

    public Biblioteca() {
        livro = new ArrayList<>();
        usuario = new ArrayList<>();
        Administrador = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        if (buscarLivroPorIsbn(livro.getISBN()) == null) {
            livro.add(livro);
            System.out.println("Livro cadastrado com sucesso.");
        } else {
            System.out.println("Erro: ISBN já existente.");
        }
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado com sucesso.");
    }

    public void cadastrarAdministrador(Administrador adm) {
        administradores.add(adm);
        System.out.println("Administrador cadastrado com sucesso.");
    }

    public void emprestarLivro(String isbn, String idUsuario) {
        Livro livro = buscarLivroPorIsbn(isbn);
        Usuario usuario = buscarUsuarioPorId(idUsuario);

        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return;
        }

        if (usuario == null) {
            System.out.println("Usuário não encontrado.");
            return;
        }

        if (!livro.isDisponivel()) {
            System.out.println("Livro indisponível.");
            return;
        }

        livro.setDisponivel(false);
        System.out.println("Livro emprestado com sucesso.");
    }

    public Livro buscarLivroPorIsbn(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }

    public Usuario buscarUsuarioPorId(String id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        return null;
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }

    public void listarUsuarios() {
        if (Usuario.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            for (Usuario usuario : usuarios) {
                System.out.println(usuario);
            }
        }
    }

    public void listarAdministradores() {
        if (Administrador.isEmpty()) {
            System.out.println("Nenhum administrador cadastrado.");
        } else {
            for (Administrador adm : Administrador) {
                System.out.println(adm);
            }
        }
    }
}
