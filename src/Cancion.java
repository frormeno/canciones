/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pancho
 * @version 24/08/2023
 */
public class Cancion {
   
    private String titulo, artista;
    private int tiempoDuracion;//segundos
    private boolean favorita;//true: favorita, false: no favorita
    private char descargar;//'S': si, 'N': no

    //constructores
    
    public Cancion() {
    }

    public Cancion(String titulo, String artista, int tiempoDuracion, boolean favorita, char descargar) {
        this.titulo = titulo;
        this.artista = artista;
        this.tiempoDuracion = tiempoDuracion;
        this.favorita = favorita;
        this.descargar = descargar;
    }
    
    //accesadores y muradores

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getTiempoDuracion() {
        return tiempoDuracion;
    }

    public void setTiempoDuracion(int tiempoDuracion) {
        this.tiempoDuracion = tiempoDuracion;
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }

    public char getDescargar() {
        return descargar;
    }

    public void setDescargar(char descargar) {
        this.descargar = descargar;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", artista=" + artista + ", tiempoDuracion=" + tiempoDuracion + ", favorita=" + favorita + ", descargar=" + descargar + '}';
    }
    
    //customer
    
    public int adelantarCanciones(int segundosAdd, int segundosActuales)
    {
        segundosActuales=segundosActuales + segundosAdd; //segundosActuales += segundosAdd
        return segundosActuales;
    }
    public void imprimirCanciones()
    {
        int minutos= 0 ,segundos = 0; //variables locales, se debe inicializar de inmediato
        minutos= this.tiempoDuracion /60;
        segundos= this.getTiempoDuracion() - minutos *60;
        System.out.println("Cancion: "+ this.getTitulo());
        System.out.println("Artistas: "+this.artista);
        System.out.println("Duracion: "+ minutos +":"+ segundos);
        
    }
    
    public String obtenerTipoCancion()
    {
        //5minutos * 60 -->300 segundos
        //if+tab
        //ifelse+tab
        if (this.getTiempoDuracion() >=300) 
        {
            return "larga";
        }
        else
        {
            return "normal";
        }
    }
    
    
}
