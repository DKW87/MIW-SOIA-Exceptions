package controller;

import model.Vierkant;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsLauncher {
    public static void main(String[] args) {

        //variabelen
        double opgegevenGetal;
        boolean invoerCorrect = false;
        Scanner userInput = new Scanner(System.in);

        do {

            System.out.print("Voer een zijde in: ");

            try {
                opgegevenGetal = userInput.nextDouble();
                Vierkant aangemaakteVierkant = new Vierkant(opgegevenGetal);
                System.out.println(aangemaakteVierkant);
                invoerCorrect = true;
            }
            catch (InputMismatchException geenGetal) {
                System.out.println("Je moet een getal invoeren met een komma!");
                userInput.nextLine(); // clear buffer
            }

        } while (!invoerCorrect);

        invoerCorrect = false;

        do {

            System.out.print("Voer een oppervlakte in: ");

            try {
                opgegevenGetal = userInput.nextDouble();
                System.out.printf("Met een oppervlakte van %.2f heeft de vierkant een zijde van %.2f. \n",
                        opgegevenGetal, Vierkant.berekenZijde(opgegevenGetal));
                invoerCorrect = true;
            }
            catch (InputMismatchException geenGetal) {
                System.out.println("Je moet een getal invoeren met een komma!");
                userInput.nextLine(); // clear buffer
            }
            catch (IllegalArgumentException negatiefGetal) {
                System.out.println(negatiefGetal.getMessage());
                userInput.nextLine(); // clear buffer
            }

        } while (!invoerCorrect);

    } // main
} // klasse