class PerfectSquare {
    public static void main(String[] args) {
		int num=1,end=10000,sqr=0,sqr2=0;
		while(num<=end){
			sqr=(int)Math.sqrt(num);
			sqr2=sqr*sqr;
			if(sqr2==num)
				System.out.println(num + " is Perfect Square");
			num++;
		}
	}
}