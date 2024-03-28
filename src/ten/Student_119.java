package ten;

public class Student_119 {
	String name,address;
	int age;
	Student_119(){
		age=0;
		name="Unknown";
		address="Not Available";
	}
	public void setInfo(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void setInfo(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public void display()
	{
		System.out.println("Name:"+name+" Age:"+age+" Address:"+address);
	}
}

class Student_Main {
	public static void main(String[] args) {
	Student_119[] arr = new Student_119[2];
	arr[0]=new Student_119();
	arr[1]=new Student_119();
	arr[0].setInfo("Chris",19);
	arr[1].setInfo("Shania", 19,"Margao");
	arr[0].display();
	arr[1].display();
}

}
