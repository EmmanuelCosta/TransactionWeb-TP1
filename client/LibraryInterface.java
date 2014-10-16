import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.UUID;


public interface LibraryInterface extends Remote{
	public void addBook(UUID isbn, String title,String author) throws RemoteException;
	public void suppress(UUID isbn)throws RemoteException;
	public BookInterface searchByTitle(String title)throws RemoteException;
	public BookInterface searchByAuthor(String author)throws RemoteException;
	
}
