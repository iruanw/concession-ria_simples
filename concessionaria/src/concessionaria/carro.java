
package concessionaria;

public class carro {
    String nome;
    String modelo;
    String marca;

    
    public carro(){
        
    }

    public carro(String nome, String modelo, String marca) {
        this.nome = nome;
        this.modelo = modelo;
        this.marca = marca;
    }
    
    public void dados_carro(){
        System.out.println("Carro \nNome : "+nome+"\nModelo : "+modelo+"\nMarca : "+marca+"\nFoi add na loja");
    }
}
