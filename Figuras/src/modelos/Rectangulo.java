package modelos;

<<<<<<< HEAD

/*
 * clase que representa rectangulo
 * contiene metodos para area y perimetro
 * 
 * @version 1.0
 * 
 * @author pp
 */

public class Rectangulo extends Figura{

	

	private double base;
	private double altura;
	
	
	/**
	 * Constructor por defecto. Crea un rectangulo base y altura 1, en metros
	 */
	public Rectangulo() {
		this.base = 1;
		this.altura = 1;
	}
	
	/**
	 * Constructor que recibe como parametros la base y la altura del rectangulo,
	 * en metros
	 * 
	 * @param base  la base del rectangulo, en metros
	 * @param altura  la altura del rectangulo, en metros
	 */
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
		
	}
	
	
	
	/**
	 * 
	 * @see modelos.Figura#area()
	 */

	@Override
	public double area() {
		//TODO auto-generated method stub
		return base * altura;
	}
	
	/**
	 * 
	 * @see modelos.Figura#perimetro()
	 */
	@Override
	public double perimetro() {
		//TODO auto-generated method stub
		return 2*base + 2*altura;
	}
	
}
=======
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
>>>>>>> fed38ea8f5de2cf45e96b1f0b510a3807f13c47d
