class LeapYear {
    public static void main(String[] args) {
		int year =1900,end=2000;
		while(year<=end){
			if((year%100!=0 && year % 4 ==0) || year%400==0) 
				System.out.println(year + " is leap year");
			year++;
		}
	}
}