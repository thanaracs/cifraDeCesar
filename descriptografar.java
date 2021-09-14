package cifraDeCesar;
import java.util.Scanner;

public class descriptografar {

	public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
       
        System.out.print("Informe a mensagem para descriptografar: ");
        String entrada = ler.nextLine();
        String saida = "";
        System.out.print("Informe a chave:");
    	int chave = ler.nextInt();
       
        for(int i = 0; i < entrada.length(); i++){
            saida = saida + (char)(entrada.charAt(i) - chave); 
        }
     
        System.out.println("Mensagem descriptografada: " + saida);
        ler.close();
	
	}}
