import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        System.out.println("Inserisci la parola");
        String parola=input.nextLine();
        int numerolettere= parola.length();
        int flag = 0;

        if (numerolettere%2==1)
        {
            flag++;
        }
        
        String primametà=parola.substring(0, numerolettere/2);
        String secondametà=parola.substring(numerolettere/2 + flag, numerolettere);
        if(primametà.equals(secondametà)){
            System.out.println("Le due metà sono uguali");  
        }
        else{
            System.out.println("Le due metà sono diverse");
        }
    }
}
