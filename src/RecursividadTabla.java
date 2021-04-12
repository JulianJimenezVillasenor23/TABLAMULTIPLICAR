/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julia
 */
public class RecursividadTabla {
    
    private int suma =0;
private int cont =0;
 
 public String tablamult(int num){
     String res= num + " X " + (cont +1) + " = " + (suma + num) + "\n";
     cont++; //numero de veces sumadas.
     suma += num;
     if(cont==10 ){
         return res;
     }else{
         return res + tablamult(num);
     }
     
 }
    
}
