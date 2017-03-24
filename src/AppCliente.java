import java.rmi.*;
import java.util.Scanner;

public class AppCliente {
    public static void main(String args[]) {
		try {
			// acesso o Binder pelo nome que fora registrado
			Servidor m = (Servidor) Naming.lookup("rmi://localhost:1099/Servidor");
			// método utilizado normalmente
                        Scanner entrada = new Scanner(System.in);
                        Operacao req = new Operacao();
                        Resposta resposta = new Resposta();
        System.out.println("Qual a operação desejada? (+,-,* ou /)");
        req.setOp(entrada.next().charAt(0));
        System.out.println("Qual é o primeiro número da operação");
        req.setN1(entrada.nextFloat());
        System.out.println("Qual é o segundo número da operação");
        req.setN2(entrada.nextFloat());
        resposta=m.calculadora(req);
         switch(resposta.getStatus()){
                case 0:
                    System.out.println("Operação realizada com sucesso");
                    break;
                case 1:
                    System.out.println("Operador inválido");
                    break;
                case 2:
                    System.out.println("Divisão por 0");
                    break;
            }
            System.out.println("O resultado é: " + resposta.getResult());                
                        
    	} catch (Exception e) {
      		System.out.println("GenericException: " + e.toString());
    	}
	}
}
