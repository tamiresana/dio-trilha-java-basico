public class Operadores {
    
    public static void main(String[] args) {
       // String nomeCompleto = "LINGUAGEM" + "JAVA";
        //System.out.println(nomeCompleto);

        /*String concatenacao = "?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao); */


       /* 
       //operador unario
       
       int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero); */ 

/*int numero = 5;
        //x repeticao
        //numero = numero +1;

        System.out.println(++ numero);

        System.out.println(numero); 

        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel);*/

/* // operador ternario ?:

        int a, b;

        a= 6;
        b = 6;

        String resultado = a == b ?"verdadeiro" : "falso";
        //true ou false expressão booleana
            
        System.out.println(resultado);*/


        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }
        System.out.println("numeroUm é igual a numeroDois? " + simNao);
        
        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);
        
    } 
}
