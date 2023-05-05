package juego.editor;
import juego.simulador.Personaje;
public abstract class Elemento{
    protected String nombre;

    public Elemento(String nombre){
        this.nombre=nombre;
    }

    abstract void interactuar(Personaje personaje);

}