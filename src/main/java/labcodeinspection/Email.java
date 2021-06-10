package labcodeinspection;

import java.util.Locale;

public class Email {

	private String m_firstName; 
	private final String m_lastName;
	private String password;
	private String department;
	private final int defaultpasswordLength = 8;
	private String email;
	/**
	 * Constructor
	 * @param firstName
	 * @param lastName
	 */
	public Email(String firstName, String lastName) {
		this.m_firstName = firstName;
		this.m_lastName = lastName;
	}
	/**
	 * metodo mostrar info
	 */
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}
	/**
	 * metodo setear depa
	 * @param depChoice
	 */
	public void setDeparment(int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			this.department = "default";
		}
	}
	/**
	 * metodo escoge contrasena aleatoria
	 * @param length
	 * @return
	 */
	private String randomPassword(int length) {
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}
	/**
	 * metodo que genera un email
	 */
	public void generateEmail() {
		this.password = this.randomPassword(this.defaultpasswordLength);
		this.email = this.m_firstName.toLowerCase(Locale.US) + this.m_lastName.toLowerCase(Locale.US) + "@" + this.department
				+ ".espol.edu.ec";
	}
	/**
	 * metodo get par password
	 * @return
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * metodo para cambiar password
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * metodo de acceso privado
	 * @return
	 */
	public String getM_firstName() {
		return m_firstName;
	}
	/**
	 * metodo de acceso privado
	 * @param m_firstName
	 */
	public void setM_firstName(String m_firstName) {
		this.m_firstName = m_firstName;
	}
	/**
	 * metodo de acceso privado
	 * @return
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * metodo de acceso privado
	 * @param department
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * metodo de acceso privado
	 * @return
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * metodo de acceso privado
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * metodo de acceso privado
	 * @return
	 */
	public String getM_lastName() {
		return m_lastName;
	}
	/**
	 * metodo de acceso privado
	 * @return
	 */
	public int getDefaultpasswordLength() {
		return defaultpasswordLength;
	}
	
}
