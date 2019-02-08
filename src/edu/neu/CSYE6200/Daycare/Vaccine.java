package edu.neu.CSYE6200.Daycare;

public class Vaccine {
	public int ID;
	public String vaccine_name;
	public int inocalate_age;
	public Boolean inocalate_status;

	public Vaccine(int ID, String name, int age, Boolean status) {
		this.ID = ID;
		this.vaccine_name = name;
		this.inocalate_age = age;
		this.inocalate_status = status;
	}
}
