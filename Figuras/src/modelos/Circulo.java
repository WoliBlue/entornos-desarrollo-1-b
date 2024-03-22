package modelos;
import java.util.*;

/**
 * 
 */
public class Circulo {

    /**
     * Default constructor
     */
    public Circulo() {
    }

    /**
     * 
     */
    private double radio;

    /**
     * 
     */
    public void Circulo() {
        // TODO implement here
    }

    /**
     * @param radio
     */
    public Circulo(double radio) {
        // TODO implement here
        this.radio = radio;
    }

    /**
     * @return
     */
    public double getRadio() {
        // TODO implement here
        return this.radio;
    }

    /**
     * @param radio 
     * @return
     */
    public void setRadio(double radio) {
        // TODO implement here
        this.radio = radio;
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        return "Circulo es" + "(radio= " + radio + ")";
    }

    /**
     * @return
     */
    public double getArea() {
        // TODO implement here
        return 3.14 * this.radio * this.radio;
    }

    /**
     * @return
     */
    public double getPerimetro() {
        // TODO implement here
        return 2 * 3.14 * this.radio;
    }

}