import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class AppServidor {
    public static void main(String[] args) {
    	try {
        	Servidor m = new ServidorImpl();
        	LocateRegistry.createRegistry(1099);
        	// crio uma instancia do obj e registro no Binder
            Naming.rebind("rmi://localhost:1099/Servidor", m);
            System.out.println("Subiu");
        } catch( Exception e ) {
        	System.out.println( "Trouble: " + e.getMessage() );
        }
    }
}
