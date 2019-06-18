
public class Randomdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=(int)(Math.random()*10);//bydefault the rendom is double type
			int b=(int)(Math.random()*10);
			System.out.printf("a %d b %d",a,b);
			int res=(a>b)?a:b;
			System.out.println("\n"+res);
	}

}
