import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

    Scanner menu = new Scanner(System.in);
 int opcao ; 
 int continuar = 0; 

 while(continuar <3) {

    System.out.println("|     MENU                |"); 
    System.out.println("|     Opções:             |"); 
    System.out.println("|     1.    Opção 1       |"); 
    System.out.println("|     2.    Opção 2       |"); 
    System.out.println("|     3.    Sair          |"); 

    System.out.println(" Selecione uma opção:  "); 
    opcao = menu.nextInt(); 

    switch (opcao) {
        case 1:
            System.out.println("Você escolheu a primeira opção");
            break;
        case 2:
            System.out.println("Você escolheu a segunda opção");
            break;  
        case 3:
            System.out.println("O programa foi encerrado");
            continuar = 3;
            break;   
    
        default:
        System.out.println("Seleção inválida");
            break;
    }

 }
}
}