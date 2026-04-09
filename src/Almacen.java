/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Nestor
 */
public class Almacen {

        //Array Bidimensional de objetos Paquete de3 3x3
        Paquete[][] muelle = new Paquete[3][3];
        //HashSet<String> para almacenar los códigos de los paquetes
        HashSet<String> listadoPaquete = new HashSet<>();
        //Un ArrayList<Paquete> para los paquetes que han sido despachados
        ArrayList<Paquete> despachados = new ArrayList<>();
        //HashMap que asocie cada ciudad de destino.
        HashMap<String, Integer> estadisticas = new HashMap<>();
    
    public void recepcionarPaquete(Paquete p, int fila, int col){
    }
    public void enviarACamion(int fila, int col){  
    }
    public void mantenimientoSeguridad(double pesoMaximo){
    }
}
