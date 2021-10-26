import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Conta {
    
    private static int vetS=0,vetE=0,vetP=0;
    public static int numContas=0;
    public int numDaConta;
    private double saldo;
    private String extrato;

   
    String num;
    
    Random gerador = new Random();
        
    public static ArrayList<Conta> arrayContas = new ArrayList<>();
    
    Arquivo arq = new Arquivo();
    
     public String getExtrato() {
        return extrato;
    }

    public void setExtrato(String extrato) {
        this.extrato=this.extrato+"\n"+extrato;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.arrayContas = contas;
    }

    public ArrayList<Conta> getContas() {
        return arrayContas;
    }

    public int getVetS() {
        return vetS;
    }

    public int getVetE() {
        return vetE;
    }

    public int getVetP() {
        return vetP;
    }

    public int getNumContas() {
        return numContas;
    }

   public void addVetS() {
        this.vetS += 1;
    }

    public void addVetE() {
        this.vetE += 1;
    }

    public void addVetP() {
        this.vetP += 1;
    }

    public void addNumContas() {
        this.numContas += 1;
    }
    
     public void depositar(double saldo) {
        this.saldo += saldo;
    }
     
      public double getSaldo() {
        return saldo;
    }
      
      public void setNumDaConta(int numDaConta) {
        this.numDaConta = numDaConta;
    }

    public int getNumDaConta() {
        return numDaConta;
    }
    
     public void sacar(double valor)
    {
        this.saldo-=valor;
    }

   public Conta() throws IOException
   {
       this.saldo=0.0;
       this.extrato="";
       this.numDaConta=numContas;
       num=""+this.numDaConta;
       arq.escreveArq(num);
       arrayContas.add(this);
   }
           
  

    @Override
    public String toString() {
        return "Conta{" + "vetS=" + vetS + ", vetE=" + vetE + ", vetP=" + vetP + ", numContas=" + numContas + '}';
    }
   
}
