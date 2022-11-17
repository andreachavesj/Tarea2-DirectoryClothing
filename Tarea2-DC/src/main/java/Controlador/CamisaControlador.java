package Controlador;

import Modelo.Camisa;
import Modelo.Cliente;

import java.util.ArrayList;

public class CamisaControlador {
    public static ArrayList<Camisa> conjuntoCamisas=new ArrayList<Camisa>();
    public static ArrayList<Integer> conjuntoColores=new ArrayList<>();
    public static ArrayList<String> conjuntoTallas=new ArrayList<>();
    public static ArrayList<Integer> conjuntoId=new ArrayList<>();

    public static boolean registrarCamisa(int id, int color, String tamaño, String descripcion, String imagen, Double precio) {
        boolean correcto= true;
        conjuntoColores.add(1111);
        conjuntoColores.add(1010);

        for (int i=0;i<conjuntoColores.size();i++){
            if((color== conjuntoColores.get(i))&&(verificarId(id)==true)&&(tamaño.equalsIgnoreCase("S"))||(tamaño.equalsIgnoreCase("M"))||(tamaño.equalsIgnoreCase("L"))){
                Camisa camisa = new Camisa(id, color, tamaño, descripcion, imagen, precio);
                conjuntoId.add(id);
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

    public static boolean verificarId(int id){
        boolean idRepetida=false;
        for (int i=0;i<conjuntoId.size();i++){
            if (id==(conjuntoId.get(i))){
                idRepetida=true;
                break;
            }
        }
        if(idRepetida==false){
            return true;
        }else{
            return false;
        }
    }

}
