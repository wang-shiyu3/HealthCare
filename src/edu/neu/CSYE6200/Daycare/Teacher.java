package edu.neu.CSYE6200.Daycare;

public class Teacher extends AbstractPerson {
	// public Classroom classroom;
	public int classroom_ID;

	public Teacher(int ID, String fname, String lname, int classroom_ID) {
		this.ID = ID;
		this.fname = fname;
		this.lname = lname;
		this.classroom_ID = classroom_ID;
	}
}
