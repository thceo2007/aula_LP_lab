/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Aluno
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota" , "Corolla");
        //Irá exibir "O carro Toyota Corolla está andando".        carro.andar();
    }
    
}
class Carro{
        private String marca;
        private String nome;
        public Carro(String marca, String nome){
            this.marca = marca;
            this.nome = nome;
        }
        public void andar(){
            System.out.println("O carro " + marca + " " + nome + " está andando");
        }
}
