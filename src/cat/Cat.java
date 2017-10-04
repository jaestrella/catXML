/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author matinal
 */
//PROGRAMA PARA LEER UN FICHERO DESDE LA LINEA DE ARGUMENTOS
public class Cat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("Uso del programa:\n Cat [Nombre del fichero a leer]\n");
        }else{
            File file=new File(args[0]);
            try(BufferedReader br = new BufferedReader(new FileReader(file))) {
                for(String line; (line = br.readLine()) != null; ) {
                    System.out.println(line);
                }
            }catch(IOException e){
                System.out.println(e.getLocalizedMessage());
            }
        }
        
        
    }
    
}
