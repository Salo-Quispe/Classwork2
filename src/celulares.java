public class celulares {
    private String marca;
    private String modelo;
    private String almacenamiento;
    private String ram;
    private String procesador;
    private int cantCamaras;
    private String capBaterias;
    private String color;
    private String tamanio;

    public celulares(String pmarca, String pmodelo, String palmacenamiento, String pram, String pprocesador, int pcantCamaras, String pcapBaterias, String pcolor, String ptamanio ){
        marca=pmarca;
        modelo=pmodelo;
        almacenamiento=palmacenamiento;
        ram=pram;
        procesador=pprocesador;
        cantCamaras=pcantCamaras;
        capBaterias=pcapBaterias;
        color=pcolor;
        tamanio=ptamanio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public String getRam() {
        return ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public int getCantCamaras() {
        return cantCamaras;
    }

    public String getCapBateria() {
        return capBaterias;
    }

    public String getColor() {
        return color;
    }

    public String getTamanio() {
        return tamanio;
    }


    /* metodos*/
    @Override
    public String toString(){
        return "la marca del telefono es: " + marca + " el modelo es: "+modelo+" su almacenamiento es de: "+almacenamiento+"tiene "+ram+" de memoria ram, tiene un procesador de: "+procesador+"tiene: "+cantCamaras+", la capacidad de bateria es: "+capBaterias+" es de color "+color+"y mide "+tamanio;

    }
}

