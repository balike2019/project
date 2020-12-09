package employee;



	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;
	import java.time.LocalDate;
	import person.Person;


	public class Employee extends Person {
		private String position;
		private String password;
		private String user_name;
		private LocalDate date;
		Connection connection=null;
		Statement statement=null;
		ResultSet resultset=null;
		String pass="pvi@2021";
		String url="root";
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employee(String firstName, String lastName, String email_address, String house_address, int id_number,
				long phone_number) {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employee(String position, String password, String user_name, LocalDate date) {
			super();
			this.position = position;
			this.password = password;
			this.user_name = user_name;
			this.date = date;
		}
		public String getPosition() {
			return position;
		}
		public void setPosition(String position) {
			this.position = position;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getUser_name() {
			return user_name;
		}
		public void setUser_name(String user_name) {
			this.user_name = user_name;
		}
		public LocalDate getDate() {
			return date;
		}
		public void setDate(LocalDate date) {
			this.date = date;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + ((date == null) ? 0 : date.hashCode());
			result = prime * result + ((password == null) ? 0 : password.hashCode());
			result = prime * result + ((position == null) ? 0 : position.hashCode());
			result = prime * result + ((user_name == null) ? 0 : user_name.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (date == null) {
				if (other.date != null)
					return false;
			} else if (!date.equals(other.date))
				return false;
			if (password == null) {
				if (other.password != null)
					return false;
			} else if (!password.equals(other.password))
				return false;
			if (position == null) {
				if (other.position != null)
					return false;
			} else if (!position.equals(other.position))
				return false;
			if (user_name == null) {
				if (other.user_name != null)
					return false;
			} else if (!user_name.equals(other.user_name))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Employee [postion=" + position + ", password=" + password + ", user_name=" + user_name + ", date=" + date
					+ "]";
		}
	public void registerEmployee(String firstName, String lastName, String email_address, String house_address, int id_number,
			long phone_number,String user_name, String password, String position, LocalDate date) {
		
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail_address(email_address);
		
		this.setHouse_address(house_address);
		this.setId_number(id_number);
		this.setUser_name(user_name);
		this.setPassword(password);
		this.setPosition(position);
		this.setDate(date);
		
		
	}
	public void addEmployee(int id_number, String firstName, String lastName, long phone_number, String email,
			String house_address, LocalDate date, String user_name, String password, String position) {
		try  {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			

		connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/banking_system_db?useSSL=false&requireSSL=true", url,pass);
		statement = connection.createStatement();
		statement.executeUpdate(
				"INSERT INTO Employee ( first_name, last_name,email_Address, house_Address, id_number,"
						+ " phone_number,position,user_name, password )" + "VALUES('"+firstName+ "','"
						+ lastName + "','" + email + "','" + house_address + "'," + id_number + ",'" + phone_number
						+ "','" + position + "','" + user_name + "','" + password + "')");
	} catch (Exception e) {
		System.out.println(e.getMessage());

		// TODO: handle exception
	}
	}

		
	}

