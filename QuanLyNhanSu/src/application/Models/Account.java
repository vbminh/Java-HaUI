package application.Models;

public class Account {
	private String username;
	private String password;
	private String permission;
	
	public Account() {
		super();
	}

	public Account(String username, String password, String permission) {
		super();
		this.username = username;
		this.password = password;
		this.permission = permission;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getPermission() {
		return permission;
	}
	
}
