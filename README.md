# Opdracht: Exception Handling in Java

## Inleiding
Het doel van deze opdracht is om kennis te maken met exception handling in Java. In deze opdracht
ga je de gebruiker om de zijde dan wel de oppervlakte van een vierkant vragen. Als de gebruiker (perongeluk) een letter of woord intypt in plaats van een getal, dan moet het programma dit netjes
afhandelen. Ook kan het zijn dat de gebruiker een negatieve oppervlakte opgeeft. Dat mag natuurlijk
niet. De methode die bij de oppervlakte een zijde terugrekent kan dan verkeerde resultaten geven.
Ook in dit geval gaan we dit netjes afhandelen.

## Stappenplan

1. Maak project met een klasse genaamd Vierkant met een attribuut zijde van het type double.
   * Gebruik encapsulation, maak getters en setters.
   * Maak een default constructor en een all-args constructor.
   * Maak een toString() methode voor deze klasse.
   * Maak een methode getOppervlakte() die op basis van de zijde de juiste oppervlakte
     berekent.
   * Maak een statische methode berekenZijde(double oppervlakte), die op basis van
     een oppervlakte de bijbehorende zijde terugrekent. Gebruik hierbij de methode
     Math.sqrt().

2. Test de klasse door in de main method het volgende te doen:
   * Vraag de gebruiker om een zijde. Maak een Vierkant object met die zijde en geef de
     gebruiker de oppervlakte terug.
   * Kijk wat er gebeurt als de gebruiker een letter of woord intypt.
   * Vraag de gebruiker om een oppervlakte en geef de gebruiker de bijbehorende zijde.
   * Kijk wat er gebeurt als de gebruiker een negatieve waarde intypt als oppervlakte.

3. Gebruik exception handling om de fout af te handelen, die ontstaat als een gebruiker een letter of
   woord intypt in plaats van een getal.
   * Maak een try-catch block om de invoerafhandeling, zodat de exception die ontstaat bij
     verkeerde input wordt opgevangen.
   * Maak een loop die steeds controleert of de gebruiker niet een verkeerde input verstrekt en
     geef een juiste melding ("Je moet een getal invoeren met een komma."), totdat de gebruiker
     een getal geeft.

4. Voeg een controle toe aan de methode berekenZijde(double oppervlakte).
   * Laat de methode een exception gooien als de waarde van oppervlakte kleiner dan 0 is.
     Kijk of er een geschikte exception in Java bestaat.
   * Zorg dat je in de main method de exception op de juiste manier afhandelt.
   * Zorg er weer voor dat de gebruiker geholpen wordt, zodra deze een fout maakt. Let op, de
     gebruiker moet een getal invullen én deze mag niet negatief zijn.