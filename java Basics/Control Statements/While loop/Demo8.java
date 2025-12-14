class Demo8{
			public static void main(String[] args){
				int n=1234;
				int sum=0;
				int rem=0;
				while(n>0){
					 int rev=n%10;
					sum= sum+rev;
					n=n/10;
				}
				System.out.println(sum);
			}
}