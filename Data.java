import javax.swing.JOptionPane;

public class Data {

    private final int[] DIAS_MESES = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int dia;
    private int mes;
    private int ano;

    private boolean dataValida(int dia, int mes, int ano) {
        boolean diaValido = dia >= 1 && dia <= DIAS_MESES[mes-1];
        boolean mesValido = mes >= 1 && mes <= 12;
        boolean anoBissexto = (ano % 4 == 0 || ano % 400 == 0) && ano % 100 != 0;
        if (diaValido && mesValido) {
            if (mes == 2 && anoBissexto) {
                if (dia > 29) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }

    public Data(int dia, int mes, int ano) {
        if (dataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = 0;
            this.mes = 0;
            this.ano = 0;
        }

    }

    public void mostrarData() {
        String dd = dia < 10 ? "0" + String.valueOf(dia) : String.valueOf(dia);
        String mm = mes < 10 ? "0" + String.valueOf(mes) : String.valueOf(mes);
        String data = dd + "/" + mm + "/" + String.valueOf(ano);
        
        JOptionPane.showMessageDialog(null, data);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
