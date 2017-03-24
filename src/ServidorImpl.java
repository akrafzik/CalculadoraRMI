
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;// necessito do UnicastRemoteObject – Objeto Remoto Unicast

public class ServidorImpl extends UnicastRemoteObject implements Servidor {

    // todas as classes remotas (servidores) herdam UnicastRemoteObject e implementam a interface definida
    public ServidorImpl() throws RemoteException {
        // construtor – necessito chamar o construtor da superclasse
        super();
    }

    public Resposta calculadora(Operacao operacao) throws RemoteException {
        Resposta resposta = new Resposta();

        switch (operacao.getOp()) {
            case '+':
                resposta.setResult(operacao.getN1() + operacao.getN2());
                resposta.setStatus(0);
                break;
            case '-':
                resposta.setResult(operacao.getN1() - operacao.getN2());
                resposta.setStatus(0);
                break;
            case '*':
                resposta.setResult(operacao.getN1() * operacao.getN2());
                resposta.setStatus(0);
                break;
            case '/':
                if (operacao.getN1() == 0 || operacao.getN2() == 0) {
                    resposta.setStatus(2);
                    break;
                }
                resposta.setResult(operacao.getN1() / operacao.getN2());
                resposta.setStatus(0);
                break;
            default:
                resposta.setStatus(1);
                break;
        }
        
        return resposta;

    }

}
