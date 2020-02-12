package day1017_Serialize;
import java.io.*;
import java.util.*;


public class Main {

	public static void reader(String fileName) {
		try {
			FileReader fileReader = new FileReader(fileName) ;
			BufferedReader reader = new BufferedReader(fileReader);
			String line;
			
			while ((line = reader.readLine()) != null) {
				String[] cols = line.split(",");
				System.out.format("cols: %d, First: %s\n", cols.length, cols[0]);
			}
			reader.close();
			fileReader.close();		
		} catch (Exception ex) {
			ex.printStackTrace();			
		} finally {
			
		}
		
	}
	public static void writeObjects() {
		ArrayList<Contact> contacts = new ArrayList<Contact>();
		
		for (int i = 0; i < 3; i++) {			
			Contact contact = new Contact();
			contact.setFirstName("길동" + i);
			contact.setLastName("홍");
			contacts.add(contact);
			
		}
		

		try {
			FileOutputStream is = new FileOutputStream("contacts.dat");
			ObjectOutputStream input = new ObjectOutputStream(is);
			
			contacts = (ArrayList<Contact>) input.readObject();
			
			for (Contact contact : contacts) {
				System.out.println(contact);
			}
		} catch (Exception ex) {
			
		} finally {
		}
		
		for (int i = 0; i < 10; i++) {			
			Contact contact = new Contact();
			contact.setFirstName("길동" + i);
			contact.setLastName("홍");
			contacts.add(contact);			
		}		
		
		try {
			FileOutputStream os = new FileOutputStream("contacts.dat");
			ObjectOutputStream output = new ObjectOutputStream(os);
			
			//직렬화 객체를 읽을 때 저장 개수를 알 수 없어서, 이 문제를 해결하려고
			//저장된 객체의 수를 우선 저장한다.
			
			output.writeInt(contacts.size());
//			output.writeInt(contacts.size());
			
			while (input.available() > 0) {
				Contact contact = (Contact) input.readObject();
				Contacts.add(contacts);
			}
			for (Contact contact : contacts) {
				output.writeObject(contact);
				System.out.println
			}
			output.flush();
			output.close();
			os.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			
		}
	}
}
