/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

import javax.swing.JOptionPane;

/**
 *
 * @author 2840482113042
 */
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
