
import java.io.IOException;

public class ContaPoupanca extends Conta {
	
    private static double taxaJuros;
    private String tipoConta;
    private int numDaConta;
    
    Arquivo arq = new Arquivo();

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public ContaPoupanca(double taxaJuros) throws IOException {
        this.numDaConta=numContas;
        this.taxaJuros = taxaJuros;
        this.tipoConta = "Conta Poupanca";
        arq.escreveArq("Conta Poupanca");
    }
    
    @Override
    public String toString() {
        return "ContaPoupanca{" +  ", taxaJuros=" + taxaJuros + ", tipoConta=" + tipoConta + '}';
    }
    
    
}
