package juego.editor;


import java.util.ArrayList;
import java.util.List;

public class Editor {
    protected List<Entorno> entornos;
    //private Entorno actual;
    public Editor(){
        //actual=new Escenario("edificio");
        entornos=new ArrayList<>();
    }

    public Entorno getEntorno() {
        return getEscenarioDePrueba();
    }

    public Entorno getEscenarioDePrueba() {
        Escenario princ=new Escenario("edificio Principal");

        Escenario plantBaja=new Escenario("planta baja");
        Ambiente biblioteca=new Ambiente("biblioteca");
        //Puerta puertaSalBib=new Puerta("salida Biblioteca",);
        //Puerta puertaSalBib=new Puerta("salida Biblioteca",);
        plantBaja.agregarEntorno(biblioteca); //no llega se va a ningun lado de aqui por que tienes que pasar por una acera y dar la vuelta

        Escenario priPiso=new Escenario("primer Piso");
        Ambiente bibliotecaArrib=new Ambiente("Biblioteca");
        Puerta puertaBibliArri=new Puerta("puertBiblico",bibliotecaArrib);
        priPiso.agregarEntorno(biblioteca);


        //pasillo hacia arriba
        Escenario segPiso=new Escenario("segundo Piso");

        Ambiente aula625C= new Ambiente("aula 625C");
        Ambiente aula625D= new Ambiente("aula 625D");
        Ambiente labo1 = new Ambiente("labo1");
        Ambiente labo2 = new Ambiente("labo2");

        Puerta  puerta625C= new Puerta("aula 625C",aula625C);
        Puerta puerta625D= new Puerta("aula 625D",aula625D);
        Puerta puerLabo = new Puerta("puertLabo1",labo1);
        Puerta puerLab2 = new Puerta("puerLab2",labo2);

        Ambiente pasillo= new Ambiente("pasillo 2do Piso");
        Puerta puerPasillo=new Puerta("salida Pasillo",pasillo);

        pasillo.addElemento(puerta625C);
        pasillo.addElemento(puerta625D);
        pasillo.addElemento(puerLabo);
        pasillo.addElemento(puerLab2);

        aula625C.addElemento(puerPasillo);
        aula625D.addElemento(puerPasillo);
        labo1.addElemento(puerPasillo);
        labo2.addElemento(puerPasillo);

        segPiso.agregarEntorno(pasillo);
        segPiso.agregarEntorno(aula625C);
        segPiso.agregarEntorno(aula625D);
        segPiso.agregarEntorno(labo1);
        segPiso.agregarEntorno(labo2);

        //Entorno amb= new Ambiente("prueba");
        entornos.add(plantBaja);
        entornos.add(priPiso);
        entornos.add(segPiso);
        return entornos.get(2);
    }
}
