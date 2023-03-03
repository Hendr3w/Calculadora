public class Calc1 {
    public static void main(String[] args) {
        char operacao, resp;
        float valorX = 0, valorY = 0, res = 0;

        System.out.println("Bem vindo a minha caulculadora básica.");
        System.out.println("Aqui você pode realizar operações de soma, subtração, divisão, multiplicação, porcentagem e potenciação.");
        System.out.println("Tome cuidado pois o probrama não pode dividir por 0 e nem elevar a índices negativos, também evite números muito grandes ou muito pequenos visto que é uma calculadora básica. ");


        do {

            // Ler o primeiro valor em seguida a operação e depois o segundo valor faz parecer mais com uma calculadora convencional. 
            valorX = Console.readFloat("Digite o primeiro valor ");
            operacao = Console.readChar("Qual o tipo de operação? [+, -, /, *, %, p(potência)] "); //Pretendia usar '^' para definir potência porém é mais facil digitar apenas um p
            valorY = Console.readFloat("Digite o segundo valor ");

            // Estou usando o codigo para aprender e testar switch/case então é a primeira vez que eu uso.
            switch (operacao) {
                case '+':
                    res = Operacao.soma(valorX, valorY);
                    break;
                case '-':   
                    res = Operacao.sub(valorX, valorY);
                    break;
                case '*':
                    res = Operacao.mult(valorX, valorY);
                    break;
                case '/':
                    res = Operacao.div(valorX, valorY);
                    break;
                case '%':
                    res = Operacao.porc(valorX, valorY);
                    break;
                case 'p':
                    res = Operacao.pot(valorX, valorY);
                    break;
                   
                default:
                    System.out.println("Operação inválida");
                    break;
            }
            System.out.println("O resultado é " + res);
          resp = Console.readChar("Gostaria de repetir o processo? [S/N] ");
        }while(resp == 's' || resp == 'S');
    }
}
