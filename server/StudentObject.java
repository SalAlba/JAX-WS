package server;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement( name = "StudentObject" )
public class StudentObject  implements Serializable {

	// FIELD...	
	private static final long serialVersionUID = 1L;
	
	@XmlElement
	private int id;

	@XmlElement
	private String name;

	@XmlElement
	private double score;

	
	// CONSTRUCTOR ...
	public StudentObject() {
	}

	public StudentObject(int id, String name, double score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}
	
	// GET/SET ...
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getScore() {
		return score;
	}


	// ...
	@Override
	public String toString() {
		return "<StudentObject>[ "+ id + ", " + name + ", " + score +" ]";
	}
	
}
