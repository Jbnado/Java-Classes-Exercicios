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
public class Aluno extends Pessoa {
    private final String[] CURSOS = {"Administração", "Direito", "Sistemas da Informação", ""};
    private int curso;

    public Aluno(int curso, String nome, String endereco) {
        super(nome, endereco);
        this.curso = curso;
    }

    @Override
    public void excluir() {
        super.excluir(); 
        this.curso = 3;
    }
    
    public float calcularMensalidade(){
        switch(this.curso){
            case 0:
                return 650;
            case 1:
                return 1200;
            case 2:
                return 850;
            default:
                return 0;
        }
    }

    @Override
    public void mostrar() {
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome +
                "\nEndereço: " + this.endereco +
                "\nCurso: " + this.CURSOS[this.curso] +
                "\nMensalidade: R$" + this.calcularMensalidade());
    }
    
    

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
    
    
}
