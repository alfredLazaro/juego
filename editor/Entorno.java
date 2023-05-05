package juego.editor;

public abstract class Entorno {
    private String nombre;
    public Entorno(String nomb){
        nombre=nomb;
    }

    public abstract Ambiente getAmbiente();
    //public abstract void agregarEntorno(Entorno entAct);
    public String getNombre(){
        return nombre;
    }
}
