import java.util.Scanner;
class CommonFactor {
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int n1=sc.nextInt();
	int i=2,temp=0,min=0;
	if(n<n1)
		min=n;
	else
		min=n1;	
	while(i<=n){
		if(n%i==0&&n1%i==0){
			System.out.println("Common Factors are "+i);
			temp=i;
			break;
			}
		i++;
		}
	System.out.println("Highest Common Factor of " + n+ " and "+n1+" is " + temp);
		
	}
}