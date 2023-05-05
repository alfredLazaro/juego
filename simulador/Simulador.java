package juego.simulador;

import juego.editor.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Simulador {

    private Entorno entornAct; //tiene entorno actual
    private Personaje jugador;
    public Simulador(Entorno entornoAct) {
        jugador= new Personaje("jugador1");
        this.entornAct=entornoAct;
    }

    public void run()  {
        System.out.println("Corriendo el simulador");
        Editor edit=new Editor();
        //entornAct =
        //entornAct=(Escenario)edit.getEscenarioDePrueba();
        //for(int i=0;i<entornAct.len)
        Ambiente ambAct=entornAct.getAmbiente();
        jugador.cambiarAmbiente(ambAct);
        boolean caminando=true;
        while(caminando){
            System.out.print("actualmente me encuentro en: ");
            ambAct=jugador.getAmbienteActual();
            System.out.println(ambAct.getNombre());
            //System.out.println("Puedes moverte a:");

            ArrayList<Puerta> puertas=(ArrayList<Puerta>) ambAct.getPuertas();
            int tam=puertas.size();
            for(int i=1;i<=tam;i++){
                System.out.println(i+") "+puertas.get(i-1).getDestino().getNombre());
            }
            System.out.println("escoge el numero para elegir donde ir o 0 para salir:");
            int pos=0;
            Scanner sc=new Scanner(System.in);
            pos=sc.nextInt();
            if(pos>0 && pos<=tam){
                Puerta puerta=puertas.get(pos-1);
                puerta.interactuar(jugador);
            }else if(pos==0){
                System.out.println("adios");
                caminando=false;
            }else{
                System.out.println("no esta poniendo una direccion real");
            }
        }

        /*System.out.println("me cambio al ambiente de la puerta que encuentre primero: ");
        Puerta puerta1=ambAct.buscarPuerta();
        puerta1.interactuar(jugador);
        System.out.print("actualmente me encuentro en: ");
        System.out.println(jugador.getAmbienteActual().getNombre());
        */


    }
}
