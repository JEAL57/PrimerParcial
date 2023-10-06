package Modelos;

public abstract class Vehiculo {
    
    //Atributos
    protected String marca;
    protected String modelo;
    protected int año;
    protected String propietario;
    protected String placa = "0000";
    
    //Constructores
    public Vehiculo(String marca, String modelo, int año, String propietario, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.propietario = propietario;
        this.placa = placa;
    }
    
    //Metodos
    public abstract String mostrarInformacion();

}
