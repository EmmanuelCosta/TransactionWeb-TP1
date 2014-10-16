import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.UUID;


public interface BookInterface extends Remote  {
	public String getAuthor()throws RemoteException ;
	public String getTitle()throws RemoteException ;
	public UUID getIsbn()throws RemoteException ;
	public void setTitle(String title)throws RemoteException ;
}
