package id.basic.mybatis.model;

public class Employee {
	
	private Long id;
	private String firstName;
	private String lastname;
	private String emailid;
	
	public Employee() {
		super();
	}

	public Employee(Long id, String firstName, String lastname, String emailid) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastname = lastname;
		this.emailid = emailid;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	
	

}
