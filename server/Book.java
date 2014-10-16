import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.UUID;

public class Book extends UnicastRemoteObject implements BookInterface,
		Serializable {
	private String title;
	private String author;
	private UUID isbn;

	public Book(String title, String author, UUID isbn) throws RemoteException {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	public Book() throws RemoteException {

	}

	@Override
	public String getAuthor() throws RemoteException {

		return author;
	}

	@Override
	public String getTitle() throws RemoteException {
		return title;
	}

	@Override
	public UUID getIsbn() throws RemoteException {
		return isbn;
	}

	@Override
	public void setTitle(String title) throws RemoteException {
		this.title = title;
	}

}
