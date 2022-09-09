import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner coringa = new Scanner(System.in);

        System.out.println("Digite 1 para escolher a Calculadora Básica e 2 para a Calculadora Cientifica.");
        int calculadora = coringa.nextInt();

        if (calculadora == 1) {
            System.out.println("~~~~ Digite 1 para executar a operação de soma (+) ~~~~ ");
            System.out.println("~~~~ Digite 2 para executar a operação de subtração (-) ~~~~");
            System.out.println("~~~~ Digite 3 para executar a operação de multiplicar (*) ~~~~ ");
            System.out.println("~~~~ Digite 4 para executar a operação de divisão (/) ~~~~ ");
            System.out.println("~~~~ Digite 5 para executar a operaçaõ de porcentagem(%) ~~~~ ");
            int opercao = coringa.nextInt();

            switch (opercao) {
                case 1:
                    System.out.println("Insira um valor para soma: ");
                    int val1soma = coringa.nextInt();
                    System.out.println("Insira outro valor para soma: ");
                    int val2soma = coringa.nextInt();
                    int resultadosoma = CalculadoraBasica.soma(val1soma, val2soma);
                 System.out.println("O resultado da soma é: " + resultadosoma);
                break;

            case 2:
                    System.out.println("Insira um valor para subtrair: ");
                    int val1subtracao = coringa.nextInt();
                    System.out.println("Insira outro valor para subtrair: ");
                    int val2subtracao = coringa.nextInt();
                    int resultadosub = CalculadoraBasica.subtracao(val1subtracao, val2subtracao);
                    System.out.println("O resultado da subtração é: " + resultadosub);
                break;

            case 3:
                    System.out.println("Insira um valor para multiplicar: ");
                    int val1mult = coringa.nextInt();
                    System.out.println("Insira outro valor para multiplicarf: ");
                    int val2mult = coringa.nextInt();
                    int resultadomult = CalculadoraBasica.multiplicacao(val1mult, val2mult);
                    System.out.println("O resultado da multiplicaçaõ é: " + resultadomult);
                break;

            case 4:
                    System.out.println("Insira um valor para divisão: ");
                    Double val1div = coringa.nextDouble();
                    System.out.println("Insira outro valor para divisão: ");
                    Double val2div = coringa.nextDouble();
                    Double resultadodiv = CalculadoraBasica.divisao(val1div, val2div);
                    System.out.println("O resultado da divisão é: " + resultadodiv);
                break;

            case 5:
                    System.out.println("Digite a porcentagem que deseja: ");
                    Double porcentagem = coringa.nextDouble();
                    System.out.println("Digite o valor que deseja saber a porcentagem: ");
                    Double valpor = coringa.nextDouble();
                    Double resultinh = CalculadoraBasica.Porcentagem(valpor, porcentagem);
                    System.out.println(resultinh);
                break;

            default:
                break;
        }
        }else{ 
                Scanner batata = new Scanner (System.in);

                System.out.println("~~~~ Digite 1 para executar a operação de soma (+) ~~~~ ");
                System.out.println("~~~~ Digite 2 para executar a operação de subtração (-) ~~~~");
                System.out.println("~~~~ Digite 3 para executar a operação de multiplicar (*) ~~~~ ");
                System.out.println("~~~~ Digite 4 para executar a operação de divisão (/) ~~~~ ");
                System.out.println("~~~~ Digite 5 para executar a operaçaõ de porcentagem(%) ~~~~ ");
                System.out.println("~~~~ Digite 6 para executar a operação da raiz quadrada ~~~~ "); 
                System.out.println("~~~~ Digite 7 para executar a operação de potenciação ~~~~" );
                System.out.println("~~~~ Digite 8 para executar a operação de mod ~~~~ ");
                int opercao = batata.nextInt();
        
                switch (opercao) {
                    case 6:
                        System.out.println("Insira um valor para raiz quadrada: ");
                        Double valraiz = batata.nextDouble();
                        Double resultraiz = Math.sqrt(valraiz);
                        System.out.println(resultraiz);
                        break;
        
        
                    case 7:
                        System.out.println("Insira um valor: ");
                        int val1pot = batata.nextInt();
                        System.out.println("Insira outro valor para elevar: "); 
                        int val2pot = batata.nextInt();
                        int resultadopot = (int) Math.pow(val1pot, val2pot);
                        System.out.println("O resultado da potencia é: " + resultadopot);
                        break;
        
        
                    case 8:
                        System.out.println("Insira um valor para calcular o módulo: ");
                        int val1mod = batata.nextInt();
                        System.out.println("Insira outro valor: "); 
                        int val2mod = batata.nextInt();
                        int resultmod = val1mod % val2mod;
                        System.out.println("O resultado do módulo é: " + resultmod);
                        break;

                        case 1:
                        System.out.println("Insira um valor para soma: ");
                        int val1soma = coringa.nextInt();
                        System.out.println("Insira outro valor para soma: ");
                        int val2soma = coringa.nextInt();
                        int resultadosoma = CalculadoraCientifica.soma(val1soma, val2soma);
                     System.out.println("O resultado da soma é: " + resultadosoma);
                    break;
    
                case 2:
                        System.out.println("Insira um valor para subtrair: ");
                        int val1subtracao = coringa.nextInt();
                        System.out.println("Insira outro valor para subtrair: ");
                        int val2subtracao = coringa.nextInt();
                        int resultadosub = CalculadoraCientifica.subtracao(val1subtracao, val2subtracao);
                        System.out.println("O resultado da subtração é: " + resultadosub);
                    break;
    
                case 3:
                        System.out.println("Insira um valor para multiplicar: ");
                        int val1mult = coringa.nextInt();
                        System.out.println("Insira outro valor para multiplicarf: ");
                        int val2mult = coringa.nextInt();
                        int resultadomult = CalculadoraCientifica.multiplicacao(val1mult, val2mult);
                        System.out.println("O resultado da multiplicaçaõ é: " + resultadomult);
                    break;
    
                case 4:
                        System.out.println("Insira um valor para divisão: ");
                        Double val1div = coringa.nextDouble();
                        System.out.println("Insira outro valor para divisão: ");
                        Double val2div = coringa.nextDouble();
                        Double resultadodiv = CalculadoraCientifica.divisao(val1div, val2div);
                        System.out.println("O resultado da divisão é: " + resultadodiv);
                    break;
    
                case 5:
                        System.out.println("Digite a porcentagem que deseja: ");
                        Double porcentagem = coringa.nextDouble();
                        System.out.println("Digite o valor que deseja saber a porcentagem: ");
                        Double valpor = coringa.nextDouble();
                        Double resultinh = CalculadoraCientifica.Porcentagem(valpor, porcentagem);
                        System.out.println(resultinh);
                    break;
    
                default:
        
                }
        }
        


        

    }

}
