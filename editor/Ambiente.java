package juego.editor;
import java.util.*;
public class Ambiente extends Entorno{
    private List<Elemento> elementos;
    public Ambiente(String nombre){
        super(nombre);
        elementos=new ArrayList<Elemento>();
        //this.nombre=nombre;
    }
    //agregar elemento
    public void addElemento(Elemento elemento){
        elementos.add(elemento);
    }
    public Puerta buscarPuerta(){
        Puerta puertaCercana=new Puerta("",null);
        for (Elemento elemento:elementos){
            if(elemento instanceof Puerta){
                puertaCercana=(Puerta) elemento;
                break;
            }
        }
        return puertaCercana;
    }
    public List<Puerta> getPuertas(){
        ArrayList<Puerta> list=new ArrayList<>();
        for (Elemento e: elementos) {
            if(e instanceof Puerta){
                Puerta puerta=(Puerta) e;
                list.add(puerta);
            }
        }
        return list;
    }
    public Puerta getPuerta(int posic){
        Puerta puert=null;
       return puert;
    }
    public Ambiente getAmbiente(){
        return null;
    }

}