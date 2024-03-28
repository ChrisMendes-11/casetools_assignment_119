package seven;

public class Dog_119 {
	String name,breed;
	Dog_119(String name, String breed)
	{
		this.name=name;
		this.breed=breed;
	}
	String display_name()
	{
		return name;
	}
	String display_breed()
	{
		return breed;
	}
	public void setvalues(String name,String breed)
	{
		this.name=name;
		this.breed=breed;
	}
	public void display()
	{
		System.out.println("Name:"+name+" Breed:"+breed);
	}
}

class Dog_main {
	public static void main(String[] args) {
		Dog_119 d1=new Dog_119("Tyson","German Shepherd");
		Dog_119 d2=new Dog_119("Pepsi","Labrador Retriever");
		d1.display();
		d2.display();
		d1.setvalues("Bingo","BullDog");
		d1.display();
	}

}
