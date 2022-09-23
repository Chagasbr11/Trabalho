import java.security.DigestException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Leitura = new Scanner(System.in);
        boolean menu = true;

        do {
            System.out.println("1.  Trapézio");
            System.out.println("2.  Retângulo");
            System.out.println("3.  Quadrado");
            System.out.println("4.  Triângulo ");
            System.out.println("9.  Sair");

            String poligono = Leitura.next();

            switch (poligono) {
                case "1":
                    System.out.println("Digite o valor da base menor");
                    int baseMenor = Leitura.nextInt();
                    System.out.println("Digite a base maior");
                    int baseMaior = Leitura.nextInt();
                    System.out.println("Digite o valor da altura");
                    int alturaTrapezio = Leitura.nextInt();
                    int areaTrapezio = baseMenor + baseMaior * alturaTrapezio / 2;
                    System.out.println("A área do Trapézio é igual a: " + areaTrapezio);
                    break;

                case "2":
                    System.out.println("Digite o valor da base");
                    int baseRetangulo = Leitura.nextInt();
                    System.out.println("Dgite o valor da altura ");
                    int alturaRetangulo = Leitura.nextInt();
                    int areaRetangulo = baseRetangulo * alturaRetangulo;
                    System.out.println("A área do Retângulo é igual a: " + areaRetangulo);
                    break;

                case "3":
                    System.out.println("Digite o lado quadrado");
                    int ladoQuadrado = Leitura.nextInt();
                    System.out.println("Digite o segundo lado do quadrado ");
                    int ladoQuadrado2 = Leitura.nextInt();
                    int areaQuadrado  = ladoQuadrado * ladoQuadrado2;
                    System.out.println("A área do Quadrado é igual a: " + areaQuadrado);
                    break;
                case "4":
                    System.out.println("Digite a base do triângulo");
                    int baseTriangulo = Leitura.nextInt();
                    System.out.println("Digite a altura do triângulo");
                    int alturaTriangulo = Leitura.nextInt();
                    int areaTriangulo = baseTriangulo * alturaTriangulo /2;
                    System.out.printf("A área do Triângulo é igual a: ");
                    break;

                case"9":
                    menu = false;
                    System.out.println("Voce saiu");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, digite uma opção correta!");






            }

        }while (menu == true);



    }
}