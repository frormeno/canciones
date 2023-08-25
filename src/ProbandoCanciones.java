/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class ProbandoCanciones {
    
    public static void main(String[] args) {       
        
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion("Sueve", "Wey", 322, false, 'N');
        
        //modificar cancion1
        cancion1.setTitulo("Creep");
        cancion1.setArtista("Radiohead");
        cancion1.setTiempoDuracion(328);
        cancion1.setDescargar('N');
        
        System.out.println(cancion1.getTitulo()+" se adelanto.."+cancion1.adelantarCanciones(10, 0)+" segundos");
        System.out.println("*********************************");
        System.out.println(cancion1.obtenerTipoCancion());
        System.out.println("*********************************");
        System.out.println("");
           
        
        
    }
    
    
    
    
    
}
