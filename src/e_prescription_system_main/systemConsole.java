package e_prescription_system_main;


import java.util.Date;


import e_prescription_system.PrescriptionSystem;
import tuc.ece.cs102.util.StandardInputRead;


public class systemConsole {

public static void main(String[] args) {
	PrescriptionSystem pre = new PrescriptionSystem("ESY", "www.esy.gr");
	
	/***************ΑΡΧΙΚΟΠΟΙΗΣΗΣ ΣΥΣΤΗΜΑΤΟΣ*******************************/
	pre.addAsfalismeno("ΓΕΩΡΓΙΑ", "ΦΡΑΓΚΙΣΚΑΤΟΥ", "1965654655");
	pre.addAsfalismeno("ΒΑΣΙΛΙΚΗ", "ΝΙΚΗΤΟΠΟΥΛΟΥ", "1974020145");
	pre.addAsfalismeno("ΜΑΡΙΑ", "ΑΝΔΡΙΟΠΟΥΛΟΥ", "1982014567");
	pre.addAsfalismeno("ΔΙΟΝΥΣΙΑ", "ΠΑΝΑΓΑΚΗ", "1978030240");
	pre.addAsfalismeno("ΕΥΤΕΡΠΗ", "ΚΥΡΜΑΝΙΔΟΥ", "2017335604");
	pre.addAsfalismeno("ΒΙΚΤΩΡΙΑ", "ΤΖΟΥΡΑ", "1976059123");
	pre.addAsfalismeno("ΦΡΑΤΖΕΣΚΑ", "ΝΤΟΥΡΟΥ", "1994328235");
	pre.addAsfalismeno("ΕΛΕΝΗ", "ΤΣΑΚΑΛΙΔΟΥ", "1999378431");
	pre.addAsfalismeno("ΚΩΝΣΤΑΝΤΙΝΑ", "ΑΓΓΕΛΟΠΟΥΛΟΥ", "2013369307");
	pre.addAsfalismeno("ΕΛΕΝΗ", "ΜΟΥΖΟΠΟΥΛΟΥ", "1973427485");
	pre.addAsfalismeno("ΑΝΤΙΟΠΗ", "ΓΡΑΒΑΝΗ", "2015360809");
	pre.addAsfalismeno("ΘΕΟΔΩΡΑ", "ΘΕΟΔΩΡΟΠΟΥΛΟΥ", "2002388680");

	pre.addIatro(7718, "ΔΗΜΟΣΘΕΝΗΣ ΦΑΙΔΩΝ", "ΣΑΡΑΚΗΝΟΣ", "ΠΑΘΟΛΟΓΟΣ");
	pre.addIatro(3644, "ΑΙΚΑΤΕΡΙΝΗ", "ΤΣΕΛΛΟΥ", "ΟΡΘΟΠΕΔΙΚΟΣ");
	pre.addIatro(8391, "ΤΖΑΝΗΣ", "ΦΩΤΑΚΗΣ", "ΟΡΘΟΠΕΔΙΚΟΣ");
	pre.addIatro(9456, "ΓΕΩΡΓΙΟΣ", "ΧΑΖΛΗΣ", "ΝΕΦΡΟΛΟΓΟΣ");
	pre.addIatro(2193, "ΙΑΣΩΝ", "ΧΡΥΣΟΜΑΛΛΗΣ", "ΚΑΡΔΙΟΛΟΓΟΣ");
	pre.addIatro(3336, "ΚΩΝΣΤΑΝΤΙΝΟΣ", "ΑΜΠΑΤΖΙΔΗΣ", "ΚΑΡΔΙΟΛΟΓΟΣ");
	pre.addIatro(4918, "ΣΩΤΗΡΗΣ", "ΑΝΔΡΕΟΥ", "ΨΥΧΙΑΤΡΟΣ");
	pre.addIatro(8775, "ΜΑΡΙΑ", "ΑΡΓΥΡΙΟΥ", "ΨΥΧΙΑΤΡΟΣ");
	pre.addIatro(8909, "ΑΠΟΣΤΟΛΟΣ ΝΙΚΟΛΑΟΣ", "ΒΑΪΛΑΚΗΣ", "ΟΡΘΟΠΕΔΙΚΟΣ");
	pre.addIatro(8843, "ΣΟΦΟΚΛΗΣ ΦΙΛΑΡΕΤΟΣ", "ΓΑΒΡΙΗΛΙΔΗΣ", "ΠΝΕΥΜΟΝΟΛΟΓΟΣ");
	pre.addIatro(9089, "ΚΩΝΣΤΑΝΤΙΝΟΣ ΟΡΕΣΤΗΣ", "ΓΙΑΝΝΑΚΟΠΟΥΛΟΣ", "ΑΛΕΡΓΙΟΛΟΓΟΣ");
	pre.addIatro(3669, "ΘΕΟΔΩΡΑ", "ΘΕΟΔΩΡΟΠΟΥΛΟΥ", "ΠΑΘΟΛΟΓΟΣ");

	pre.addFarmako(66705, "VILIMEN F.C.TAB 10MG/TAB BTx30", (float) 8.62);
	pre.addFarmako(77646, "VILIMEN F.C.TAB 20MG/TAB BTx28", (float) 3.50);
	pre.addFarmako(91091, "SILODOSIN/RONTIS CAPS 4MG/CAP", (float) 7.40);
	pre.addFarmako(83355, "SILODOSIN/RONTIS CAPS 8MG/CAP", (float) 6.00);
	pre.addFarmako(61654, "DINAPLEX CAPS (0.5+0.4)MG/CAP", (float) 2.20);
	pre.addFarmako(27156, "FLUCANID CAPS 100MG/CAP", (float) 2.80);
	pre.addFarmako(94464, "FLUCANID CAPS 200MG/CAP", (float) 12.00);
	pre.addFarmako(49907, "FLUSENIL CAPS 150MG/CAP", (float) 15.00);
	pre.addFarmako(94763, "NORBAL TAB 10MG/TAB", (float) 11.47);
	pre.addFarmako(73286, "ZORTAL F.C.TAB 100MG/TAB", (float) 3.55);
	pre.addFarmako(99555, "ZORTAL F.C.TAB 50MG/TAB", (float) 5.80);
	pre.addFarmako(88825, "DORALIN F.C.TAB 40MG/TAB", (float) 6.90);
	
	String [] arxiFarmakwn1 = {pre.findFarmakoByCode(66705).getName(), pre.findFarmakoByCode(73286).getName(), pre.findFarmakoByCode(99555).getName()};
	pre.addSyntagh("1965654655", pre.findIatroByAade(7718).getFirstName(), pre.findIatroByAade(7718).getLastName(), arxiFarmakwn1, java.sql.Date.valueOf("2020-6-21"), 10);
	
	String [] arxiFarmakwn2 = {pre.findFarmakoByCode(77646).getName(), pre.findFarmakoByCode(91091).getName(), pre.findFarmakoByCode(49907).getName()};
	pre.addSyntagh("1978030240", pre.findIatroByAade(3644).getFirstName(), pre.findIatroByAade(3644).getLastName(), arxiFarmakwn2, java.sql.Date.valueOf("2020-6-24"), 10);

	String [] arxiFarmakwn3 = {pre.findFarmakoByCode(88825).getName()};
	pre.addSyntagh("2002388680", pre.findIatroByAade(8391).getFirstName(), pre.findIatroByAade(8391).getLastName(), arxiFarmakwn3, java.sql.Date.valueOf("2020-7-15"), 10);

	String [] arxiFarmakwn4 = {pre.findFarmakoByCode(99555).getName(), pre.findFarmakoByCode(73286).getName(), pre.findFarmakoByCode(94763).getName(), pre.findFarmakoByCode(27156).getName()};
	pre.addSyntagh("2002388680", pre.findIatroByAade(9456).getFirstName(), pre.findIatroByAade(9456).getLastName(), arxiFarmakwn4, java.sql.Date.valueOf("2020-6-6"), 10);

	String [] arxiFarmakwn5 = {pre.findFarmakoByCode(88825).getName(), pre.findFarmakoByCode(73286).getName(), pre.findFarmakoByCode(66705).getName()};
	pre.addSyntagh("1994328235", pre.findIatroByAade(2193).getFirstName(), pre.findIatroByAade(2193).getLastName(), arxiFarmakwn5, java.sql.Date.valueOf("2020-6-17"), 10);

	String [] arxiFarmakwn6 = {pre.findFarmakoByCode(99555).getName()};
	pre.addSyntagh("1965654655", pre.findIatroByAade(3644).getFirstName(), pre.findIatroByAade(3644).getLastName(), arxiFarmakwn6, java.sql.Date.valueOf("2020-6-27"), 10);

	String [] arxiFarmakwn7 = {pre.findFarmakoByCode(94464).getName(), pre.findFarmakoByCode(77646).getName()};
	pre.addSyntagh("1973427485", pre.findIatroByAade(4918).getFirstName(), pre.findIatroByAade(4918).getLastName(), arxiFarmakwn7, java.sql.Date.valueOf("2020-7-5"), 10);

	String [] arxiFarmakwn8 = {pre.findFarmakoByCode(27156).getName(), pre.findFarmakoByCode(94763).getName(), pre.findFarmakoByCode(73286).getName()};
	pre.addSyntagh("1976059123", pre.findIatroByAade(3644).getFirstName(), pre.findIatroByAade(3644).getLastName(), arxiFarmakwn8, java.sql.Date.valueOf("2020-7-3"), 10);

	String [] arxiFarmakwn9 = {pre.findFarmakoByCode(49907).getName(), pre.findFarmakoByCode(27156).getName()};
	pre.addSyntagh("2013369307", pre.findIatroByAade(7718).getFirstName(), pre.findIatroByAade(7718).getLastName(), arxiFarmakwn9, java.sql.Date.valueOf("2020-7-3"), 10);

	String [] arxiFarmakwn10 = {pre.findFarmakoByCode(94763).getName(), pre.findFarmakoByCode(66705).getName(), pre.findFarmakoByCode(77646).getName(), pre.findFarmakoByCode(83355).getName()};
	pre.addSyntagh("1978030240", pre.findIatroByAade(7718).getFirstName(), pre.findIatroByAade(7718).getLastName(), arxiFarmakwn10, java.sql.Date.valueOf("2020-6-9"), 10);

	String [] arxiFarmakwn11 = {pre.findFarmakoByCode(61654).getName(), pre.findFarmakoByCode(27156).getName(), pre.findFarmakoByCode(94464).getName()};
	pre.addSyntagh("1973427485", pre.findIatroByAade(7718).getFirstName(), pre.findIatroByAade(7718).getLastName(), arxiFarmakwn11, java.sql.Date.valueOf("2020-6-27"), 10);

	String [] arxiFarmakwn12 = {pre.findFarmakoByCode(91091).getName(), pre.findFarmakoByCode(99555).getName(), pre.findFarmakoByCode(73286).getName(), pre.findFarmakoByCode(88825).getName()};
	pre.addSyntagh("1965654655", pre.findIatroByAade(3669).getFirstName(), pre.findIatroByAade(3669).getLastName(), arxiFarmakwn12, java.sql.Date.valueOf("2020-6-1"), 10);
 /**************************************************************************/

int userOption = 0;
StandardInputRead reader = new StandardInputRead();
while (userOption!=8){ 
	 printMenu();
     String userInput = reader.readString("Τι θέλετε να κάνετε? ");
     if (userInput == null) {
         continue;
     } else {
         try {
             userOption = Integer.parseInt(userInput);
         } catch (NumberFormatException ex) {
             userOption = 0;
         }
     }
switch(userOption) {
	case 0:
		System.out.println("Επιλογή " + userOption + " μη έγκυρη...");
		continue;
	case 1:
		String lname = reader.readString("Εισάγετε το επίθετο του ασφαλισμένου:");
		lname = lname.toUpperCase();
		String fname = reader.readString("Εισάγετε το όνομα του ασφαλισμένου:");
		fname = fname.toUpperCase();
		String AMKA = reader.readString("Εισάγετε το ΑΜΚΑ του ασφαλισμένου");
		pre.addAsfalismeno(fname, lname, AMKA);
		break;
	case 2:
		int code = reader.readPositiveInt("Εισάγετε τον κωδικό του φαρμάκου");
		String onomaFarmakou = reader.readString("Εισάγετε το όνομα του φαρμακου:");
		onomaFarmakou = onomaFarmakou.toUpperCase();
		float timh = reader.readPositiveFloat("Εισάγετε την τιμή του φαρμάκου");
		pre.addFarmako(code, onomaFarmakou, timh);
		break;
	case 3:
		int aade = reader.readPositiveInt("Εισάγετε τον Αριθμό ’δειας Ασκήσεως έπαγγέλματος του ιατρού;");
		String lastName = reader.readString("Εισάγετε το επίθετο του ιατρού:");
		lastName = lastName.toUpperCase();
		String firstName = reader.readString("Εισάγετε το όνομα του ιατρού:");
		firstName = firstName.toUpperCase();
		int optionSpec = 0;
		printMenuSpecialty();
        String Spec = reader.readString("Επιλέξτε ειδικότητα ιατρού");
        if (Spec == null) {
            continue;
        } else {
            try {
                optionSpec = Integer.parseInt(Spec);
            } catch (NumberFormatException ex) {
                optionSpec = 0;
            }
        }
		switch(optionSpec) {
			case 0:
				System.out.println("Επιλογή " + optionSpec + " μη έγκυρη...");
				continue;
			case 1:
				Spec = "ΠΑΘΟΛΟΓΟΣ";
				break;
			case 2:
				Spec = "ΨΥΧΙΑΤΡΟΣ";
				break;
			case 3:
				Spec = "ΟΡΘΟΠΕΔΙΚΟΣ";
				break;
			case 4:
				Spec = "ΑΛΕΡΓΙΟΛΟΓΟΣ";
				break;
			case 5:
				Spec = "ΝΕΦΡΟΛΟΓΟΣ";
				break;
			case 6:
				Spec = "ΚΑΡΔΙΟΛΟΓΟΣ";
				break;
			case 7:
				Spec = "ΠΝΕΥΜΟΝΟΛΟΓΟΣ";
				break;
			default:	                    
				 System.out.println("Επιλογή " + optionSpec + " μη έγκυρη...");
                continue;
		}
		pre.addIatro(aade, firstName, lastName, Spec);
		break;
	case 4:
		String AM = reader.readString("Εισάγετε το ΑΜΚΑ του ασφαλισμένου:");
		String epithetoIatrou= reader.readString("Εισάγετε το επίθετο του ιατρού:");
		epithetoIatrou = epithetoIatrou.toUpperCase();
		String onomaIatrou= reader.readString("Εισάγετε το όνομα του ιατρού:");
		onomaIatrou = onomaIatrou.toUpperCase();
		int numOfMeds = reader.readPositiveInt("Πόσα φάρμακα θα έχει η συνταγή; (Μέγιστος αριθμός 4)");
		if (numOfMeds > 4) {
			System.out.println("Μέγιστος αριθμός φαρμάκων 4. Προσπαθήστε ξανά.");
			break;
		}
		String [] onomataFarmakwn = new String[numOfMeds];
		for(int i=0; i<numOfMeds; i++) {
			System.out.println(i+1+"/"+numOfMeds);
			String med = reader.readString("Εισάγετε το όνομα του "+(i+1)+"ου φαρμάκου:");
			onomataFarmakwn[i] = med;
		}
		Date execDate = reader.readDate("Εισάγετε ημερομηνία έναρξης εκτέλεσης της συνταγής με τη μορφη ΗΗ/ΜΜ/ΕΕ");
		int daysOfExec = reader.readPositiveInt("Πόσες μέρες θα είναι εκτελέσιμη η συνταγή;");
		pre.addSyntagh(AM, onomaIatrou, epithetoIatrou, onomataFarmakwn, execDate, daysOfExec);
		break;
	case 5:
		int optionSearch = 0;
		printMenuSearch();
        String Search = reader.readString("Επιλέξτε τον αριθμό που αντιστοιχεί στα κριτήρια αναζήτησης:");
        if (Search == null) {
            continue;
        } else {
            try {
                optionSearch = Integer.parseInt(Search);
            } catch (NumberFormatException ex) {
                optionSearch = 0;
            }
        }
		switch(optionSearch) {
			case 0:
				continue;
			case 1:
				String am = reader.readString("Εισάγετε το ΑΜΚΑ του ασαλισμένου:");
				pre.findAndPrintSyntaghByAsfalismeno(am);
				break;
			case 2:
				int aad = reader.readPositiveInt("Εισάγετε το ΑΑΔΕ του ιατρού:");
				pre.findAndPrintSyntaghByIatro(aad);
				break;
			case 3:
				int kwd = reader.readPositiveInt("Εισάγετε τον κωδικό του φαρμάκου:");
				pre.findAndPrintSyntaghByFarmakoCode(kwd);
				break;
			case 4:
				Date d1 = reader.readDate("Εισάγετε την ημερομηνία από την οποία θέλετε να ξεκινήσετε την αναζήτηση(ΗΗ/ΜΜ/ΕΕΕΕ)");
				Date d2 = reader.readDate("Εισάγετε την ημερομηνία μέχρι την οποία θέλετε να κάνετε αναζήτηση(ΗΗ/ΜΜ/ΕΕΕΕ)");
				pre.findAndPrintSyntaghBetweenDates(d1, d2);
				break;
			default:
				System.out.println("Επιλογή " + optionSearch + " μη έγκυρη...");
				continue;
		}
		break;
	case 6:
		int optionPrint = 0;
		printMenuPrint();
        String print = reader.readString("Επιλέξτε τον αριθμό που αντιστοιχεί στον κατάλογο που θέλετε να εκτυπώσετε:");
        if (print == null) {
            continue;
        } else {
            try {
                optionPrint = Integer.parseInt(print);
            } catch (NumberFormatException ex) {
                optionPrint = 0;
            }
        }
		switch(optionPrint) {
			case 0:
				System.out.println("Επιλογή " + optionPrint + " μη έγκυρη...");
				continue;
			case 1:
				System.out.println("Τα στοιχεία των ασφαλισμένων είναι τα εξής:");
				pre.printAsfalismenous();
				break;
			case 2:
				System.out.println("Τα στοιχεία των ιατρών είναι τα εξής:");
				pre.printIatrous();
				break;
			case 3:
				System.out.println("Τα στοιχεία των φαρμάκων είναι τα εξής:");
				pre.printFarmaka();
				break;
			case 4:
				System.out.println("Τα στοιχεία των συνταγών είναι τα εξής:");
				pre.printSyntages();
				break;
			default:
				System.out.println("Επιλογή " + optionPrint + " μη έγκυρη...");
				continue;
		}
		break;
	case 7:
		String amkaForDelete = reader.readString("Εισάγετε το ΑΜΚΑ του ασφαλισμένου προς διαγραφη:");
		pre.deleteAsfalismeno(amkaForDelete);
		break;
	case 8:
		System.out.println("Ευχάριστούμε που χρησιμοποιείτε το σύστημά μας!");
		break;
	default:
        System.out.println("Επιλογή " + userOption + " μη έγκυρη...");
		continue;	
	}
}


}

	public static void printMenu() {
        System.out.println("                 Καλωσόρισες στο σύστημα");
        System.out.println("===========================================================");
        System.out.println("1. Εισαγωγή ασφαλισμένου...................................");
        System.out.println("2. Εισαγωγή φαρμάκου ......................................");
        System.out.println("3. Εισαγωγή ιατρού.........................................");
        System.out.println("4. Εισαγωγή συνταγής.......................................");
        System.out.println("5. Αναζήτηση συνταγών......................................");    
        System.out.println("6. Εκτύπωση καταλόγου βάσης δεδομένων......................");    
        System.out.println("7. Διαγραφή ασφαλισμένου...................................");   
        System.out.println("8. Έξοδος.................................................."); 
        System.out.println("===========================================================");
    }
	public static void printMenuSpecialty() {
        System.out.println("===========================================================");
        System.out.println("1. Παθολόγος...............................................");
        System.out.println("2. Ψυχίατρος ..............................................");
        System.out.println("3. Ορθοπεδικός.............................................");
        System.out.println("4. Αλεργιολόγος............................................");
        System.out.println("5. Νεφρολόγος..............................................");   
        System.out.println("6. Καρδιολόγος.............................................");
        System.out.println("7. Πνευμονολόγος..........................................."); 
        System.out.println("===========================================================");

	}
	public static void printMenuSearch() {
        System.out.println("===========================================================");
        System.out.println("1. Αναζήτηση συνταγών ασφαλισμένου.........................");
        System.out.println("2. Αναζήτηση συνταγών ιατρού ..............................");
        System.out.println("3. Αναζήτηση συνταγών βάση φαρμάκου........................");
        System.out.println("4. Αναζήτηση συνταγών βάση ημερομηνίας.....................");
        System.out.println("===========================================================");
	}
	public static void printMenuPrint() {
        System.out.println("===========================================================");
        System.out.println("1. Εκτύπωση καταχωρημένων ασφαλισμένων.....................");   
        System.out.println("2. Εκτύπωση καταχωρημένων ιατρών...........................");   
        System.out.println("3. Εκτύπωση καταχωρημένων φαρμάκων.........................");   
        System.out.println("4. Εκτύπωση καταχωρημένων συνταγών.........................");   
        System.out.println("===========================================================");
	}
}
