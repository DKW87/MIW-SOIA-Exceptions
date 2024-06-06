package controller;

import model.Vierkant;

import java.util.Scanner;



public class ExceptionsLauncher {
    public static void main(String[] args) {

        //variabelen
        double opgegevenGetal;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Voer een zijde in: ");
        opgegevenGetal = userInput.nextDouble();

        Vierkant aangemaakteVierkant = new Vierkant(opgegevenGetal);
        System.out.println(aangemaakteVierkant);

        System.out.print("Voer een oppervlakte in: ");
        opgegevenGetal = userInput.nextDouble();
        System.out.printf("Met een oppervlakte van %.2f heeft de vierkant een zijde van %.2f. \n",
                opgegevenGetal, Vierkant.berekenZijde(opgegevenGetal));

    } // main
} // klasse
