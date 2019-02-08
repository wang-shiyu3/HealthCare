package edu.neu.CSYE6200.Daycare;

import java.util.Date;

public class Student extends AbstractPerson {
	public int age;
	public Date birthday;
	public String parents_name;
	public int teacher_ID;//int?String

	public Student(int ID,String fname,String lname,int age,Date birthday,String parents_name,int teacher_ID) {
		this.ID=ID;
		this.fname=fname;
		this.lname=lname;
		this.age=age;
		this.birthday=birthday;
		this.parents_name=parents_name;
		this.teacher_ID=teacher_ID;
	}
}
