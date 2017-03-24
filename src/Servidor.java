import java.rmi.*; // importa pacotes do RMI

public interface Servidor extends Remote // necessita herdar para obter invocação remota
{
	// todos os métodos remotos necessitam lançar uma exceção deste tipo
	public Resposta calculadora(Operacao operacao) throws RemoteException;
            
}   