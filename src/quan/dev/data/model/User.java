package quan.dev.data.model;

public class User {
	public int id;
	public String email;
	public String role;
	public String password;
	public User(int id, String email, String role, String password) {
		super();
		this.id = id;
		this.email = email;
		this.role = role;
		this.password = password;
	}
	
}
