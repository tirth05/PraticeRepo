package WebApp.Web;

/**
 * Hello world!
 *
 */
public class App 
{   
	//String name;
	public App() {
		
	}
	
	public void sayHi(String name) {
		System.out.println("Hi "+name+"! Have a good day!");
	}
	
	public void triangle90() {
		int n=10;
		System.out.println("\nHere is a right angled triangle\n\n\\");
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++)
				System.out.print(j+"\t");
			System.out.println("\\");
		}
		for(int i=0;i<=90;i++) {
			System.out.print("-");
		}
		
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App a=new App();
        a.sayHi("Tirth Joshi");
        a.triangle90();
    }
}
