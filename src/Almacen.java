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

    private Paquete[][] muelleFisico;
    private HashSet<String> registroSeguridad;
    private ArrayList<Paquete> colaSalida;
    private HashMap<String, Integer> estadisticas;

    public Almacen() {
        this.muelleFisico = new Paquete[3][3];  //Array Bidimensional de objetos Paquete de3 3x3
        this.registroSeguridad = new HashSet<>(); //HashSet<String> para almacenar los códigos de los paquetes   
        this.colaSalida = new ArrayList<>();//Un ArrayList<Paquete> para los paquetes que han sido despachados
        this.estadisticas = new HashMap<>(); //HashMap que asocie cada ciudad de destino.
    }

    public void recepcionarPaquete(Paquete p, int fila, int col) {
        //Verifica si en codigo del paquete ya existe y en ese caso generamos error y salimos
        if (this.registroSeguridad.contains(p.getCodigo())) {
            System.out.println("Eror: el codigo ya existe");
            return;
        }
        //Si la posicion esta libre, almacena el paquete y registra su codigo
        if (muelleFisico[fila][col] == null) {
            muelleFisico[fila][col] = p;
            registroSeguridad.add(p.getCodigo());
            System.out.println("El paquete se ha almacenado en la posicion " + fila + "," + col);
        } else {
            System.out.println("Error: La posicion  " + fila + "," + col + "ya esta ocupada");
        }
    }

    public void enviarCamion(int fila, int col) {
        int contador = 0;
        Paquete p = muelleFisico[fila][col];
        muelleFisico[fila][col] = null;
        colaSalida.add(p);
        
        //Actualizar las estadisticas
        contador = estadisticas.getOrDefault(p.getDestino(), 0);
        estadisticas.put(p.getDestino(), contador + 1);
        
    }

    public void mantenimientoSeguridad(double pesoMaximo) {
    }
}
