package week4.day1;

public interface DatabaseConnection { //creating interface

	public default void connect() {
		System.out.println("Database connected successfully."); // method body can be added by default /static after java 8
	}
	public void disconnect();
	public void executeUpdate();
	
}
