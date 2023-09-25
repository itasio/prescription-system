package e_prescription_system;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;


public class Syntagh {
	
private int code;
private Asfalismenos asfalismenosSyntaghs;
private Iatros iatrosSyntaghs;
private float cost;
private Vector<Farmako> farmakaSyntaghs;
private Date prescriptionDate;
private Date executionDate;
private Date expirationDate;
private int daysOfExecution;

SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
//constructors
public Syntagh(Asfalismenos asf, Iatros iatr, Vector<Farmako> farmaka, Date preDate, Date execDate, Date expDate, int daysOfExecution) {
	this.asfalismenosSyntaghs = asf;
	this.iatrosSyntaghs = iatr;
	this.prescriptionDate = preDate;
	this.executionDate = execDate;
	this.expirationDate = expDate;
	this.setDaysOfExecution(daysOfExecution);
	farmakaSyntaghs = new Vector<Farmako>(farmaka);
}
public Syntagh() {
	farmakaSyntaghs = new Vector<Farmako>();
}
//methods
public int getCode() {
	return code;
}
public void setCode(int c) {
	this.code = c;
}
public float getCost() {
	return cost;
}
public void setCost() {
	float c=0;
	for(int i = 0; i<farmakaSyntaghs.size(); i++) {
		Farmako f = farmakaSyntaghs.get(i);
		c += f.getPrice();
	}
	this.cost = c; 
}
public int getDaysOfExecution() {
	return daysOfExecution;
}
public void setDaysOfExecution(int daysOfExecution) {
	this.daysOfExecution = daysOfExecution;
}
public Date getPrescriptionDate() {
	return prescriptionDate;
}
public void setPrescriptionDate(Date preDate) {
	this.prescriptionDate = preDate;
}
public Date getExpirationDate() {
	return expirationDate;
}
public void setExpirationDate(Date expDate) {
	this.expirationDate = expDate;
}
public Iatros getIatrosSyntaghs() {
	return iatrosSyntaghs;
}
public void setIatrosSyntaghs(Iatros iatr) {
	this.iatrosSyntaghs = iatr;
}
public Asfalismenos getAsfalismenosSyntaghs() {
	return asfalismenosSyntaghs;
}
public void setAsfalismenosSyntaghs(Asfalismenos asf) {
	this.asfalismenosSyntaghs = asf;
}
public void setFarmakaSyntaghs(Farmako f) {
	this.farmakaSyntaghs.add(f);
}
public Vector<Farmako> getFarmakaSyntaghs() {
	return farmakaSyntaghs;
}
public int [] getKwdikousFarmakwnSyntaghs(Syntagh s){
	int [] kwdikoi = new int[farmakaSyntaghs.size()];
	for(int i=0; i< farmakaSyntaghs.size(); i++ ) {
		Farmako f = farmakaSyntaghs.get(i);
		kwdikoi[i] = f.getCode();
	}
	return kwdikoi;
}
public Date getExecutionDate() {
	return executionDate;
}
public void setExecutionDate(Date exDate) {
	this.executionDate = exDate;
}
public String getStoixeiaSyntaghs() {
	return code+" "+asfalismenosSyntaghs.getAMKA()+" "+iatrosSyntaghs.getAADE()+" "+cost+" "+df.format(prescriptionDate)+" "+df.format(executionDate)+" "+df.format(expirationDate);
}
}
