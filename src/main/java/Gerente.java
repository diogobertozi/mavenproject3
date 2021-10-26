import java.io.IOException;
           
public class Gerente extends Conta{
    
    
    private static int quantContas;
    
    Arquivo arq = new Arquivo();

    public Gerente() throws IOException {
        quantContas=0;
        arq.escreveArq("GERENTE");
    }

    public int getQuantContas() {
        return quantContas;
    }

    public void addQuantContas(int quantiContas) {
        quantContas = quantiContas;
    }

    @Override
    public String toString() {
        return "Gerente{"  + ", quantContas=" + quantContas + '}';
    }
    
    
}