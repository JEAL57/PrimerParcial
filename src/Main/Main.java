package Main;

import Modelos.Vehiculo;
import Modelos.Automovil;
import Modelos.Motocicleta;

public class Main {

    public static void main(String[] args) {
        //Arreglo de vehiculos
        Vehiculo[] vehiculos = new Vehiculo[4];
        
        //Crear Instancias para agregar al arreglo
        Automovil auto1 = new Automovil("Hyunday", "Camioneta", 2020, "NIckole", "5716", 4);
        Automovil auto2 = new Automovil("Nissan", "Deportivo", 2000, "Alexis", "1657", 2);
        
        
        Motocicleta moto1 = new Motocicleta("Susuki", "Stunt", 2012, "Jhon", "6969", 120);
        Motocicleta moto2 = new Motocicleta("Yamaha", "Trabajo", 2017, "Richard", "1234", 100);
        
        //Añadir obj al Array
        vehiculos[0] = auto1;
        vehiculos[1] = auto2;
        vehiculos[2] = moto1;
        vehiculos[3] = moto2;
        
        //Imprimir array
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.mostrarInformacion());
            System.out.println("----------------------\n");
        }
        
        //Modificar propietario de auto2
        auto2.setPropietario("Juanes");
        
        //Imprimir array
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.mostrarInformacion());
            System.out.println("----------------------\n");
        }
    }
    
}