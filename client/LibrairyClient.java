import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.util.UUID;

public class LibrairyClient {
	public static void main(String[] args) {
		try {
			String codebase = "file:///C:/Users/Emmanuel/Documents/Dev/eclipse-standard-luna-M6-win32-x86_64/workspace/WebService-TD1/server/";
			System.setProperty("java.rmi.server.codebase", codebase);
			System.setProperty("java.security.policy", "sec.policy");
			System.setSecurityManager(new RMISecurityManager());

			LibraryInterface library = (LibraryInterface) Naming
					.lookup("Librairie");
			library.addBook(UUID.randomUUID(), "ManU est en France",
					"costa");
			System.out.println(library.searchByAuthor("costa")!=null);
			Book b = new Book("author", "isbn",UUID.randomUUID());
			library.addBook(UUID.randomUUID(), "title", "author");
			System.out.println(library.searchByTitle("title")!=null);
			library.searchByAuthor("author").setTitle("tyran");
			System.out.println(library.searchByTitle("title")!=null);
		} catch (NotBoundException | MalformedURLException | RemoteException e) {
			e.printStackTrace();
		}
	}
}
