
package com.mycompany.cg21038.poo.guian2;



/**
 *
 * @author ucruz
 */
public class Pet {
//    Se manejarán los siguientes atributos: edad, peso, altura, tipo de mascota.
    private String tipoMascota;
    private int edad;
    private double peso;
    private double altura;
    

//constructor explicito
    public Pet(String tipoMascota, int edad, double peso, double altura){
        this.altura = altura;
        this.edad = edad;
        this.peso = peso;
        this.tipoMascota = tipoMascota;
    }
    public void PetInfo(){
        System.out.println("Altura de mascota: "+ this.altura + "m");
        System.out.println("Edad de mascota: "+ this.edad);
        System.out.println("Peso de mascota: "+ this.peso);
        System.out.println("Tipo de mascota:"+ this.tipoMascota);
    }
    
    //getters y setters
    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
 
    
}
