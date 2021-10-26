
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class LerArquivo {
    
    private static ArrayList<Cliente> lista;
    

    public static void setLista(ArrayList<Cliente> lista) {
        LerArquivo.lista = lista;
    }

    public boolean ler(String usuario, String senha) throws IOException
    {
        try{
            File arquivo = new File("C:/Quarto Periodo/Paradigmas de Programacao B/mavenproject3/banco_de_dados.txt");
            
            Scanner leitura = new Scanner(arquivo);
                    
            while(leitura.hasNextLine())
            {
                
                String nConta = leitura.nextLine();
                String tipoConta = leitura.nextLine();
                String nome = leitura.nextLine();
                String nUsuario = leitura.nextLine();
                String nSenha = leitura.nextLine();
                
                if(usuario.equals(nUsuario)&&senha.equals(nSenha))
                {                     
                    if(tipoConta.equals("GERENTE"))
                    {
                        NewJFrame1 nj1 = new NewJFrame1();
                        nj1.setCliente(lista);
                        JOptionPane.showMessageDialog(null, "Seja bem-vindo(a)\n" + nome);
                        nj1.setVisible(true);
                    }
                     if(tipoConta.equals("Conta Simples"))
                    {
                        NewJFrame2 nj2 = new NewJFrame2();
                        NewJFrame2.setCliente(lista);
                        nj2.Usuario=nUsuario;
                        nj2.Senha=nSenha;
                        JOptionPane.showMessageDialog(null, "Seja bem-vindo(a)\n" + nome);
                        nj2.setVisible(true);
                        
                        
                        
                    }
                    if(tipoConta.equals("Conta Especial"))
                    {
                        NewJFrame2 nj2 = new NewJFrame2();
                        NewJFrame2.setCliente(lista);
                        nj2.Usuario=nUsuario;
                        nj2.Senha=nSenha;
                        JOptionPane.showMessageDialog(null, "Seja bem-vindo(a)\n" + nome);
                        nj2.setVisible(true);
                    }
                    if(tipoConta.equals("Conta Poupanca"))
                    {
                        NewJFrame2 nj2 = new NewJFrame2();
                        NewJFrame2.setCliente(lista);
                        nj2.Usuario=nUsuario;
                        nj2.Senha=nSenha;
                        JOptionPane.showMessageDialog(null, "Seja bem-vindo(a)\n" + nome);
                        nj2.setVisible(true);
                    }
                    return true;
                }
            }
        }catch(IOException Ex){
               Ex.printStackTrace();          
            }
        return false;

            
        
    }
}
