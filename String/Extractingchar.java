  
public class Extractingchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Sharma family";
		System.out.println(str.charAt(5));
		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 10));
		// converting the string into the char
		char ch[]=str.toCharArray();
		for(char ch1:ch) {
			System.out.println(ch1);
		}
		//converting the String into the bytes
		byte b[]=str.getBytes();
		for(byte b1:b) {
			System.out.println(b1);
		}
		//extracting char array
		char[] target=new char[10];
		str.getChars(5, 10, target, 1);
		for(char t:target) {
			System.out.println(t);
		}

	}

}
