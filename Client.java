package gestion_cabinet_avocat;
	public class Client {
	    private int id;
	    private String name;
	    private String firstName;
	    private String phone;

	    public Client(int id, String name, String firstName, String phone) {
	        this.id = id;
	        this.name = (name != null && !name.isEmpty()) ? name : "Unknown";
	        this.firstName = (firstName != null && !firstName.isEmpty()) ? firstName : "Unknown";
	        this.phone = (phone != null && !phone.isEmpty()) ? phone : "Unknown";
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = (name != null && !name.isEmpty()) ? name : "Unknown";
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = (firstName != null && !firstName.isEmpty()) ? firstName : "Unknown";
	    }

	    public String getPhone() {
	        return phone;
	    }

	    public void setPhone(String phone) {
	        this.phone = (phone != null && !phone.isEmpty()) ? phone : "Unknown";
	    }

	    public void afficher() {
	        System.out.println("ID: " + id + " | Name: " + name + " | First Name: " + firstName + " | Phone: " + phone);
	    }
	}

