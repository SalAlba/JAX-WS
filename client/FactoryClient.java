package client;

import java.io.IOException;
import java.net.URL;

public class FactoryClient {

	public static void main(String[] args) throws IOException {			
		FactoryService service = new FactoryService();
		Factory port = service.getFactoryPort();
		StudentObject stubObject = port.createStudentObject(1, "Sal", 4.5);
		// System.out.println("StudentObject = " + stubObject.getId() + " : \"" + stubObject.getName() + "\"");
		log(stubObject);

		// 1.
		System.out.println(port.getStringList());
		port.addString("A");
		port.addString("B");
		port.addString("C");
		System.out.println(port.getStringList());

		port.removeString(1);
		System.out.println(port.getStringList());

		System.out.println(port.getOneString(1));

		port.updateString(1, "UPDATE");
		System.out.println(port.getStringList());

		// 2.
		// getStudentList()
		// getOneStudent(int index)
		// addStudent(int id, String name, double score)
		// removeStudent(int index)
		// updateStudent(int index, int id, String name, double score)
		System.out.println(port.getStudentList());
		port.addStudent(1, "Student A", 3.0);
		port.addStudent(2, "Student B", 3.5);
		port.addStudent(3, "Student C", 4.0);
		System.out.println(port.getStudentList());

		port.removeStudent(1);
		System.out.println(port.getStudentList());

		System.out.println(port.getOneStudent(1));
		log(port.getOneStudent(1));

		port.updateStudent(1, 22, "Student UPDATE", 2.0);
		System.out.println(port.getStudentList());
		log(port.getOneStudent(1));		

	
		URL url = new URL("http://localhost:9999/factoryService?wsdl");
		service = new FactoryService(url);
		port = service.getFactoryPort();
		stubObject = port.createStudentObject(2, "Mars", 5.0);
		System.out.println(stubObject);

		// 3.
		// getStudentList()
		// getOneStudent(int index)
		// addStudent(int id, String name, double score)
		// removeStudent(int index)
		// updateStudent(int index, int id, String name, double score)
		System.out.println(port.getStudentList());
		port.addStudent(1, "Student E", 4.0);
		port.addStudent(2, "Student F", 4.5);
		port.addStudent(3, "Student G", 4.0);
		System.out.println(port.getStudentList());

		port.removeStudent(1);
		System.out.println(port.getStudentList());

		System.out.println(port.getOneStudent(1));
		log(port.getOneStudent(1));

		port.updateStudent(1, 22, "Student UPDATE", 5.0);
		System.out.println(port.getStudentList());
		log(port.getOneStudent(1));

	}


	private static void log(StudentObject stubObject){
		System.out.println(
			"StudentObject = " + stubObject.getId() 
			+ " : \"" + stubObject.getName()
			+ " : \"" + stubObject.getScore()
			+ "\"");
	}

}
