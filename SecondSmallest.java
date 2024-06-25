import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int num=sc.nextInt(),min=9,s_min=9,temp=num,rem=0; 
	while(num>0){
		rem=num%10;
		if(rem<min)
			min=rem;
		num/=10;		
		}
	System.out.println(min);
	num=temp;
	while(num>0){
		rem=num%10;
		if(rem>min){
			if(rem<s_min)
				s_min=rem;
			}
		num=num/10;	
		}
	System.out.println(s_min);
	}
	
}