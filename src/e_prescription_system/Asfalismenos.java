package e_prescription_system;

import java.util.Vector;

public class Asfalismenos {
private String AMKA;
private String firstName;
private String lastName;
private Vector<Syntagh> syntagesAsfalismenou ;

//constructors
public Asfalismenos(String AM, String fname, String lname) {
	this.AMKA = AM;
	this.firstName = fname;
	this.lastName = lname;
	syntagesAsfalismenou = new Vector<Syntagh>();
}

public Asfalismenos() {
	syntagesAsfalismenou = new Vector<Syntagh>();

}

//methods
public void setAMKA(String AM) {
	this.AMKA = AM;
}
public void setFname(String fname) {
	this.firstName = fname;
}
public void setLname(String lname) {
	this.lastName = lname;
}
public String getAMKA() {
	return this.AMKA;
}
public String getFirstName() {
	return this.firstName;
}
public String getLastName() {
	return this.lastName;
}
public String getFullName() {
	return this.firstName +" "+ this.lastName;
}

public Vector<Syntagh> getSyntagesAsfalismenou() {
	return syntagesAsfalismenou;
}

public void addSyntagesAsfalismenou(Syntagh s) {
	syntagesAsfalismenou.add(s);
}
public void deleteSyntagesAsfalismenou() {
	this.syntagesAsfalismenou.removeAllElements();
}


}
