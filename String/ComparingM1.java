
public class ComparingM1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str=new String("Rat");
			String str2=new String("Rat");
			String s1="rat";
			String s2="rat";
			//== use for memory allocation
			System.out.println(s1==s2);
			System.out.println(str==str2);
			System.out.println(s1==str2);
			// equals method check the value
			System.out.println(s2.equals(s1));
			System.out.println(s1.equals(str));
			System.out.println(str2.equals(str));
			
			
	}

}
