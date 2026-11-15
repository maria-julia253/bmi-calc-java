import java.util.Scanner;
public class calculoImc{
public static void main(String[] args){
  //Calcular o IMC e informar sobre o status de saúde do usuário
  //IMC = peso / altura X altura

  double peso;
  double altura;
  double imc;
  String nome;
  String genero;

  Scanner teclado = new Scanner(System.in);

  System.out.println("Informe seu nome:");
  nome = teclado.nextLine();

  System.out.println("Informe seu peso:");
  peso = teclado.nextDouble();

  System.out.println("Informe sua altura:");
  altura = teclado.nextDouble();

  imc = peso / (altura * altura);

        if(imc < 18.5){
      System.out.println("Classificação do IMC do(a)" + nome + "\nVocê está abaixo do peso.");
      
    } else if(imc >= 18.5 || imc <= 24.9){
      System.out.println("Classificação do IMC do(a)" + nome + "\nVocê está no peso ideal.");
      
    }  else if(imc >= 25.0 || imc <= 29.9){
      System.out.println("Classificação do IMC do(a)" + nome + "\nVocê está com sobrepeso.");
    
    } else if(imc >= 30.0){
      System.out.println("Classificação do IMC do(a)" + nome + "\nVocê está com obesidade.");
    
    }

}
    teclado.close();
  }