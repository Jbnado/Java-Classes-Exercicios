import javax.swing.JOptionPane;

public class Registro {

 

    private String nomeAluno;
    private int numeroMatricula;
    private String dataNascimento;
    private boolean bolsista;
    private int anoMatricula;

 

    public Registro(String nomeAluno, int numeroMatricula, String dataNascimento, boolean bolsista, int anoMatricula) {
        this.nomeAluno = nomeAluno;
        this.numeroMatricula = numeroMatricula;
        this.dataNascimento = dataNascimento;
        this.bolsista = bolsista;
        this.anoMatricula = anoMatricula;
    }

 

    public String getNomeAluno() {
        return nomeAluno;
    }

 

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

 

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

 

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

 

    public String getDataNascimento() {
        return dataNascimento;
    }

 

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

 

    public boolean isBolsista() {
        return bolsista;
    }

 

    public void setBolsista(boolean bolsista) {
        this.bolsista = bolsista;
    }

 

    public int getAnoMatricula() {
        return anoMatricula;
    }

 

    public void setAnoMatricula(int anoMatricula) {
        this.anoMatricula = anoMatricula;
    }

 

    public int calculaMensalidade() {
        int mensalidade = 300;
        return bolsista ? mensalidade / 2 : mensalidade;

 

    }

 

    public void mostrarRegistro() {
        String registro = "Nome: " + nomeAluno
                + "\nData de Nascimento: " + dataNascimento
                + "\nNumero da Matricula: " + numeroMatricula
                + "\nAno da Matricula: " + anoMatricula
                + "\nBolsista: " + ((bolsista) ? "Sim" : "Não")
                + "\nValor da Mensalidade: R$" + calculaMensalidade();
        JOptionPane.showMessageDialog(null, registro);
    }
    
    public static void main(String[] args){
      Registro[] alunos = new Registro[2];
            int numeroMatricula = 1;

 

        do {
            String nomeAluno = JOptionPane.showInputDialog("Digite o nome:");
            String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento:");
            int anoMatricula = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da matricula:"));
            int intBolsista = JOptionPane.showConfirmDialog(null, "O aluno é bolsista?", "Bolsista", JOptionPane.YES_NO_OPTION);
            boolean bolsista = intBolsista == 0;
            Registro aluno = new Registro(nomeAluno, numeroMatricula, dataNascimento, bolsista, anoMatricula);
            alunos[numeroMatricula - 1] = aluno;
            numeroMatricula++;

 

        } while (numeroMatricula < 3);

 

        for (Registro aluno : alunos) {
            aluno.mostrarRegistro();
            System.out.println();
        }
    }
}
