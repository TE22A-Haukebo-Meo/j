import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        int p=0;
        int a=0;
        System.out.println("Frågesport");
        System.out.println("Fråga 1: Vem mördade John F. Kennedy?");
        System.out.println("1. Jag");
        System.out.println("2. Minecraft Steve");
        System.out.println("3. Ingen aning");

        int svar = tb.nextInt();
        while (a==0) {
            if (svar==1) {
            System.out.println("Korrekt! Jag mördade John F. Kennedy!");
            p+=1;
            a+=1;
        }
        else if (svar==2){
            System.out.println("Inkorrekt! Rätt svar var: 1. Jag");
            a+=1;
        }
        else if (svar==3){
            System.out.println("Inkorrekt! Rätt svar var: 1. Jag");
            a+=1;
        }
        else{
            System.out.println("Svara 1, 2 eller 3.");
            svar = tb.nextInt();
        }
        
        }
        while (a==1) {
            System.out.println("Är LuddeKudde GINGER??");
            System.out.println("1. JA");
            System.out.println("2. nej.");
            System.out.println("3. Kanske");
            int svar1 = tb.nextInt();
            if (svar1==1) {
                System.out.println("DINGDINGDINGDING! KORREKT! HAN E GINGER!");
                p+=1;
                a+=1;
            }
            else if (svar1==2){
                System.out.println("FEL! Rätt svar var: 1. HAN E GINGER!");
                a+=1;
            }
            else if (svar1==3){
                System.out.println("FEL! Rätt svar var: 1. HAN E GINGER!");
                a+=1;
            }
            else{
                System.out.println("Skärp dig, svara 1, 2 eller 3");
            }
        }
        System.out.println("Du är nu klar med frågesporten, du fick "+p+" poäng! Bra Jobbat!");

    }
}