
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

