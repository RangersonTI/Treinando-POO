/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista5_IF;


public class Quest7Class {
    
    private double[][]nota = new double[6][2];
    private double[]media = new double[6];
    public double mediageral = 0;
    public int aprov, reprov, pv, i;
    
    public double Getnota(){
        return this.nota[6][2];
    }
    public void Setnota(double V){
        this.nota[6][2] = V;
    }
    
    public double Getmedia(){
        return this.media[6];
    }
    public void Setmedia(double  M){
        this.media[6] = M;
    }
    
    public void Calcmedia(){
        for(i=0;i<6;i++){
        media[i] = (nota[i][0]+nota[i][1])/2;
        }
    }
    
    public void resultado(){
        for(i=0;i<6;i++){
            if(media[i]>=7){
                System.out.printf("\n Aluno Aprovado!!! A média do Aluno %d é %.2f",i+1,media[i]);
                aprov++;
            }
            else{
                if((media[i]<7) || (media[i]>3)){
                System.out.printf("\n Aluno ficará para a Prova Final. A média do Aluno %d é %.2f",i+1,media[i]);
                pv++;
            }
                else{
                    System.out.printf("\n Aluno Reprovado!!! A média do Aluno %d é %.2f",i+1,media[i]);
                    reprov++;
                }
            }
        }
    }
    
    public void ApRp(){
        System.out.printf("\n Alunos reprovados: "+aprov);
        System.out.printf("\n Alunos aprovados: "+aprov);
        System.out.printf("\n Prova Final: "+pv);
    }
    
    public void MediaGeral(){
        for(i=0;i<6;i++){
            mediageral = mediageral+media[i];
        }
        System.out.printf("\n\n A NOTA GERAL DA TURMA É %.2f",mediageral);
    }
}
