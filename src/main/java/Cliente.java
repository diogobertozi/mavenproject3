import java.io.IOException;
import java.util.ArrayList;

           
public class Cliente {
    
    private String nomeCliente;
    private String senha;
    private String usuario;
    public Conta conta;
    
     Arquivo arq = new Arquivo();
    
    LerArquivo la = new LerArquivo();
    
    public static ArrayList<Cliente> arrayCliente = new ArrayList<>();

    public static ArrayList<Cliente> getArrayCliente() {
        return arrayCliente;
    }
    
    public Conta getConta(String usuario,String senha) {
        if((this.usuario.equals(usuario))&&(this.senha.equals(senha)))return conta;
        return null;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public String getUsuario() {
        return usuario;
    }
    
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Cliente(String usuario,String senha, String nome,int tipo,double taxaOuLimite) throws IOException
    {
       
        if(tipo==0){
            this.nomeCliente=nome;
            this.senha=senha;
            this.usuario=usuario;
            arrayCliente.add(this);
            this.conta = new ContaSimples();
        }
        if(tipo==1){
            this.nomeCliente=nome;
            this.senha=senha;
            this.usuario=usuario;
            arrayCliente.add(this);
            this.conta = new ContaEspecial(taxaOuLimite);
         }
        if(tipo==2){
            this.nomeCliente=nome;
            this.senha=senha;
            this.usuario=usuario;
            arrayCliente.add(this);
            this.conta = new ContaPoupanca(taxaOuLimite);
        }
        if(tipo==3)
        {
            this.nomeCliente=nome;
            this.senha=senha;
            this.usuario=usuario;
            arrayCliente.add(this);
            this.conta = new Gerente();
        }
       
        arq.escreveArq(nome);
        arq.escreveArq(usuario);
        arq.escreveArq(senha);
        LerArquivo.setLista(arrayCliente);
        
    }
    
   

    @Override
    public String toString() {
        return "Cliente{" + "nomeCliente=" + nomeCliente + ", senha=" + senha + ", usuario=" + usuario + ", conta= num " + conta.numDaConta + 
               "saldo " + conta.getSaldo() + "extrato " + conta.getExtrato()  + conta +'}';
    }
    
    
}