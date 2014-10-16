import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;


public class LibraryServer {
public static void main(String[] args) {
	try {
		LibraryInterface library = new LibraryImpl();
		
		Naming.rebind("Librairie", library);
	} catch (RemoteException | MalformedURLException e) {
		
		e.printStackTrace();
	}
}
}
