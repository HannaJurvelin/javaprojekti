
// aja ohjelma fn + f5, lopetus control + C
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        intro();
        int valittu = valinta1(myObj);
        if (valittu == 1) {
            lopetus();
        } else {
            int valittu2 = valinta2(myObj);
            if (valittu2 == 2) {
                lopetus();
            } else {
                System.out.println("Test");
            }
        }

        int valinta = -1;

        while (valinta != 0) {
            valinta = myObj.nextInt();
        }
    }

    private static void intro() {
        System.out.println("How to play: always pick either 1 or 2\n"
                + "Your life was perfect until one day your dear mother passed away.\n"
                + "A year later, your father married another woman.\n"
                + "Your new step-mother turned out to be evil and greedy and her two daughters take after her.\n"
                + "Soon after that your father also passes away because of an illness.\n"
                + "You’re forced to be a servant to your stepmother and stepsisters, cooking and cleaning for them while they laze around the house.\n"
                + "Until one day…");
    }

    private static int valinta1(Scanner myObj) {
        System.out.println("A prince is having a ball and every noble lady in the country is invited. You will...\n"
                + "1. While your step-mother and -sisters are at the party, take the opportunity and steal all the valuables in the house. You’ll start a new life in another country.\n"
                + "2. Go to the garden to cry while your step-mother and -sisters dress up and go to the party.");
        int valinta1 = 0;
        while (valinta1 < 1 || valinta1 > 2) {
            valinta1 = myObj.nextInt();
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
        }
        return valinta1;
    }

    private static int valinta2(Scanner myObj) {
        System.out.println(
                "1. You nod in agreement and the fairy godmother waves her wand. You’re suddenly wearing a high-class dress. A pumpkin turns to a carriage and mice to horses.\n"
                        + "2. This seems too good to be true. Pick up your broom and chase that suspicious lady out of your garden.");
        int valinta2 = 0;
        while (valinta2 < 1 || valinta2 > 2) {
            valinta2 = myObj.nextInt();
            if (valinta2 == 1) {
                System.out.println(
                        "When arriving in a fancy carriage and beautiful dress you're welcomed in to the castle with open arms. You share an instant connection with the prince and dance happily with him. Untill the clock strikes midnight...");

            } else if (valinta2 == 2) {
                System.out.println(
                        "The angry fairy turns you in to a frog. Your actually enjoying your life as an amphibian when years later, a prince kisses you and the magic is broken.");

            } else {
                System.out.println("Please pick either 1 or 2");
            }
        }
        return valinta2;
    }

    private static void lopetus() {
        System.out.println("The end.");
    }
}