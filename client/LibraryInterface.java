import java.rmi.Remote;
import java.rmi.RemoteException;


public interface LibraryInterface extends Remote{
	public void addBook(String isbn, String title,String author) throws RemoteException;
	public void suppress(String isbn)throws RemoteException;
	public BookInterface searchByTitle(String title)throws RemoteException;
	public BookInterface searchByAuthor(String author)throws RemoteException;
	
}
