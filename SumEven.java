class Even {
    public static void main(String[] args){
		int num=23;
		System.out.println(num);
		while(num>1){
			if(num%2==0){
				num=num/2;
				System.out.printl("Even number"+num);
			}
			else{
				num=3*num+1;
				System.out.println(num);
			}
		}
	}
}
