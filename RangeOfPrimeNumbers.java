import java.util.Scanner;
class CommonFactor {
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n,n1,i=0,c=0,j=0,H=0;
	n=sc.nextInt();
	n1=sc.nextInt();
	for(i=n;i<=n1;i++){
		c=0;
		for(j=1;j<i;j++){
			if(i%j==0)
				c++;
			}
			if(c==1){
				System.out.println("Prime Number "+i);
				H++;
			}
		}
	System.out.println("Total Prime Number in between "+n+" and "+n1+" is "+H);

	}
}