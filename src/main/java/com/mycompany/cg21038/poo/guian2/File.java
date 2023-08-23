
package com.mycompany.cg21038.poo.guian2;


import java.time.LocalDateTime;

/**
 *
 * @author ucruz
 */
public class File {
//atributos: número de consulta, diagnostico, fecha y hora
//de la consulta, nombre del veterinario que atendió a la mascota

    private int numeroConsulta;
    private String diagnostico;
    private LocalDateTime fechaConsulta;
    private String nombreVeterinario;

    public File(int numeroConsulta, String diagnostico, String nombreVeterinario) {
        this.numeroConsulta = numeroConsulta;
        this.diagnostico = diagnostico;
        this.nombreVeterinario = nombreVeterinario;
        this.fechaConsulta = LocalDateTime.now();

    }

    public void consultaInfo() {
        System.out.println("No de consulta: " + this.numeroConsulta);
        System.out.println("Diagnostico: " + this.diagnostico);
        System.out.println("Nombre de veterinario: " + this.nombreVeterinario);
    }

    public void dateInfo() {
        System.out.println("Fecha de consulta: " + this.fechaConsulta);

    }

    /*
    Un perro con una edad menor a 2 años tiene valor de cita de $10.00, 
    un perro mayor a 2 años, pero menor a 7 años el valor de cita es de $25.00 
    un perro mayor a 7 años el valor de cita es de $35.00";     
     */
    public double valorConsulta(int edad) {
        double valorCita = 0.00;
        if (edad < 2) {
            valorCita = 10.00;
        }
        if (edad > 2 && edad < 7) {
            valorCita = 25.00;
        }
        if (edad > 7) {
            valorCita = 35.00;
        }
        return valorCita;
    }

    //setters and getters
    public int getNumeroConsulta() {
        return numeroConsulta;
    }

    public void setNumeroConsulta(int numeroConsulta) {
        this.numeroConsulta = numeroConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public LocalDateTime getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(LocalDateTime fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getNombreVeterinario() {
        return nombreVeterinario;
    }

    public void setNombreVeterinario(String nombreVeterinario) {
        this.nombreVeterinario = nombreVeterinario;
    }

}

