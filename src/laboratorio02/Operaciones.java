/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio02;

/**
 *
 * @author DOCENTE
 */
public class Operaciones {
    
    private float elemento1;
    private float elemento2;

    public Operaciones(float elemento1, float elemento2) {
        this.elemento1 = elemento1;
        this.elemento2 = elemento2;
    }
    
    
    /**
     * @return the elemento1
     */
    public float getElemento1() {
        return elemento1;
    }

    /**
     * @param elemento1 the elemento1 to set
     */
    public void setElemento1(float elemento1) {
        this.elemento1 = elemento1;
    }

    /**
     * @return the elemento2
     */
    public float getElemento2() {
        return elemento2;
    }

    /**
     * @param elemento2 the elemento2 to set
     */
    public void setElemento2(float elemento2) {
        this.elemento2 = elemento2;
    }
    
    public float sumar(){
        return this.elemento1 + this.elemento2;
    }
    
    public float restar(){
        return this.elemento1 - this.elemento2;
    }
   
    public float multiplicar(){
        return this.elemento1 * this.elemento2;
    }
    public float dividir(){
        return this.elemento1 / this.elemento2;
    }
}
