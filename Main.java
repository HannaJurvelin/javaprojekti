
// scanneri syöttöjen lukemista varten
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // luodaan scanneri lukija syöttöjen lukemista varten
        Scanner lukija = new Scanner(System.in);
        // kutsutaan metodia intro joka sisältää pelin ohjeet ja tarinan alustuksen
        intro();

        // luodaan uusi muuttuja valittu joka saa arvon metodista valinta1 jonka
        // parametri on lukija
        int valittu = valinta1(lukija);
        // jos valittu arvo on 1, niin peli loppuu
        if (valittu == 1) {
            // kutsutaan metodia lopetus
            lopetus();
            // jos valittu arvo on 2, peli jatkuu seuraavaan valintakysymykseen
        } else {
            int valittu2 = valinta2(lukija);
            if (valittu2 == 2) {
                lopetus();
            } else {
                int valittu3 = valinta3(lukija);
                if (valittu3 == 1) {
                    lopetus();
                } else {
                    // loppuratkaisu koko pelille
                    System.out.println("Congratulations, you finished the game!");
                }
            }
        }
    }

    // metodi intro
    private static void intro() {
        System.out.println("How to play: always pick either 1 or 2\n"
                + "You live a quiet life until your widowed father remarries.\n"
                + "Your new step-mother turns out to be mean and greedy and her two daughters take after her.\n"
                + "Soon after that your father also passes away because of an illness.\n"
                + "You’re forced to be a servant to your stepmother and stepsisters, cooking and cleaning for them while they laze around the house.\n"
                + "Until one day…");
    }

    // metodi joka sisältää ensimmäisen valinnan
    // parametrina on skanneri joka lukee syötteitä
    private static int valinta1(Scanner lukija) {
        System.out.println("A prince is having a ball and every noble lady in the country is invited. You will...\n"
                + "1. While your step-mother and -sisters are at the party, take the opportunity and steal all the valuables in the house.\n"
                + "You’ll start a new life in another country.\n"
                + "2. Go to the garden to cry while your step-mother and -sisters dress up and go to the party.");
        int valinta1 = 0;
        // niin kauan kuin käyttäjän valinta on 1 tai 2
        while (valinta1 < 1 || valinta1 > 2) {
            // käyttäjä syöttää valinnan
            valinta1 = lukija.nextInt();
            // jos käyttäjä valitsi valinnan 1
            if (valinta1 == 1) {
                System.out.println(
                        "You sell the valuables with a surprising amount of money and jump the first ship available. Happy ever after achieved!");
                // jos käyttäjä valitsi valinnan 2
            } else if (valinta1 == 2) {
                System.out.println(
                        "A brilliant light emerges suddenly and a mysterious figure appears. It’s a lady with a wand who says she’s your fairy godmother.\n"
                                + "She says she’ll help you get to the party.");
                // jos valinta ei ole 1 tai 2 pyydetään valitsemaan jompikumpi
            } else {
                System.out.println("Please pick either 1 or 2");
            }
        }
        // palautetaan päämetodiin käyttäjän tekemä valinta
        return valinta1;
    }

    // valinta2 metodi toimii samalla tavalla kuin valinta1 metodi
    private static int valinta2(Scanner lukija) {
        System.out.println(
                "1. You nod in agreement and the fairy godmother waves her wand. You’re suddenly wearing a high-class dress and a pair of glass shoes. A pumpkin turns to a carriage and mice to horses.\n"
                        + "2. This seems too good to be true. Pick up your broom and chase that suspicious lady out of your garden.");
        int valinta2 = 0;
        while (valinta2 < 1 || valinta2 > 2) {
            valinta2 = lukija.nextInt();
            if (valinta2 == 1) {
                System.out.println(
                        "When arriving in a fancy carriage and beautiful dress you're welcomed in to the castle with open arms.\n"
                                + "You share an instant connection with the prince and dance happily with him. Untill the clock strikes midnight...");

            } else if (valinta2 == 2) {
                System.out.println(
                        "The angry fairy turns you in to a frog. Your actually enjoying your life as an amphibian when years later, a prince kisses you and the magic is broken.");

            } else {
                System.out.println("Please pick either 1 or 2");
            }
        }
        return valinta2;
    }

    // valinta3 metodi toimii samalla tavalla kuin valinta1 metodi
    private static int valinta3(Scanner lukija) {
        System.out.println(
                "You rush to home, dropping a glass shoe in the hurry. By next morning everything feels like a dream.\n"
                        + "A week later there’s a knock on the door. It’s royal guards, holding a small box.\n"
                        + "It seems every girl in the country has to try out a shoe made out of glass.\n"
                        + "1. Your stepmother tells you to hide. Instead you run to the guards and tell them about the treatment you’re getting.\n"
                        + "2. Your stepmother tells you to hide. After your stepsisters have tried out the shoe, you enter the room and put it on.");
        int valinta3 = 0;
        while (valinta3 < 1 || valinta3 > 2) {
            valinta3 = lukija.nextInt();
            if (valinta3 == 1) {
                System.out.println(
                        "Resisting an order from a prince is concidered treason. In all the hustle and bustle of your stepmother getting arrested everyone forgets about the shoe.\n"
                                + "You gain back your rightful property and allow your stepsisters live with you - as servants of course.");

            } else if (valinta3 == 2) {
                System.out.println(
                        "The shoe fits you perfectly and later the prince later recognizes you as the mysterious lady he had danced with.\n"
                                + "You marry the prince and get a happily ever after - but being a queen isn’t as easy as you think.\n"
                                + "Sometimes you miss the simple days where cleaning was the most of your worries.");

            } else {
                System.out.println("Please pick either 1 or 2");
            }
        }
        return valinta3;
    }

    // lopetus metodia kutsutaan aina kun käyttäjä tekee tarinan keskeyttävän
    // valinnan
    private static void lopetus() {
        System.out.println("The end.");
    }
}