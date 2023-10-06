package Modelos;

public class Automovil extends Vehiculo{
    //Atributo
    protected int numPuertas;
    
    //Constructor
    public Automovil(String marca, String modelo, int año, String propietario, String placa, int numPuertas) {
        super(marca, modelo, año, propietario, placa);
        this.numPuertas = numPuertas;
    }
    
    //Getters
    public int getNumPuertas() {
        return numPuertas;
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

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    

    public String getPlaca() {
        return placa;
    }
    

    //Metodos
    @Override
    public String mostrarInformacion() {
        int circulacion = 2023-año;
        return "Automovil:\nMarca: "+marca+"\nModelo: "+modelo+"\nAño: "+año+"\nPropietario:"+propietario+
                "\nPLaca: "+placa+"\nNumero de puertas: "+numPuertas+"\nAños en circulación:"+circulacion+"\nPlaca:"+placa;
    }
    
    
}
