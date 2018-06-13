
public class Monkey extends Animal{

	void Eat()
	{
		System.out.println("Monkey Eat");
	}
	public static void main(String[] args) {
		
		Animal A=new Monkey();
		A.Eat();
		A.Speak();
		Monkey M=new Monkey();
		M.Eat();
		M.Speak();
	}

}
