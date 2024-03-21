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
        return "";
    }

    /**
     * @return
     */
    public int getNumHabitaciones() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getMetrosCuadrados() {
        // TODO implement here
        return 0;
    }

    /**
     * @param direccion
     */
    public void setDireccion(String direccion) {
        // TODO implement here
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
    public void setMetrosCuadrados(int metrosCuadrados) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        return "";
    }

}