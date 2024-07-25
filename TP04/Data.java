import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

// Feito por Vinícius Pontes Oliva e Eduardo Barbosa

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private Scanner sc = new Scanner(System.in);

    public Data() {
        entraDia();
        entraMes();
        entraAno();
    }

    public Data(int d, int m, int a) {
        if (validaData(d, m, a)) {
            this.dia = d;
            this.mes = m;
            this.ano = a;
        } else {
            System.out.println("Data inválida. Inicializando com data padrão 01/01/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public void entraDia(int d) {
        if (d > 0 && d <= 31) {
            this.dia = d;
        } else {
            System.out.println("Dia inválido.");
        }
    }

    public void entraMes(int m) {
        if (m > 0 && m <= 12) {
            this.mes = m;
        } else {
            System.out.println("Mês inválido.");
        }
    }

    public void entraAno(int a) {
        if (a > 0) {
            this.ano = a;
        } else {
            System.out.println("Ano inválido.");
        }
    }

    public void entraDia() {
        int d;
        do {
            System.out.print("Digite o dia: ");
            d = sc.nextInt();
            if (d > 0 && d <= 31) {
                this.dia = d;
            } else {
                System.out.println("Dia inválido. Tente novamente.");
            }
        } while (d <= 0 || d > 31);
    }

    public void entraMes() {
        int m;
        do {
            System.out.print("Digite o mês: ");
            m = sc.nextInt();
            if (m > 0 && m <= 12) {
                this.mes = m;
            } else {
                System.out.println("Mês inválido. Tente novamente.");
            }
        } while (m <= 0 || m > 12);
    }

    public void entraAno() {
        int a;
        do {
            System.out.print("Digite o ano: ");
            a = sc.nextInt();
            if (a > 0) {
                this.ano = a;
            } else {
                System.out.println("Ano inválido. Tente novamente.");
            }
        } while (a <= 0);
    }

    public int retDia() {
        return this.dia;
    }

    public int retMes() {
        return this.mes;
    }

    public int retAno() {
        return this.ano;
    }

    public String mostra1() {
        return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
    }

    public String mostra2() {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
                          "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return String.format("%02d/%s/%04d", this.dia, meses[this.mes - 1], this.ano);
    }

    public boolean bissexto() {
        if ((this.ano % 4 == 0 && this.ano % 100 != 0) || (this.ano % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public int diasTranscorridos() {
        int[] diasPorMes = {31, (bissexto() ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dias = 0;
        for (int i = 0; i < this.mes - 1; i++) {
            dias += diasPorMes[i];
        }
        dias += this.dia;
        return dias;
    }

    public void apresentaDataAtual() {
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        Date dataAtual = new Date();
        System.out.println("Data atual: " + df.format(dataAtual));
    }

    private boolean validaData(int d, int m, int a) {
        if (m < 1 || m > 12) return false;
        if (d < 1 || d > 31) return false;
        if ((m == 4 || m == 6 || m == 9 || m == 11) && d > 30) return false;
        if (m == 2) {
            if (bissexto()) {
                if (d > 29) return false;
            } else {
                if (d > 28) return false;
            }
        }
        return true;
    }
}
