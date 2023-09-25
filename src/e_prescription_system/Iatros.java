package e_prescription_system;

import java.util.Vector;

public class Iatros {
private int AADE;
private String firstName;
private String lastName;
private String specialty;
private Vector<Syntagh> syntagesIatrou;


//constructors
public Iatros(int a, String fname, String lname, String sp) {
	this.AADE = a;
	this.firstName = fname;
	this.lastName = lname;
	this.specialty = sp;
	syntagesIatrou = new Vector<Syntagh>();

}
public Iatros() {
	syntagesIatrou = new Vector<Syntagh>();

}

//methods
public void setAADE(int a){
	this.AADE = a;
}

public void setFname(String fname){
	this.firstName = fname;
}
public void setLname(String lname){
	this.lastName = lname;
}
public void setSpecialty(String s){
	this.specialty = s;
}
public Vector<Syntagh> getSyntagesIatrou() {
	return syntagesIatrou;
}

public void addSyntagesIatrou(Syntagh s) {
	syntagesIatrou.add(s);
}
public String getFirstName(){
	return this.firstName;
}
public String getLastName(){
	return this.lastName;
}
public int getAADE(){
	return this.AADE;
}
public String getSpecialty(){
	return this.specialty;
}
public String getStoixeiaIatrou() {
	return firstName+" "+lastName+" "+ AADE+" "+specialty;
}
public void deleteSyntaghIatrou(Syntagh s) {
	this.syntagesIatrou.remove(s);
}
}
