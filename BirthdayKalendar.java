import java.util.ArrayList;
import java.util.Scanner;

public class BirthdayKalendar {

    public static void main(String[] args) {
        ArrayList<String> birthdays = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Kies een optie (1,2,3): ");
            System.out.println("1. Verjaardag toevoegen");
            System.out.println("2. Verjaardag verwijderen");
            System.out.println("3. Alle verjaardagen laten zien \n");
            int option = Integer.parseInt(scanner.nextLine());

            switch(option) {
                case 1:
                    System.out.println("Wie is er jarig? ");
                    String name = scanner.nextLine();

                    System.out.println("Op welke dag?");
                    int day = Integer.parseInt(scanner.nextLine());

                    System.out.println("Van welke maand?");
                    int month = Integer.parseInt(scanner.nextLine());

                    birthdays.add(day + "-" + month + " " + name);
                    System.out.println("Verjaardag opgeslagen!");
                break;

                case 2:
                    System.out.println("Welke verjaardag wil je verwijderen?");
                    String userInput = scanner.nextLine();

                    for (String birthday : birthdays) {
                        if (birthday.contains(userInput)) {
                        birthdays.remove(birthday);
                        System.out.println("Verjaardag verwijderd! \n");
                        break;

                        } else {
                            System.out.println("Geen resultaten gevonden...");
                        }
                    }
                    
                break;

                case 3:
                    for (String birthday : birthdays) {
                        System.out.println(birthday + "\n");
                    }
                break;
            }    
                
        
        }

    }
}
