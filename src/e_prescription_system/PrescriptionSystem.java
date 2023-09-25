package e_prescription_system;

import java.util.Vector;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class PrescriptionSystem {
	
private String name;
private String url;
private Vector<Asfalismenos> listaAsfalismenwn;
private Vector<Iatros> listaIatrwn;
private Vector<Farmako> listaFarmakwn;
private Vector<Syntagh> listaSyntagwn;


//constructors
public PrescriptionSystem(String n, String u) {
	this.setName(n);
	this.setUrl(u);
	listaAsfalismenwn = new Vector<Asfalismenos>();
	listaIatrwn = new Vector<Iatros>();
	listaFarmakwn = new Vector<Farmako>();	
	listaSyntagwn = new Vector<Syntagh>();
}

public PrescriptionSystem() {
	listaAsfalismenwn = new Vector<Asfalismenos>();
	listaIatrwn = new Vector<Iatros>();
	listaFarmakwn = new Vector<Farmako>();	
	listaSyntagwn = new Vector<Syntagh>();
}

//methods	

public String getName() {
		return name;
}

public void setName(String n) {
	this.name = n;
}

public String getUrl() {
	return url;
}

public void setUrl(String u) {
	this.url = u;
}

public Vector<Asfalismenos> getListaAsfalismenwn() {
	return listaAsfalismenwn;
}

public void addListaAsfalismenwn(Asfalismenos a) {
	listaAsfalismenwn.add(a);
}

public Vector<Farmako> getListaFarmakwn() {
	return listaFarmakwn;
}

public void addListaFarmakwn(Farmako f) {
	listaFarmakwn.add(f);
}

public Vector<Iatros> getListaIatrwn() {
	return listaIatrwn;
}

public void addListaIatrwn(Iatros i) {
	listaIatrwn.add(i);
}

public Vector<Syntagh> getListaSyntagwn() {
	return listaSyntagwn;
}

public void addListaSyntagwn(Syntagh s) {
	listaSyntagwn.add(s);
}
//more methods
public void addAsfalismeno(String fname, String lname, String AMKA) {
	Asfalismenos a = findAsfaslismeno(AMKA);
	if(a != null)
		System.out.println("O ������������ ����� ��� ������������� ��� �������.");
	else if (fname.isEmpty() || lname.isEmpty() || fname == null || lname == null)
		System.out.println("������ �� �������� ����� ��� ������� ������������.");
	else {
		Asfalismenos b = new Asfalismenos(AMKA, fname, lname);
		this.listaAsfalismenwn.add(b);}
}
public void addFarmako(int code, String name, float price) {
	Farmako a = findFarmakoByCode(code);
	if(a != null)
		System.out.println("�� ������� ����� ��� ������������ ��� �������.");
	else if(name.isEmpty() || name == null)
		System.out.println("������ �� �������� ����� ��������.");
	else {
		Farmako b = new Farmako(code, name, price);
		this.listaFarmakwn.add(b);
	}
}
public void addIatro(int aade, String fname, String lname, String specialty) {
	Iatros a = findIatroByAade(aade);
	if(a != null)
		System.out.println("� ������ ����� ��� ������������� ��� �������");
	else if (fname.isEmpty() || lname.isEmpty() || fname == null || lname == null)
		System.out.println("������ �� �������� ����� ��� ������� ������.");
	else{
		Iatros b = new Iatros(aade, fname, lname, specialty);
		this.listaIatrwn.add(b);
	}
}
public void addSyntagh(String AMKA, String fname, String lname, String[] onomataFarmakwn, Date execDate, int daysOfExec) {
	Asfalismenos a = findAsfaslismeno(AMKA);
	if (a != null) {
		Iatros iatr = findIatroByName(fname, lname);
		if (iatr != null) {
			Vector<Farmako> farmaka = new Vector<Farmako>();
			for(int i=0; i<onomataFarmakwn.length; i++) {
				for(int j=0; j<listaFarmakwn.size(); j++) {
					Farmako f = listaFarmakwn.get(j);
					if (onomataFarmakwn[i].equals(f.getName()))
						farmaka.add(f);
				}
			}
			if (farmaka.size() == onomataFarmakwn.length) {
				Calendar cal = Calendar.getInstance();
				Date preDate = new Date();
				cal.setTime(execDate);
				cal.add(Calendar.DATE, daysOfExec);
				Date expDate = cal.getTime();
				Syntagh s = new Syntagh(a, iatr, farmaka, preDate, execDate, expDate, daysOfExec);
				this.listaSyntagwn.add(s);
				s.setCode(listaSyntagwn.indexOf(s));//���� ������ �������� �� ���� ��� ���� ��� �������� ������ ��������
				s.setCost();
				a.addSyntagesAsfalismenou(s);	
				iatr.addSyntagesIatrou(s);
				for(int i=0; i<s.getFarmakaSyntaghs().size(); i++) {
					Farmako f = s.getFarmakaSyntaghs().get(i);
					f.addSyntagesFarmakou(s); 		//��������� ���� ��� �������� ��� ����������� �� �������, ���� ��� ������������ �� �������
				}
			}else
				System.out.println("'��� � ����������� ��� �� ������� ��� ����� ������������.");

		}else
			System.out.println("� ������ ��� ����� �������������");

	}else
		System.out.println("� ������������ ��� ����� �������������");
	
}
public Asfalismenos findAsfaslismeno(String AM) {
	for(int i = 0; i < listaAsfalismenwn.size(); i++) {
		Asfalismenos a = listaAsfalismenwn.get(i);
		if (a.getAMKA().equals(AM))
			return a;
		}
	return null;
}

public void deleteAsfalismeno(String AM) {
	Asfalismenos a = findAsfaslismeno(AM);
	if (a == null)
		System.out.println("� ������������ �� ����:"+" "+AM+" "+"��� �������.");
	else {
		for (int i = 0; i < a.getSyntagesAsfalismenou().size(); i++) {
			Syntagh s = a.getSyntagesAsfalismenou().get(i);
				for (int j = 0; j < s.getFarmakaSyntaghs().size(); j++) {
					Farmako f = s.getFarmakaSyntaghs().get(j);
					f.deleteSyntaghFarmakou(s);
				}
				s.getIatrosSyntaghs().deleteSyntaghIatrou(s);
				listaSyntagwn.remove(s);
				listaAsfalismenwn.remove(a);	
		}
		System.out.println("� ������������ ��� �� �������� ��� �����������.");
		}
}
	
public Farmako findFarmakoByCode(int code) {
	for(int i=0; i<listaFarmakwn.size(); i++) {
		Farmako f = listaFarmakwn.get(i);
		if (f.getCode() == code)
			return f;
	}
	return null;
}
public Farmako findFarmakoByName(String name) {
	for(int i=0; i<listaFarmakwn.size(); i++) {
		Farmako f = listaFarmakwn.get(i);
		if (f.getName().equals(name))
			return f;
	}
	return null;
}
public Iatros findIatroByAade(int aade) {
	for(int i = 0; i < listaIatrwn.size(); i++) {
		Iatros iatr = listaIatrwn.get(i);
		if (iatr.getAADE() == aade)
			return iatr;
		}
	return null;
}
public Iatros findIatroByName(String fname, String lname) {
	for(int i = 0; i < listaIatrwn.size(); i++) {
		Iatros iatr = listaIatrwn.get(i);
		if (iatr.getFirstName().equals(fname) && iatr.getLastName().equals(lname))
			return iatr;
		}
	return null;
}
public void printAsfalismenous() {
	if(listaAsfalismenwn.size() > 0) {
		for (int i=0; i<listaAsfalismenwn.size(); i++) {
			Asfalismenos a = listaAsfalismenwn.get(i);
			System.out.println(a.getFullName()+" "+a.getAMKA());
		}
	}else
		System.out.println("��� �������� ������������� ������������");
}
public void printIatrous() {
	if(listaIatrwn.size() > 0) {
		for (int i=0; i<listaIatrwn.size(); i++) {
			Iatros a = listaIatrwn.get(i);
			System.out.println(a.getStoixeiaIatrou());
		}
	}else
		System.out.println("��� �������� ������������� ������");

}
public void printFarmaka() {
	if(listaFarmakwn.size() > 0) {
		for (int i=0; i<listaFarmakwn.size(); i++) {
			Farmako a = listaFarmakwn.get(i);
			System.out.println(a.getCode()+" "+a.getName()+" "+a.getPrice());
		}
	}else
		System.out.println("��� �������� ������������ �������");

}
public void printSyntages() {
	if(listaSyntagwn.size() > 0) {
		System.out.println("�� ����� ���������:");
		System.out.println("������� ��������, ���� ������, ���� ������, ������, ���������� ���������������, ������ ���������, ���������� �����, ������� ��������.");
		for (int i=0; i<listaSyntagwn.size(); i++) {
			Syntagh s = listaSyntagwn.get(i);
			System.out.print(s.getStoixeiaSyntaghs());
			System.out.println(Arrays.toString( s.getKwdikousFarmakwnSyntaghs(s)));
		}
	}else
		System.out.println("��� �������� ������������� ��������");

}
public void findAndPrintSyntaghByFarmakoCode(int code){
	Farmako f = this.findFarmakoByCode(code);
	if (f != null) {
		if (f.getSyntagesFarmakou().isEmpty())
			System.out.println("�� �������"+f.getName()+"��� ���� ��������������� ��� ������ �������.");
		else {
			System.out.println("�� ������� "+f.getName()+" ���������������� ��� ��� ���� ��������:");
			System.out.println("�� ����� ���������:");
			System.out.println("������� ��������, ���� ������, ���� ������, ������, ���������� ���������������, ������ ���������, ���������� �����, ������� ��������.");
			for(int i=0; i<f.getSyntagesFarmakou().size(); i++) {
				Syntagh s = f.getSyntagesFarmakou().get(i);
				System.out.print(s.getStoixeiaSyntaghs());
				System.out.println(Arrays.toString( s.getKwdikousFarmakwnSyntaghs(s)));
			}
		}
	}else
		System.out.println("������ �������");		
}
public void findAndPrintSyntaghByAsfalismeno(String AMKA) {
	Asfalismenos a = this.findAsfaslismeno(AMKA);	
	if(a != null) {
		if (a.getSyntagesAsfalismenou().isEmpty())
			System.out.println("� ������������ "+a.getFullName()+" ��� ���� �������� ��� ����� ���.");
		else {
			System.out.println("� ������������ "+a.getFullName()+" ���������� �� ��� ���� ��������:");
			System.out.println("�� ����� ���������:");
			System.out.println("������� ��������, ���� ������, ���� ������, ������, ���������� ���������������, ������ ���������, ���������� �����, ������� ��������.");
			for(int i=0; i<a.getSyntagesAsfalismenou().size(); i++) {
				Syntagh s = a.getSyntagesAsfalismenou().get(i);
				System.out.print(s.getStoixeiaSyntaghs());
				System.out.println(Arrays.toString( s.getKwdikousFarmakwnSyntaghs(s)));
			}	
		}
	}
	else
		System.out.println("����� AMKA");
}
public void findAndPrintSyntaghByIatro(int AADE) {
	Iatros iatr = this.findIatroByAade(AADE);
	if(iatr != null) {
		if(iatr.getSyntagesIatrou().isEmpty())
			System.out.println("� ������ "+iatr.getFirstName()+" "+iatr.getLastName()+" ��� ���� �������� ��� ����� ���.");
		else {
			System.out.println("� ������ ���������� �� ��� ���� ��������:");
			System.out.println("�� ����� ���������:");
			System.out.println("������� ��������, ���� ������, ���� ������, ������, ���������� ���������������, ������ ���������, ���������� �����, ������� ��������.");
			for(int i=0; i<iatr.getSyntagesIatrou().size(); i++) {
				Syntagh s = iatr.getSyntagesIatrou().get(i);
				System.out.print(s.getStoixeiaSyntaghs());
				System.out.println(Arrays.toString( s.getKwdikousFarmakwnSyntaghs(s)));			}
		}
	}
	else
		System.out.println("����� ����");

}
public void findAndPrintSyntaghBetweenDates(Date d1, Date d2) {
	int ctr = 0;
	if (d1==null || d2==null) {
		System.out.println("�� ������� �����������");
		return;
	}
	else if(d1.after(d2)) {
		System.out.println("�� ������� �����������. � ���������� ������� ��� ���������� ������ �� ����� ���� �� ����� ��� ����������.");
		return;
	}
	else if(d1.equals(d2)) {
		Date execDate = new Date();
		Date expDate = new Date();
		for(int i=0; i < listaSyntagwn.size(); i++) {
			Syntagh s = listaSyntagwn.get(i);
			execDate = listaSyntagwn.get(i).getExecutionDate();
			expDate = listaSyntagwn.get(i).getExpirationDate();
			if ((execDate.before(d1) || execDate.equals(d1)) && (expDate.after(d1) || expDate.equals(d1))) {
				System.out.print(s.getStoixeiaSyntaghs());
				System.out.println(Arrays.toString( s.getKwdikousFarmakwnSyntaghs(s)));
				ctr = 1;
			}
		}
	}else {
		Date execDate = new Date();
		Date expDate = new Date();
		for(int i=0; i < listaSyntagwn.size(); i++) {
			Syntagh s = listaSyntagwn.get(i);
			execDate = listaSyntagwn.get(i).getExecutionDate();
			expDate = listaSyntagwn.get(i).getExpirationDate();
			if ((execDate.before(d1) && expDate.after(d1)) || (execDate.after(d1) && execDate.before(d2))) {
				System.out.print(s.getStoixeiaSyntaghs());
				System.out.println(Arrays.toString( s.getKwdikousFarmakwnSyntaghs(s)));
				ctr = 1;
			}
		}
	}
if (ctr == 0)
	System.out.println("��� ����������� ���� ��� ����� ��� �����������");
}

}

	

