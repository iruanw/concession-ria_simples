
package concessionaria;
import java.util.Scanner;
import java.util.ArrayList;

public class Concessionaria {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<carro>loja = new ArrayList<>();
        String cont;
        //método construtor
        carro c1 = new carro("Bmw","Sport","X6");
        loja.add(c1);//Add no Array
        
        
        do{
        System.out.println("Escolha uma opção (1) Adicionar carro (2) Ver a loja (3) Remover veiculo");
        int caso = input.nextInt();
        input.nextLine();// dados numericos no input ocasiona erro no Output, Por isso necessita terminar com um dado String
        
         switch(caso){
             case 1://add carro
                 carro novo = new carro();
                 System.out.println("Opção adicionar carro foi selecionado !");
                 System.out.println("Informe a marca do carro !");
                 novo.marca = input.nextLine();
                 System.out.println("Informe o modelo !");
                 novo.modelo = input.nextLine();
                 System.out.println("Informe o nome !");
                 novo.nome = input.nextLine();
                 novo.dados_carro();
                 loja.add(novo);
                 break;
             case 2:
                 System.out.println("Opção Olhar loja foi selecionado !");
                 for(int i=0; i<loja.size();i++){
                     System.out.println((i+1)+"- Carro\nnome: "+loja.get(i).nome+"\nModelo: "+loja.get(i).modelo+"\nMarca: "+loja.get(i).marca+"\n-----------------");
                 }
                 
                 break;
             case 3://Validando e excluindo.
                 System.out.println("Opção remover carro foi selecionado !");
                 System.out.print("Digite o indice: ");
                 int indice = input.nextInt();
                 input.nextLine();
                 if(indice >= 0 && indice < loja.size())
                 loja.remove(indice); 
                    break;
         }
         System.out.println("Deseja continuar S/N");
         cont = input.nextLine();
        }while( cont != "s");

    }
    
}
