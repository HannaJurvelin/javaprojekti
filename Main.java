
// aja ohjelma fn + f5, lopetus control + C
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        intro();
        valinta1(myObj);

        // int valinta = -1;

        // while (valinta != 0) {
        // valinta = myObj.nextInt();
        // }
    }

    private static void intro() {
        System.out.println("Your life was perfect until one day your dear mother passed away.\n"
                + "A year later, your father married another woman.\n"
                + "Your new step-mother turned out to be evil and greedy and her two daughters take after her.\n"
                + "Soon after that your father also passes away because of an illness.\n"
                + "You’re forced to be a servant to your stepmother and stepsisters, cooking and cleaning for them while they laze around the house.\n"
                + "Until one day…");
    }

    private static int valinta1(Scanner myObj) {
        System.out.println("A prince is having a ball and every noble lady in the country is invited. You will..\n"
                + "1. Take the opportunity and steal all the valuables in the house. You’ll start a new life in another country.\n"
                + "2. Go to the garden to cry while your step-mother and -sisters go to the party.");
        int valinta1 = myObj.nextInt();
        if (valinta1 == 1) {
            System.out.println(
                    "You sell the valuables with a surprising amount of money and jump the first ship available. Happy ever after achieved!");
        } else if (valinta1 == 2) {
            System.out.println(
                    "A brilliant light emerges suddenly and a mysterious figure appears. It’s a lady with a wand who says she’s your fairy godmother.\n"
                            + "She says she’ll help you get to the party.");
        } else {
            System.out.println("Please pick either 1 or 2");
        }
        return 0;
    }
}