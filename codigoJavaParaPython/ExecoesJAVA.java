import java.util.Scanner;

public class ExecoesJAVA {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);      
        boolean correto = false;
        int idade;
        int nrTentativas=3;
        while ((!correto) && (nrTentativas > 0) ){
            System.out.println("Entre com sua idade:");
            try{
               idade = entrada.nextInt();
               correto = true;    
               idade = idade /0;             
            }catch(ArithmeticException e){
                entrada.nextLine();           
                nrTentativas--;
                System.out.println("Erro de divisao por zero");
            }catch(Exception e){
                entrada.nextLine();           
                nrTentativas--;
                if(nrTentativas == 1){
                   System.out.println("Vc não está num bom dia! Tente de novo");
                }else{
                   System.out.println("Vc nao digitou corretamente! Tente de novo");    
                }
            }
        }
    }    
}