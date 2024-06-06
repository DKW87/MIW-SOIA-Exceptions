package model;

public class Vierkant {

    // attributen

    private double zijde;

    // constructors

    public Vierkant(double zijde) {
        this.setZijde(zijde);
    }

    // methoden

    public double getOppervlakte(){
        return this.zijde * this.zijde;
    }

    public static double berekenZijde(double oppervlakte) throws IllegalArgumentException {
        final double NUL = 0.00;

        if (oppervlakte < NUL) {
            throw new IllegalArgumentException("Jaar ervaring moet groter dan 0 zijn.");
        }

        return Math.sqrt(oppervlakte);
    }

    @Override
    public String toString() {
        return String.format("Met een zijde van %.2f heeft het de vierkant de volgende oppervlakte: %.2f",
                zijde, this.getOppervlakte());
    }

    // getters en setters

    public void setZijde(double zijde) {
        this.zijde = zijde;
    }
}