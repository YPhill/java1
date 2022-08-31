package mensagem;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
       Scanner grava = new Scanner(System.in);
       int cont = 0;
       
       System.out.println("Informe quantas vezes voce deseja ver a mensagem:");
       cont = grava.nextInt();
       
       while (cont > 0){
            System.out.println("Isso é um teste");
            cont--;
       }
    }
    
}
