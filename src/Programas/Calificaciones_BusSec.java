
package Programas;

import javax.swing.JOptionPane;

/**
 *
 * @author Javie
 */
public class Calificaciones_BusSec {
    public static void main(String[] args) {
        
        int arreglo[] = {4,1,5,2,3};
        int dato;
        boolean band = false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar"));
        
        //Busqueda Secuencial 
        int i=0;
        while(i<5 && band == false){
        if(arreglo[i]==dato){
           band = true;
        }
       i++; 
        }
       if(band == false){
           JOptionPane.showMessageDialog(null, "El numero no se encuantra en el arreglo");
           
       }
       else{
           JOptionPane.showInternalMessageDialog(null, "El numero ha sido encontrado en la posicion: "+(i-1));
           
       }
    }
}

    
        
  