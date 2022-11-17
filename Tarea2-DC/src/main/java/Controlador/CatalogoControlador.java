package Controlador;

import Modelo.Camisa;
import Modelo.Catalogo;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Locale;


public class CatalogoControlador {
    public static ArrayList<Camisa> conjuntoCamisas = new ArrayList<Modelo.Camisa>();
    public static ArrayList<Catalogo> conjuntoCatalogo = new ArrayList<>();
    public static void registrarCatalago(){
        LocalDate creacion = LocalDate.now();
        Month mes = LocalDate.now().getMonth();
        Year year= Year.of(LocalDate.now().getYear());
        String nombreMes= mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
        String nombreCatalogo= nombreMes+year;
        Catalogo catalogo= new Catalogo(creacion,nombreCatalogo,conjuntoCamisas);
        conjuntoCatalogo.add(catalogo);
    }

    public static boolean registrarCamisa(int id) {
        boolean idRegistrada = false;
        for (int i = 0; i < CamisaControlador.conjuntoId.size(); i++) {
            if (id == (CamisaControlador.conjuntoId.get(i))) {
                conjuntoCamisas.add(CamisaControlador.conjuntoCamisas.get(i));
                idRegistrada = true;
                break;
            }else{
                idRegistrada= false;
            }
        }
        return idRegistrada;
    }
    }

