

public class Player {

    private String userName;
    private int userNumber;
    
    public Player(int userNumber){
		this.userNumber = userNumber;
	}

	public Player(String userName) {
		this.userName = userName;
	}

	public  String getUserName() {
		return userName;
	}

	public void setUserName(String name) {
		this.userName= userName;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber= userNumber;
	}
}

