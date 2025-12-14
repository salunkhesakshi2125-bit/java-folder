class Demo14{
			public static void main(String[]args){
				int n=101;
				int rev=0;
				while(n>0){
					 int rem=n%10;
					rev=rev*10+rem;
					n=n/10;
				}
				if(rev==n){
					System.out.println("num is palindrome");
				}else{
					System.out.println("not palindrom");
				}
			}
}