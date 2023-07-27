/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
class Datos {
    private String nombre;
    private String edad;
    private String dni;
    private String tipo;
    private String fecha;
    private String salario;
    private String id;
    private static int contadorRegistros = 0;
    // Constructor
    public Datos(String nombre, String edad, String dni, String tipo, String fecha, String salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.tipo = tipo;
        this.fecha = fecha;
        this.salario = salario;
        this.id = generarID();
    }

    // Getters y Setters (opcional, dependiendo de tus necesidades)
    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public String getTipo() {
        return tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getSalario() {
        return salario;
    }
    public String getID() { 
        return id;
    }
    private String generarID() {
        contadorRegistros++;
        return String.format("%05d", contadorRegistros);
    }
    
    // Listado para almacenar los empleados registrados
    private static List<Empleados> listaEmpleados = new ArrayList<>();

    // Método para agregar un empleado a la lista
    public static void agregarEmpleado(Empleados empleado) {
        listaEmpleados.add(empleado);
    }

    // Método para obtener el listado completo de empleados
    public static List<Empleados> obtenerListaEmpleados() {
        return listaEmpleados;
    }

}
// Subclase Empleados que hereda de la clase Datos
class Empleados extends Datos {
    private String cargo;

    public Empleados(String nombre, String edad, String dni, String tipo, String fecha, String salario, String cargo) {
        super(nombre, edad, dni, tipo, fecha, salario);
        this.cargo = cargo;
    }
    
    // Método getter y setter para el atributo cargo
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}