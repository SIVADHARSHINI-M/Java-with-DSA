class Encaps{
	public static void main(String[] args){
		String s="Name";
		en e=new en();
		e.setname(s);
		System.out.println(e.getname());
	}
}
class en extends Encaps{
	private String str;
	void setname(String s){
		str=s;
	}
	String getname(){
		return str;
	}
}