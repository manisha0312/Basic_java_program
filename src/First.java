
public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='a';
		System.out.println(ch);
		ch++;
		System.out.println(ch);
		 ch=65;
		 System.out.println(ch);
			ch++;
			System.out.println(ch);
	//	ch='88'; we can not declare the ch like this
			ch='9';
		 System.out.println(ch);
			ch++;
			System.out.println(ch);
		int a=44;
		long l=a;// we can store like this  but reverse gives the error
		System.out.println(l);
//		long l=90;
//		int b=l; not  possible
		float f=70.0f;
//		int a=f can not do this 
		int c=(int)f;
		System.out.println(c);
		int i=65;
		char cha=(char)i;// we have to convert i into char
		System.out.println(cha);
		byte bc=10;
		bc=(byte)(bc+2);// when we perform any task on in byte and sort it become integer so we have to type cast it 
		System.out.println(bc);
		

	}

}



















