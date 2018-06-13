
public class Cat implements Animal {

	public void Speak()
	{
		System.out.println("Cat Speak");
	}
	public void Eat()
	{
		System.out.println("Cat Eat");
	}
	public static void main(String[] args) {
		Cat C=new Cat();
		C.Speak();
		C.Eat();

	}

}
