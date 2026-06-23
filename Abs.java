abstract class animal{
	int id;
	animal(int id){
		this.id=id;
	}
	abstract void display();
}
class behave extends animal{
	behave(int id){
		super(id);
	}
	void display(){
		System.out.println("Animal is running");
	}
}
class Abs{
	public static void main(String[] args){
		int id=50;
		behave b=new behave(id);
		b.display();
	}
}

