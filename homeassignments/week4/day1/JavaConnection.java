
package week4.day1;

public class JavaConnection implements DatabaseConnection{ //implements interface
	
//	@Override
//    public void connect() {
//     System.out.println("Database connected successfully.");
//    }

    @Override
    public void disconnect() { //method body for disconnect in DatabaseConnection
        System.out.println("Database disconnected successfully.");
    }

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		 System.out.println("Update executed successfully.");
	}


	
	public static void main(String[] args) {
		
		JavaConnection jc = new JavaConnection(); //instantiating obj
		
		//calling methods through obj
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
	}

}