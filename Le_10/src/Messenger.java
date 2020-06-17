/**
 * Testprogramm fuer die Klasse Message.java
 *
 * @author Raphael Retschke. (s78412@beuth-hochschule.de)
 * @version 1.0, 10.12.2018
 */


import java.util.Scanner;
public class Messenger {

	//Konstruktor für die Klasse Message.java
	static Message message1;
	static Message message2;
	static Message message3;
	static Message message4;
	static String input;
	
    /**
     * Main-Method zum Starten und Testen der Klasse Message.java Diese main-Methode
     * ist der definierte Einstiegspunkt fuer die Ausfuehrung des Programs und
     * erlaubt das Programm zu testen. Es ist möglich neue Nachrichten einzugeben und sich diese
     * wieder ausgeben zu lassen. Die Steuerung des Programms erfolgt mittels Buchstabeneingabe. 
     * Die Steuerung ist selbsterklärend. 
     * 
     * @param args
     *            die Argumente, die man im Allgemeinen fuer die Ausfuehrung
     *            geben kan
     *            
     *           
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub



	

System.out.println("============Hauptmenue===========");
System.out.println("n - neue Nachricht");
System.out.println("l - Nachrichten auflisten");
System.out.println("q - beenden");
System.out.println("Bitte Eingabe tätigen");
Scanner scanner = new Scanner(System.in);
input = scanner.next();
while (!input.equals("q") ) {
//for (i=0;i<=2;i++) {
	//i=0;	

	

	if (input.equals("q")){
		//i = 2;
	}
	if (input.equals("l")){
		listMessage();
	}
		
	if (input.equals("n")){
		newMessage();
	}
	System.out.println("============Hauptmenue===========");
	System.out.println("n - neue Nachricht");
	System.out.println("l - Nachrichten auflisten");
	System.out.println("q - beenden");
	System.out.println("Bitte Eingabe tätigen");
	//System.out.println(input);
	input = scanner.next();
};
scanner.close();
System.out.println("Programm wird beendet");
	}
	
    /**
     * Die Methode newMessage() dient zur Eingabe einer neuen Nachricht über die Standardkonsole.
     */
	
	
	public static void newMessage() {
		int nr = 6;
		//System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 4 ein");

		boolean input_correct = false;
		while (input_correct == false) {
			Scanner scanner = new Scanner(System.in);
			//nr = scanner.nextInt();
				while (nr>4) {
					
					System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 4 ein");
					nr = scanner.nextInt();
				}
		System.out.println("Bitte geben Sie eine Ueberschrift.");		
		String title = scanner.next();
		System.out.println("Bitte geben Sie den Text ein.");
		String text= scanner.next();
		switch(nr) { 
		case 1:
			message1 = new Message(nr,title,text);
			input_correct = true;
			break;
		case 2:
			message2 = new Message(nr,title,text);
			input_correct = true;
			break;
		case 3:
			message3 = new Message(nr,title,text);
			input_correct = true;
			break;
		case 4:
			message4 = new Message(nr,title,text);
			input_correct = true;
			break;
		default:
			System.out.print("Eingabe ungültig. Es muss eine Zahl zwischen 1 und 4 eingegeben werden\n");
			break;
		}
		System.out.println("b - zurueck");
		input = scanner.next();
		while (!input.equals("b") ) {

			input = scanner.next();
		}
		}

	}
    /**
     * Die Methode listMessage() dient zur Ausgabe einer neuen Nachricht auf der Standardkonsole.
     */
public static  void listMessage() {

	System.out.println("Welche Nachricht soll ausgegeben werden?");
	Scanner scanner = new Scanner(System.in);

	
	 
	boolean input_correct = false;
	while (input_correct == false) {
	
		int nr = scanner.nextInt();
	
	 	switch(nr) { 
			case 1:
				System.out.println("laufende Nummer: " + message1.nr+"\n");
				System.out.println("Titel: " + message1.title+"");
				System.out.println("Text: " + message1.text+"\n");
				input_correct = true;
				break;
			case 2:
				System.out.println("laufende Nummer: " + message2.nr+"\n");
				System.out.println("Titel: " + message2.title+"");
				System.out.println("Text: " + message2.text+"\n");
				input_correct = true;
				break;
			case 3:
				System.out.println("laufende Nummer: " + message3.nr+"\n");
				System.out.println("Titel: " + message3.title+"\n");
				System.out.println("Text: " + message3.text+"\n");
				input_correct = true;
				break;
			case 4:
				System.out.println("laufende Nummer: " + message4.nr+"\n");
				System.out.println("Titel: " + message4.title+"\n");
				System.out.println("Text: " + message4.text+"\n");
				input_correct = true;
				break;
			default:
				System.out.print("Eingabe ungültig. Es muss eine Zahl zwischen 1 und 4 eingegeben werden\n");
				break;
		}

	}
	System.out.println("b - zurueck");
	
	while (!input.equals("b") ) {
		input = scanner.next();
	}
	
} 
 
	}

	
