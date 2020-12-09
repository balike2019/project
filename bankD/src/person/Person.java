package person;

public class Person {
	private String firstName;
	private  String lastName;
	private String email_address;
	private String house_address;
	private int id_number;//PRIMARY KEY
	private  long phone_number;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String firstName, String lastName, String email_address, String house_address, int id_number,
			int phone_number) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email_address = email_address;
		this.house_address = house_address;
		this.id_number = id_number;
		this.phone_number = phone_number;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public String getHouse_address() {
		return house_address;
	}
	public void setHouse_address(String house_address) {
		this.house_address = house_address;
	}
	public int getId_number() {
		return id_number;
	}
	public void setId_number(int id_number) {
		this.id_number = id_number;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", email_address=" + email_address
				+ ", house_address=" + house_address + ", id_number=" + id_number + ", phone_number=" + phone_number + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email_address == null) ? 0 : email_address.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((house_address == null) ? 0 : house_address.hashCode());
		result = prime * result + id_number;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + (int) (phone_number ^ (phone_number >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (email_address == null) {
			if (other.email_address != null)
				return false;
		} else if (!email_address.equals(other.email_address))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (house_address == null) {
			if (other.house_address != null)
				return false;
		} else if (!house_address.equals(other.house_address))
			return false;
		if (id_number != other.id_number)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (phone_number != other.phone_number)
			return false;
		return true;
	}



}
