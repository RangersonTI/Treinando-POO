/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5_IF;


import java.util.Scanner;
public class Quest6Class {
    Scanner enter = new Scanner(System.in);
    public float[]vetnotas = new float[10];
    int i;
    
    public void notas(){    
        for(i=0;i<10;i++){
            System.out.printf(" Informe a %dº nota: ",i+1);
            vetnotas[i] = enter.nextFloat();
        }
        calcmedia();
    }      
    
    public void calcmedia(){
        float nota = 0;
        for(i=0;i<10;i++){
            nota = nota + this.vetnotas[i];
            if(i==9){
                System.out.printf("\n Média do aluno: %.2f",nota/10);
            }
        }
    }
}
