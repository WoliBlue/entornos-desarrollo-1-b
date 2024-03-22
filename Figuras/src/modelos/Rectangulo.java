package modelos;

import java.util.*;

/**
 * 
 */
public class Rectangulo {

    /**
     * Default constructor
     */
    public Rectangulo() {
    }

    /**
     * 
     */
    public double base;

    /**
     * 
     */
    public double altura;

    /**
     * 
     */
    public void base() {
        // TODO implement here
    }

    /**
     * @param base 
     * @param altura
     */
    public Rectangulo(double base, double altura) {
        // TODO implement here
    }

    /**
     * @return
     */
    public double getBase() {
        // TODO implement here
        return this.base;
    }

    /**
     * @param base 
     * @return
     */
    public void setBase(double base) {
        // TODO implement here
        this.base = base;
    }

    /**
     * @return
     */
    public double getAltura() {
        // TODO implement here
    	return this.altura;
    }

    /**
     * @param altura
     * @return
     */
    public void setAltura(double altura) {
        // TODO implement here
    	 this.altura = altura;
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
    	return "Rectangulo es:" + "(base=" + base + ", altura=" + altura + ")";
    }

    /**
     * @return
     */
    public double getArea() {
        // TODO implement here
    	return this.base * this.altura;
    }

    /**
     * @return
     */
    public double getPerimetro() {
        // Me habia olvidado de lo que era un perimetro lol
    	return 2 * (this.base + this.altura);
    }


}