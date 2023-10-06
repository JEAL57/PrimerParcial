package Modelos;

public class Motocicleta extends Vehiculo{
    //Atributos
    protected double cilindrada;
    
    //COnstructor
    public Motocicleta(String marca, String modelo, int año, String propietario, String placa, double cilindrada) {
        super(marca, modelo, año, propietario, placa);
        this.cilindrada = cilindrada;
    }
    
    //Getters
    public double getCilindrada() {
        return cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public String getPropietario() {
        return propietario;
    }

    public String getPlaca() {
        return placa;
    }
    
    
    //Metodos
    @Override
    public String mostrarInformacion() {
        int circulacion = 2023-año;
        return "Automovil:\nMarca: "+marca+"\nModelo: "+modelo+"\nAño: "+año+"\nPropietario:"+propietario+
                "\nPLaca: "+placa+"\nCilindrada: "+cilindrada+"\nAños en circulacion: "+circulacion+"\nPlaca:"+placa;
    }
    
}
