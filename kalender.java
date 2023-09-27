import java.util.ArrayList;
import java.util.Scanner;

public class kalender {
    public static void main(String[] args) {
        ArrayList<String> verjaardagen = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Verjaardagskalender 0.1");
            System.out.println("Kies een optie:");
            System.out.println("1. Verjaardag toevoegen");
            System.out.println("2. Verjaardag verwijderen");
            System.out.println("3. Alle verjaardagen zien");
            System.out.println("4. Afsluiten");

            int keuze = scanner.nextInt();

            switch (keuze) {
                case 1:
                    System.out.println("Wie is er jarig?");
                    scanner.nextLine(); // Leeg de newline
                    String naam = scanner.nextLine();
                    System.out.println("Op welke dag?");
                    int dag = scanner.nextInt();
                    System.out.println("Van welke maand?");
                    int maand = scanner.nextInt();

                    // Opslaan van de verjaardag
                    verjaardagen.add(dag + "-" + maand + " " + naam);
                    System.out.println("Verjaardag opgeslagen!");
                    break;
                case 2:
                    System.out.println("Welke verjaardag wil je verwijderen?");
                    scanner.nextLine(); // Leeg de newline
                    String teVerwijderenNaam = scanner.nextLine();

                    if (verjaardagen.removeIf(verjaardag -> verjaardag.contains(teVerwijderenNaam))) {
                        System.out.println("Verjaardag verwijderd!");
                    } else {
                        System.out.println("Verjaardag niet gevonden.");
                    }
                    break;
                case 3:
                    System.out.println("Alle verjaardagen zien:");
                    for (String verjaardag : verjaardagen) {
                        System.out.println(verjaardag);
                    }
                    break;
                case 4:
                    System.out.println("Applicatie afgesloten.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Ongeldige keuze. Probeer opnieuw.");
                    break;
            }
        }
    }
}
