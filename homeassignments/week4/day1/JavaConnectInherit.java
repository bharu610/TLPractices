package week4.day1;

public class JavaConnectInherit extends MySqlConnection {  //inherits abstract class
	
	//Overrided methods from DatabaseConnection interface
	@Override
	public void connect() {
		System.out.println("MySQL DB connected");
		
	}
	
	@Override
	public void disconnect() {
		System.out.println("MySQL DB disconnected");
		
	}
	
	@Override
	public void executeUpdate() {
		System.out.println("MySQL DB updated");
		
	}
	
	@Override
	public void executeQuery() {
		super.executeQuery(); //calling from super class - MySQLConnection
	}

	public static void main(String[] args) {
	 
		JavaConnectInherit jci = new JavaConnectInherit();
		
		jci.connect();
		jci.disconnect();
		jci.executeUpdate();
		jci.executeQuery();
		
		

	}

}
