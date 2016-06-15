package pa3;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class Person {
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;

	public Person() {
		this.firstName = "John";
		this.lastName = "Smith";
		this.address = "1211 south cr, mpls, MN";
		this.phoneNumber = "6121111111";
	}

	public Person(String fname, String lname, String address, String phNumber) {
		this.firstName = fname;
		this.lastName = lname;
		this.address = address;
		this.phoneNumber = phNumber;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	private void phoneFormatter() {
		String phoneMask = "(###)-###-####";
		MaskFormatter maskFormatter = null;
		try {
			maskFormatter = new MaskFormatter(phoneMask);
			maskFormatter.setValueContainsLiteralCharacters(false);
			phoneNumber = maskFormatter.valueToString(phoneNumber);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		phoneFormatter();
		String personInfo = "\tFirst Name: " + firstName + "\n\tLastName: "
				+ lastName + "\n\tAddress: " + address + "\n\tPhone: "
				+ phoneNumber + "\n";

		return personInfo;
	}

}
