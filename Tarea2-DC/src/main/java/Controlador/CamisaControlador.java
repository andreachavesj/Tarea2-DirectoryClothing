package Controlador;

import Modelo.Camisa;

import java.util.ArrayList;

public class CamisaControlador {
    public static ArrayList<Camisa> conjuntoCamisas=new ArrayList<Camisa>();
    public static ArrayList<Integer> conjuntoColores=new ArrayList<>();
    public static ArrayList<String> conjuntoTallas=new ArrayList<>();

    public static boolean registrarCamisa(int id, int color, String tamaño, String descripcion, String imagen, Double precio) {
        boolean correcto = true;
        conjuntoColores.add(1111);
        conjuntoColores.add(1010);
        conjuntoColores.add(2001);
        for (int i=0;i<conjuntoColores.size();i++){
            if((color== conjuntoColores.get(i))&&(tamaño.equalsIgnoreCase("S"))||(tamaño.equalsIgnoreCase("M"))||(tamaño.equalsIgnoreCase("L"))){
                Camisa camisa = new Camisa(id, color, tamaño, descripcion, imagen, precio);
                conjuntoCamisas.add(camisa);
                correcto= true;
                break;
            }else{
                correcto= false;
            }
        }
        return correcto;
    }
    public static void agregarColor(int color){
        conjuntoColores.add(color);
    }
}
