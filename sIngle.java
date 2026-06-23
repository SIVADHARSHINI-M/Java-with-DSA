class parent{
	void display(){
		System.out.println("This is parent class");
	}
}
class child extends parent{
	void display(){
		System.out.println("This is child class");
	}
}
class single{
	public static void main(String[] args){
		parent p=new parent();
		child c=new child();
		c.display();
		p.display();
	}
}
