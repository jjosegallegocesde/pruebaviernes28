package org.example.clases;

public class Empleado {

    //ATRIBUTOS
    //(VARIABLES DE JAVA)
    //(FUERTES TIPADAS)
    public String id;
    public String nombres;
    String apellidos;
    String email;
    String direccion;
    String telefono;
    String doucumento;
    char tipoAfiliacionCajaCompensacion;
    byte edad;
    byte numeroHijos;
    float salario;
    short numeroBeneficiarios;
    double cuotaFondoEmpleado;
    double deduccionPrestamoVivienda;
    double deduccionGimnasio;
    double demandaAlimentos;
    double deduccionSalud;
    double deduccionPensiones;
    double deduccionCajaCompensacion;
    double subsidioCajaCompensacion;
    double auxilioTransporte;
    double dotacion;
    double auxilioEscolar;

    //CONSTRUCTOR
    //(METODO ESPECIAL)
    //(CREAR OBJETOS DE LA CLASE)

    public Empleado() {
    }

    //METODOS DE LA CLASE
    //(FUNCIONES DE JAVA)
    //(TODA FUNCION RETORNA ALGO EN JAVA)
    //CUANDO RETORNO NADA (VOID)

    public void saludar(){
        System.out.println("Hola, buenos dias");
    }

}
