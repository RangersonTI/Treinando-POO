/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// 7- Calcule e mostre:
//
// a) a média aritmética das duas notas de cada aluno;
// b) a mensagem que está na tabela a seguir:
//
//  MÉDIA ARITMÉTICA MENSANGEM
//   ________________________________
//   | Até 3          | Reprovado   |
//   | Entre 3 e 6    | Prova final |
//   | De 7 para cima | Aprovado    |
//   |______________________________|
//
// c) o total de alunos aprovados;
// d) o total de alunos de exame;
// e) o total de alunos reprovados;
// f) a média da turma.

package lista5_IF;


import java.util.Scanner;
public class Quest7 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        Quest7Class ANota = new Quest7Class();
        
        double[][]nota = new double[6][2];
        int i,j;
        
        for(i=0;i<6;i++){
            for(j=0;j<2;j++)
                System.out.printf("\n Informe a primeira nota do Aluno %d: ",i+1);
                nota[i][j] = entrada.nextDouble();
            
            System.out.println("\n");
        }
        
        ANota.Setnota(nota[6][2]);
               
        ANota.Calcmedia();
        ANota.resultado();
        ANota.ApRp();
        ANota.MediaGeral();
        
    }
    
}
