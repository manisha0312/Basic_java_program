
public class All {
	public static void main(String args[]) {
		String str="  Suchi Sharma"  ;
		String str2="shobha sharma";
		System.out.println(str.indexOf('S'));
		System.out.println(str.lastIndexOf('S'));
		System.out.println(str.replace("S", "M"));
		System.out.println(str.length());
		System.out.println(str.trim());// to remove the  before and after space
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
	//	System.out.println(str1.copyValueOf(ch));
		int a=8;
		System.out.println(str+a);
		System.out.println(String.valueOf(a));
	//	System.out.println(str+a);
		System.out.println(str.concat("Manisha"));
		System.out.println(str2.split("a"));
		}
}
