/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato;

/**
 *
 * @author aluno
 */
public class Gato {
    boolean macho;
    String nome;
    int idade;
    Gato raça;
    public Gato (String n){
        this.nome= n;
    }
    
    public void miar (){
        if (idade >=2){
            System.out.print ("miau");
        }else{
            System.out.print ("MIAU!");
            
        }
    }  
}
