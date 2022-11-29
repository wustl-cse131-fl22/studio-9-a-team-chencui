package studio9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import assignment7.Student;

public class UniversityDatabase {
	//TODO: Complete this class according to the studio instructions
	private final Map<String, Student> stud;
	
	public UniversityDatabase() {
		this.stud = new HashMap<String,Student>();
		
	}
	
	public void addStudent(String accountName, Student student) {
		// TODO
		this.stud.put(accountName,student);
	}

	public int getStudentCount() {
		// TODO
		return this.stud.size();
	}

	public String lookupFullName(String accountName) {
		// TODO: Complete according to studio instructions
		return this.stud.get(accountName).getFullName();
	}

	public double getTotalBearBucks() {
		// TODO
		double o = 0.0;
		for(String name : this.stud.keySet()) {
			o+=stud.get(name).getBearBucksBalance();
		}
		return o;
	}
}
