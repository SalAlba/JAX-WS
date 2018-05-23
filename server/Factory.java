package server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.*;

@WebService
public class Factory {

	// ...
	private static int num = 0;
	private List<StudentObject> studentList = new ArrayList<StudentObject>();
	private List<String> list = new ArrayList<String>();

	// ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ...
	// ...
	@WebMethod
	public StudentObject createStudentObject(int id, String name, double score) {
		log("SEVER CREATE STUDENT");		
		return new StudentObject(id, name, score);
	}

	// ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ...
	// Work one string list ...
	public List<String> getStringList() {
		log("SEVER GET STRING LIST");
		return list;
	}

	public String getOneString(int index) {
		log("SEVER GET ONE STRING");
		return list.get(index);
	}
	
	public void addString(String str) {
		log("SEVER ADD STRING");
		list.add(str);
	}
	
	public void removeString(int index) {
		log("SEVER REMOVE STRING");
		list.remove(index);
	}
	
	public void updateString(int index, String str) {
		log("SEVER UPDATE STRING");
		list.set(index, str);		
	}

	// ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ...
	// Work one student list ...
	public List<StudentObject> getStudentList() {
		log("SEVER GET STUDENTS LIST");
		return studentList;
	}

	public StudentObject getOneStudent(int index) {
		log("SEVER GET ONE STUDENT");
		return studentList.get(index);
	}
	
	public void addStudent(int id, String name, double score) {
		log("SEVER ADD STUDENT");
		studentList.add(createStudentObject(id, name, score));
	}
	
	public void removeStudent(int index) {
		log("SEVER REMOVE STUDENT");
		studentList.remove(index);
	}
	
	public void updateStudent(int index, int id, String name, double score) {
		log("SEVER UPDATE STUDENT");
		studentList.set(index, createStudentObject(id, name, score));		
	}

	// ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ...
	// LOG ...
	private void log(String txt){
		num++;
		System.out.println(num + " )" +"LOG : "+ txt);	
	}
}
