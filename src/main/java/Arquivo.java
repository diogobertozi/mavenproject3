import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Arquivo {
    
    private Path caminho;
    
    
   
    public void escreveArq(String conteudo)  throws IOException
    {
        
        conteudo = conteudo+"\r\n";
        Files.write(this.caminho, conteudo.getBytes(), StandardOpenOption.APPEND);
        
        
    }
    
    public Arquivo()
    {
         this.caminho = Paths.get("C:/Quarto Periodo/Paradigmas de Programacao B/mavenproject3/banco_de_dados.txt");
    }
    
    
}
