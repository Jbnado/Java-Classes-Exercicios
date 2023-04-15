import javax.swing.JOptionPane;

public class Pessoa {
    protected String nome, endereco;

    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public void mostrar() {
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome +
                "\nEndereço: " + this.endereco);
    }
    
    public void excluir() {
        this.nome = "";
        this.endereco = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
