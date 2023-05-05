package juego.editor;
import java.util.*;
public class Escenario extends Entorno{
    private List<Entorno> entornos;
    public Escenario(String nombEsc){
        super(nombEsc);
        entornos = new ArrayList<Entorno>();
    }
    public void agregarEntorno(Entorno entorAct){
        if(entorAct instanceof Ambiente) {
            entornos.add((Ambiente)entorAct);
            //System.out.println("se agrego el entorno(ambiente)");
        }

    }
    public Ambiente getAmbiente(){
        Ambiente ambi=null;
        //busco el primero que es ambiente y luego devuelvo ese
        for(Entorno ent:entornos){
            if(ent instanceof Ambiente){
                ambi=(Ambiente) ent;
                break;
            }
        }
        return ambi;
    }

}