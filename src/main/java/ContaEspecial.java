
import java.io.IOException;

public class ContaEspecial extends Conta{
	
    public static double saldoGerente;
    private final String tipoConta;
    private int numDaConta;
    
    Arquivo arq = new Arquivo();

    public String getTipoConta() {
        return tipoConta;
    }

  

    public double getSaldoGerente() {
        return saldoGerente;
    }

   
    public ContaEspecial(double saldoGerente) throws IOException {
        this.numDaConta=numContas;
        this.saldoGerente = saldoGerente;
        this.tipoConta="Conta Especial";
        arq.escreveArq("Conta Especial");
    }

    @Override
    public String toString() {
        return "ContaEspecial{" + "saldoGerente=" + saldoGerente  + ", tipoConta=" + tipoConta + '}';
    }
    
    
 }
