package com.mycompany.cg21038.poo.guian2;

/**
 *
 * @author ucruz
 */
public class Cg210382023POOGuian2 {

    public static void main(String[] args) {
        Pet dog = new Pet("Perro", 6, 12.4, 1.4);
        File files = new File(24, "Cancer terminal", "Juan Valdez");
        files.consultaInfo();
        files.dateInfo();
        dog.PetInfo();
        System.out.println("$" + files.valorConsulta(dog.getEdad()));
    }
}
