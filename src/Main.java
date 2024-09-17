import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário a
        // grade de funcionários e os salários, e devolvendo a média salarial.

        Scanner scanner = new Scanner(System.in);
        double salario;
        double soma = 0;
        int qtFuncionarios = 0;

        while(true) {
            System.out.println("Digite o valor do salário (ou 'sair' para terminar): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("sair")){
                break;
            }
            try{
                salario = Double.parseDouble(input);
                soma += salario;
                qtFuncionarios++;
            }catch (NumberFormatException e){
                System.out.println("Insira um valor numérico válido.");
            }
        }
        double media = soma/qtFuncionarios;
        System.out.println("A soma dos salarios dos "+qtFuncionarios+" funcionários fornecidos é igual a "+soma+" e a media é: "+media+ ".");
        scanner.close();

    }
}
