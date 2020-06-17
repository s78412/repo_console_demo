/**
 * Klasse zum Erzeugen von Message-Objekten
 *
 * @author Raphael Retschke. (s78412@beuth-hochschule.de)
 * @version 1.0, 10.12.2018
 */

public class Message {
int nr;
String title;
String text;
/**
 * Konstruktor fuer die Klasse Message
 * @param nr
 *            Nummer der Nachricht
 *	@param title
 *            Titel der Nachricht
 *	@param text
 *            Text der Nachricht
 *                       
 */
	public Message(int nr,String title, String text) {
	this.nr = nr;
	this.title = title;
	this.text = text;
	System.out.print("\nNachricht " + nr + " erfolgreich eingegeben.\n");
}
}

