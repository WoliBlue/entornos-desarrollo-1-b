package modelos;
import java.util.*;

/**
 * Represents a house in real life
 */
public class casa {

    /**
     * 
     */
    public casa() {
    }

    /**
     * Constructor que recibe la direccion de la casa, el numero de habitaciones y los metros cuadrados
     * 
     * @param direccion 				 direccion casa
     * @param numHabitaciones 			numero de habitaciones
     * @param metrosCuadrados			metros cuadrados
     */
    public  casa(String direccion, int numHabitaciones, int metrosCuadrados) {
        // TODO implement here
    	this.direccion = direccion;
    	this.numHabitaciones = numHabitaciones;
    	this.metroscuadrados = metrosCuadrados;
    }

    public String direccion;

    /**
     * 
     */
    public int numHabitaciones;

    /**
     * 
     */
    public int metroscuadrados;


    /**
     * @return
     */
    public String getdireccion() {
        // TODO implement here
        return this.direccion;
    }

    /**
     * @return
     */
    public int getNumHabitaciones() {
        // TODO implement here
        return this.numHabitaciones;
    }

    /**
     * @return
     */
    public int getmetrosCuadrados() {
        // TODO implement here
        return this.getmetrosCuadrados();
    }

    /**
     * @param direccion
     */
    public void setDireccion(String direccion) {
        // TODO implement here
    	this.direccion = direccion;
    }

    /**
     * @param NumHabitaciones
     */
    public void setNumHabitaciones(int NumHabitaciones) {
        // TODO implement here
    	
    }

    /**
     * @param metrosCuadrados
     */
    public void setmetrosCuadrados(int metrosCuadrados) {
        // TODO implement here
    	this.metroscuadrados = metrosCuadrados;
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        return direccion + " " + numHabitaciones + " " + metroscuadrados;
    }

}