public class Operacao {

    //Método de soma.
    public static float soma(float valorX, float valorY){ //
        return valorX + valorY;
    }
    //Método de subtração.
    public static float sub(float valorX, float valorY){
        return valorX - valorY;
   }

   //Método de divisão.
   public static float div(float valorX, float valorY){
        if(valorY == 0){
            throw new ArithmeticException("Valor inválido: Divisão por 0 "); // Linha simples para previnir divisões por 0;
        } else   
        return (valorX / valorY);
   }
   //Método de multiplicação.
   public static float mult(float valorX, float valorY){
        return valorX * valorY;
   }
   //Método de porcentagem.
   public static float porc(float valorX, float valorY){
        return ((valorX * valorY)/ 100);
   }
   //Método de potência.
   public static float pot(float valorX, float valorY){ 
    /*  O caso da potenciação é o mais complexo, optei por não usar o método Math.pow.
        Apesar de saber que ele é mais otimizado eu quero treinar minha logica e este parecia um bom desafio. 
    */    
        float som = 1;
        int pot =(int)valorY;
        // Usei um Switch para contornar as excessões da potenciação
        switch (pot){ 
            case 0 :
                return 1;
            case 1 :
                return valorX;
           /*  case 2 : 
                return valorX * valorX;
            */    
            default :
                if(pot < 0){
                    throw new ArithmeticException("Valor inválido: Índice menor que 0 ");
                }
                som = valorX * valorX;
                for(int i = 2; i < pot; i++)
                    som = som * valorX;
                return som;
              
        } 
   }

    
}
