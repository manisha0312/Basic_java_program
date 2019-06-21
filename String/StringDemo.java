
public class StringDemo {
public static void main(String args[]) {
	char ch[]= {'a','b','c'};
	String str=new String(ch);
	System.out.println(str);
	str=new String(ch,1,2);// obj is created only once but refer to the different things
	System.out.println(str);
	byte b[]= {97,98,99};
	str=new String(b,1,2);
	System.out.println(str);
}
}
