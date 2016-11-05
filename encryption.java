import java.util.Scanner;
public class encryption {

	public encryption() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		System.out.println("name of user is "+name);
		System.out.println("Enter the name of user");
		
		Scanner input= new Scanner(System.in);
		name= input.next();
		
		System.out.println("name of user is "+name);
		
		Convertor(name);
		System.out.println("name of user is "+name);

	}
	static int Convertor(String l){
		int sum=1;
		System.out.println("name of user is "+name);
		
		for(int i=0;i<l.length();i++)
		{
			sum= sum*1+20;
			
			
		}
		return sum;
	}

}
