import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class LibraryImpl extends UnicastRemoteObject implements LibraryInterface {
	private final Map<UUID, Book> books = new HashMap<>();

	public LibraryImpl() throws RemoteException {

	}

	@Override
	public void addBook(UUID isbn, String title, String author)
			throws RemoteException {
		books.put(isbn, new Book(title, author, isbn));
		
	}

	@Override
	public void suppress(UUID isbn) throws RemoteException {
		if(!books.isEmpty()){
			books.remove(isbn);
		}
		
	}

	@Override
	public Book searchByTitle(String title) throws RemoteException {
		Set<UUID> uuidKeys = books.keySet();
		for(UUID uuid : uuidKeys){
			Book book = books.get(uuid);
			if(book.getTitle().equalsIgnoreCase(title))
				return book;
		}
		return null;
	}

	@Override
	public Book searchByAuthor(String author) throws RemoteException {
		Set<UUID> uuidKeys = books.keySet();
		for(UUID uuid : uuidKeys){
			Book book = books.get(uuid);
			if(book.getAuthor().equalsIgnoreCase(author))
				return book;
		}
		return null;
	}

	

}
