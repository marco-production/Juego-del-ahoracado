package Clase;

//Autor: Manuel Garcia Blanco NL:12 Grupo:405

import javax.swing.JOptionPane;
import static Ventana.Ventana.*;

public class Clase {
    
    
    private String palabras[] = {"casa", "padre", "murcielago", "paracaidas", "helicoptero", "corazon", ""};
    private String palabra;
    private int longPalabra;
    private String cadena;
    private int e;
    
    public Clase() {
        longPalabra=0;
        cadena = "";
        e = 0;
    }
            
    public void imgError(int nivel, String letra){
        int cont = 0; 
        String carc = "";
        String carc2 = "";
        String label;
        int cover;
        
        palabra = palabras[nivel];
        longPalabra = palabra.length();
        
        for(int i=0; i<longPalabra-1; i++){ 
            carc=palabra.substring(i, i+1);
            carc2=palabra.substring((longPalabra-1)-i, longPalabra-i);
            if (carc2.equals(letra) || carc.equals(letra)){
                cont++;}
            if (cont>0){
                label = err.getText();
                err.setText(""+label);
                cover = Integer.parseInt(label);
                e=cover;}
        }
        if (cont==0){
          e=e+1;
          label = err.getText();
          cover = Integer.parseInt(label);
          e=e+cover;
          err.setText(""+e);
        }
        
        switch(e){
            case 0:
            JOptionPane.showMessageDialog(null,"Lleva 0 intento perdido");
            break;
            case 1:
            JOptionPane.showMessageDialog(null,"Lleva 1 intento perdido");
            break;
            case 2:
            JOptionPane.showMessageDialog(null,"Lleva 2 intento perdido");
            break;
            case 3:
            JOptionPane.showMessageDialog(null,"Lleva 3 intento perdido");   
            break;
            case 4:
            JOptionPane.showMessageDialog(null,"Lleva 4 intento perdido");    
            break;
            case 5:
            JOptionPane.showMessageDialog(null,"Lleva 5 intento perdido");    
            break;
            default:
                JOptionPane.showMessageDialog(null,"**GAME OVER**, mas de 5 errores" + "\nEl juego se reiniciara");
                numnivel.setText("0");
            break;
        }
    }
    
    public void imgError2(int nivel){
        String r;
        r = imprimir.getText();
        palabra = palabras[nivel];
        if (r.equals(palabra)){
                e=0;
                err.setText("0");
            }
        else {
            e=0;
            err.setText("0");
        }
    }
    
    public String calGuion(int nivel){
        int vc=0;
//---------------Guiones--------------------//        
        palabra=palabras[nivel];
        longPalabra=palabra.length();
        for(vc=0; vc<=longPalabra-1; vc++){
            cadena=cadena+"-";
        }      
        return cadena;
    }
    
    public void guionXLetra(char letra, int nivel){ 
        char x = letra;
        char y = letra;
        char[] aux;
        int pos;
               
        palabra = palabras[nivel];
        longPalabra = palabra.length();    
        
        for(int i=0;i<longPalabra;i++){
            cadena="-".concat(cadena);  
        } 
 
        System.out.println(cadena);
 
                aux = cadena.toCharArray();
                pos = palabra.indexOf(x);
                while(pos!=-1){
                    aux[pos] = x;
                    pos = palabra.indexOf(x,pos+1);}
                cadena=String.valueOf(aux);
                System.out.println(cadena);             
                    
        cadena=imprimir.getText();
 
        System.out.println(cadena);
        
                aux=cadena.toCharArray();
                pos=palabra.indexOf(y);
                while(pos!=-1){
                    aux[pos] = y;
                    pos = palabra.indexOf(y,pos+1);}
                    cadena = String.valueOf(aux);                
                    System.out.println(cadena); 
    } 
    
    public String getCadena(){
        return cadena;
    }
    
    public String getPabra(int nivel){
        if (nivel==0)
        palabra = palabras[0];
        if (nivel==1)
        palabra = palabras[1];
        if (nivel==2)
        palabra = palabras[2];
        if (nivel==3)
        palabra = palabras[3];
        if (nivel==4)
        palabra = palabras[4];
        if (nivel==5)
        palabra = palabras[5];
        if (nivel==6)
        palabra = palabras[6];
        return palabra;
    }
     
    public int getError(){
        return e;
    }
}
