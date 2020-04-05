
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jhony
 */
public class TesteLogica {
    
   public static ArrayList<Integer> random = new ArrayList<>();
   public static ArrayList<Integer> respostas = new ArrayList<>();
   public static int j = 0;
    
   public static void main(String[] args) {
       
        random.clear();
        respostas.clear();
        
        geradorRamdon();
        capturaRes();
        comparador();
       
    }
    
    
    public static ArrayList geradorRamdon(){
        
        Random ram = new Random();
        int a = 0;
        
        while(a == 0){
            
            a = ram.nextInt(5);
            
            if(a > 0){
                
                random.add(a);
                if(j == 0 ){
                    mostraSequencia();
                    System.out.println("");
                }
            }
        }
       
        return random;
    }
    
    public static void comparador(){
        
        if(j != 0){
            mostraSequencia();
            
            j++;
        }
        
        for(int i = 0; i < random.size() ; i++){
            
            if(random.get(i) == respostas.get(i)){
                
            } else{
                System.out.println("Errooouuuu.... FIm de jogo");
                System.exit(0);
            }           
        }
        
        System.out.println("Acertou...Proximo nivel");
        geradorRamdon();
        capturaRes();
        comparador();
        
    }
    
    public static ArrayList capturaRes(){
        
        respostas.clear();
        
        Scanner entrada = new Scanner(System.in);
        
        for(int i=0; i<random.size(); i++){
            System.out.print("Digite o "+(i+1)+" valor tocado:");
            respostas.add(entrada.nextInt());
        }
        
        return respostas;
        
    }
    
    public static void mostraSequencia(){
        System.out.print("Sequencia Gerada foi: ");
        for(int i = 0; i< random.size(); i++){
            System.out.print(random.get(i)+" ");  
        }
    }
    
    
}
