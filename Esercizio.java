//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;
import java.lang.Math;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().

    private static Random random = new Random();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, contatore;
        double media;
        
        n = in.nextInt();
        String[] studenti = new String[n];
        int[] votazioni = new int[n], crediti = new int[n];
        
        media = 0;
        for (i = 0; i <= n - 1; i++) {
            studenti[i] = in.nextLine();
            votazioni[i] = random.nextInt(11);
            crediti[i] = random.nextInt(31);
            media = media + votazioni[i];
        }
        media = media / n;
        contatore = 0;
        for (i = 0; i <= n - 1; i++) {
            if (votazioni[i] > media && crediti[i] >= 6) {
                System.out.println("Nome: " + studenti[i] + " Votazione: " + votazioni[i] + " credito formativo di: " + crediti[i]);
                contatore = contatore + 1;
            }
        }
        if (contatore == 0) {
            System.out.println("Nessuno ha superato la quantità di 6 crediti formativi");
        }
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md



