/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Nestor
 */
public class RinconPack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Almacen almacen = new Almacen();
        Paquete paquete1 = new Paquete("COD-01", 3, "Madrid");
        Paquete paquete2 = new Paquete("COD-02", 36, "Barcelona");
        Paquete paquete3 = new Paquete("COD-03", 37, "Madrid");
        Paquete paquete4 = new Paquete("COD-03", 37, "Madrid");

        almacen.recepcionarPaquete(paquete1, 0, 2);
        almacen.recepcionarPaquete(paquete2, 1, 2);
        almacen.recepcionarPaquete(paquete3, 2, 2);

        almacen.enviarCamion(0, 2);
        almacen.enviarCamion(1, 2);
        almacen.enviarCamion(2, 2);

        almacen.mantenimientoSeguridad(30);

    }

}
