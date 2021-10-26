
import java.io.IOException;


public class ContaSimples extends Conta {
	
    
    private String tipoConta;
    
        
    Arquivo arq= new Arquivo();
    
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

     public String getTipoConta() {
        return tipoConta;
    }
    
    public ContaSimples() throws IOException {
        this.tipoConta = "Conta Simples";
        arq.escreveArq("Conta Simples");
    }

    @Override
    public String toString() {
        return "ContaSimples{" +  ", tipoConta=" + tipoConta + '}';
    }
     
     
}
