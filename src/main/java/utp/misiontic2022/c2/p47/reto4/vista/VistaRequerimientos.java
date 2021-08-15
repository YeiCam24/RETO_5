package utp.misiontic2022.c2.p47.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        try {
            ArrayList<Requerimiento_1> listaRequerimiento_1;
            listaRequerimiento_1 = controlador.consultarRequerimiento1();

            for(Requerimiento_1 requerimiento_1 : listaRequerimiento_1){
                System.out.println(
                    requerimiento_1.getFechaCompra() + " " +
                    requerimiento_1.getCodCompra() + " " +
                    requerimiento_1.getNombreProveedor() + " " +
                    requerimiento_1.getPagado()
                );
            }

        } catch (Exception e) {
            System.err.println("error en controlador requerimiento 1"+e);
        }
    }

    public static void requerimiento2(){
        try {
            ArrayList<Requerimiento_2> listaRequerimiento_2;
            listaRequerimiento_2 = controlador.consultarRequerimiento2();

            for(Requerimiento_2 requerimiento_2: listaRequerimiento_2){
                System.out.println(
                    requerimiento_2.getFechaInicial() + " " +
                    requerimiento_2.getNombreCiudad() + " " +
                    requerimiento_2.getConstructora() + " " +
                    requerimiento_2.getNombreLider()  + " " +
                    requerimiento_2.getCodigoTipo()   + " " +
                    requerimiento_2.getEstrato() 
                );
            }

        } catch (Exception e) {
            System.err.println("Error en controlador requerimiento 2"+e);
        }
    }

    public static void requerimiento3(){
        try {
            ArrayList<Requerimiento_3> listaRequerimiento_3;
            listaRequerimiento_3 = controlador.consultarRequerimiento3() ;

            for(Requerimiento_3 requerimiento_3: listaRequerimiento_3){
                System.out.println(
                    requerimiento_3.getAbrev() 
                );
            }
        } catch (Exception e) {
            System.err.println("Error en controlador requerimiento 3"+e);
        }
    }
    
}
