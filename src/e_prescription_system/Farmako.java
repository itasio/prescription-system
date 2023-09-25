package e_prescription_system;

import java.util.Vector;


public class Farmako {
	
private int code;
private String name;
private float price;
private Vector<Syntagh> syntagesFarmakou ;


//constructors
public Farmako(int c, String n, float p) {
	this.code = c;
	this.name = n;
	this.price = p;
	syntagesFarmakou = new Vector<Syntagh>();

}
public Farmako() {
	syntagesFarmakou = new Vector<Syntagh>();

}
//methods
public void setCode(int c){
	this.code = c;
}
public void setName(String s){
	this.name = s;
}
public void setprice(float p){
	this.price = p;
}
public int getCode(){
	return this.code;
}
public String getName(){
	return this.name;
}
public float getPrice(){
	return this.price;
}
public Vector<Syntagh> getSyntagesFarmakou() {
	return syntagesFarmakou;
}

public void addSyntagesFarmakou(Syntagh s) {
	syntagesFarmakou.add(s);
}
public void deleteSyntaghFarmakou(Syntagh s) {
	this.syntagesFarmakou.remove(s);
}
}
