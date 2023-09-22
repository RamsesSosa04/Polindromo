package mx.itson.palíndromo.ui;

import java.util.Scanner;

/**
 *El sistema muestra en pantalla el texto sí es palíndromo o no es palíndromo acorde al resultado obtenido.
 * @author Ramsés Sosa
 */
public class MainPalíndromo {

    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);

         System.out.println("Ingrese el texto a evaluar: ");
        
        String oracion = leer.nextLine().toLowerCase();
        
        System.out.println(esPalindromo(oracion));
    }
    public static boolean esPalindromo(String oracion){
        boolean rs = true;
        
        oracion = oracion.replace(" ", "").replace("á", "a")
                                            .replace("é", "e").replace("í", "i")
                                            .replace("ó", "o").replace("ú", "u")
                                            .replace("!", "").replace(",", "")
                                            .replace("¡", "");
        
        for(int i = 0; i < oracion.length(); i++){
            if(oracion.charAt(i) != oracion.charAt(oracion.length()-1-i)){
                rs = false; 
                break;
            }
        }

        return rs;
    }
        /*
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        boolean poli;
       
        
        String oracion = frase.toLowerCase().replace(" ", "").replace("á", "a")
                                            .replace("é", "e").replace("í", "i")
                                            .replace("ó", "o").replace("ú", "u")
                                            .replace("!", "").replace(",", "")
                                            .replace("¡", "");
        int a =0;
        int b = oracion.length() -1;
        
        char [] arrayChara = oracion.toCharArray();
        char [] arrayCharb = oracion.toCharArray();
        
        for(int i=oracion.length(); i > 0; i--){
            
        }

        
            /*if(arrayChara == arrayCharb){
                
                a++;
                b--;
                poli = true;
            }else if (arrayChara != arrayCharb){
                poli = false;  
            }
        }
        if(poli = true){
            System.out.println("Si es");
        }
        */
        
}
    

