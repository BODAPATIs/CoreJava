class HelloWorld {
    public static void main(String[] args) {
        int a=224,b=30,c=31;
        if(a>b){
            if(a>c){
                System.out.println("a");
            }
            else{
               System.out.println("c"); 
            }
        }
        else if (a>c){
            if(a>b){
                System.out.println("a");
            }
            else {
                System.out.println("b");
            }
        }
        else{
            System.out.println("c");
        }
    }
}