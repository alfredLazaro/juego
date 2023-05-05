package juego.editor;

import juego.simulador.Personaje;

public class Puerta extends Elemento{
    //private String nombre;

    private Ambiente destino;
    public Puerta(String nombre,Ambiente destino){
        super(nombre);
        this.destino=destino;
    }
    public void interactuar(Personaje personaje){
        //mueve el personaje a un nuevo ambiente
        personaje.cambiarAmbiente(destino);
    }
    public Ambiente getDestino(){
        return destino;
    }
}