import javax.swing.JOptionPane;

public class Funcionario extends Pessoa{
    private float horasTrabalhadas;

    public Funcionario(String nome, String endereco, float horasTrabalhadas) {
        super(nome, endereco);
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public float calculaSalario(){
        return 10 * this.horasTrabalhadas;
    }
    
    @Override
    public void mostrar() {
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome +
                "\nEndereço: " + this.endereco +
                "\nHoras Trabalhadas: " + this.horasTrabalhadas +
                "\n Salário: " + this.calculaSalario());
    }
    
    @Override
    public void excluir(){
        super.excluir();
        this.horasTrabalhadas = 0;
    }
    
    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
