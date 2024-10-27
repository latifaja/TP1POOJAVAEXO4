import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("SAISIR UNE CHAINE");
        String ch=sc.nextLine();
        if(ch.length()<=100){
        ch=ch.toLowerCase();
        int[] nb_occurrences= new int[26];
        for (char c : ch.toCharArray()) {
            if(c>='a' && c<='z'){
                nb_occurrences[c-'a']++;//obtenir un index entier correspondant à chaque lettre
            }
        }
        System.out.println("La chaîne "+ch+" contient : ");

        for (int i = 0; i < 26; i++) {
            if(nb_occurrences[i]>0){
                System.out.println(nb_occurrences[i] +" fois la lettre " +Character.toUpperCase((char)(i + 'a')) );
            }

        }
        }else {
            System.out.println("entrer une chaine de longueur inferieur ou egal a 100");
            sc.close();
        }

    }

}