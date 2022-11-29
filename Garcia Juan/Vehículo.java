/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaCoche;

/**
 *
 * @author Maste
 */
public class Vehículo {
    //Declaración de atributos
    String matricula;
    String marca;
    String modelo;
    
    public Vehículo(){
    }
    
    /**
    Constructor con parametros
    * @param matricula value String
    * @param marca value String
    * @param modelo value String
    */
    
    public Vehículo(String matricula, String marca, String modelo){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
    }
    /**
     * getmatricula
     * @return the matricula
     * @see #setmatricula (java.lang.String)
     */
    public String getmatricula() {
        return matricula;
    }
    /**
     * setmatricula
     * @param matricula value String
     */
    public void setmatricula(String matricula) {
        this.matricula = "5432JYV";
    }

    
    /**
     * getmarca
     * @return 
     */
    public String getmarca() {
        return marca;
    }
    /**
     * setmarca
     * @param marca 
     */
    public void setmarca(String marca) {
        this.marca = "BMW";
    }

    
    /**
     * getmodelo
     * @return 
     */
    public String getmodelo() {
        return modelo;
    }
    /**
     * setmodelo
     * @param modelo 
     */
    public void setmodelo(String modelo) {
        this.modelo= "X6";
    }
    
    @Override
    public String toString() {
        return "Coche{" + "matrícula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + '}';
    }
}
