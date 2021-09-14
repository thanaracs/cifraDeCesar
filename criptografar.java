package cifraDeCesar;

import java.util.Scanner;
public class criptografar {

public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String entrada;
		String saida;
		int chave;
		

			System.out.print("Informe a mensagem: ");
			entrada = ler.nextLine();
			saida = "";	
			
			System.out.print("Informe a chave: ");
	        chave = ler.nextInt();  // int chave = Integer.parseInt(ler.nextLine());
        
      
        for(int i = 0; i < entrada.length(); i++){
            saida = saida + (char)(entrada.charAt(i) + chave); 
        }
        System.out.println("Frase criptografada: " + saida);
       ler.close();
        }
		
		
  
    

  }
	