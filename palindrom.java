import java.util.Stack;

public class palidrom{
    
    public static void main(String[] args) {
        Stack<Character> ch=new Stack<>();
        String s="pqeqp";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            ch.push(c);
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(ch.peek()==c){
                ch.pop();
            }
        }
        
        if(ch.isEmpty()){
            System.out.print("It is Palindrom");
        }
        else{
            System.out.print("It is not Palindrom");
        }
    }
}
