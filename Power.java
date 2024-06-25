import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int m=sc.nextInt(); 
	int n=sc.nextInt();
	int tot=m;
	for(int i=1;i<n;i++)
		tot*=m;
	System.out.println(tot);
	}
}