import java.util.Stack;

public class postfix {
    
    public static void main(String[] args) {
        Stack<Integer> ch=new Stack<>();
        String s="23*45*+9-";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                ch.push(c-'0');
            }
            else{
                int sum=ch.pop();
                if(c=='+'){
                    ch.push(ch.pop()+sum);
                }
                else if(c=='-'){
                    ch.push(ch.pop()-sum);
                }
                else if(c=='*'){
                    ch.push(ch.pop()*sum);
                }
                else if(c=='/'){
                    ch.push(ch.pop()/sum);
                }
            }
        }
        System.out.print(ch.pop());
    }
}
