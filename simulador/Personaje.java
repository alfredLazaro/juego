package juego.simulador;

import juego.editor.Ambiente;

public class Personaje{
    private String nombrePers;
    private Ambiente ambAct;
    public Personaje(String nombre){
        nombrePers=nombre;
    }
    public Personaje(String nombre,Ambiente ambAct){
        nombrePers=nombre;
        this.ambAct=ambAct;
    }
    //public void
    public void cambiarAmbiente(Ambiente nuevAmb){
        ambAct=nuevAmb;
    }

    public Ambiente getAmbienteActual(){
        return ambAct;
    }
}