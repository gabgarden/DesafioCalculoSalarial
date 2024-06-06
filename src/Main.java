import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        float valorSalario = scanner.nextFloat();

        System.out.println("Digite seus adicional de benefícios: ");
        float valorBeneficios = scanner.nextFloat();

        float valorImposto = 0;

        if (valorSalario >= 0 && valorSalario <= 1100)
        {
            valorImposto = (valorSalario * 0.05F);
        } else if (valorSalario > 1100 && valorSalario <=2500)
        {
            valorImposto = (valorSalario * 0.1F);
        } else if (valorSalario > 2500)
        {
            valorImposto = (valorSalario * 0.15F);
        }


        float salarioFinal = valorSalario - valorImposto + valorBeneficios;

        System.out.println("Seu salário final é de R$" + salarioFinal);





    }
}