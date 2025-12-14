class Demo9{
			public static void main (String [] args){
				int n =123456;
				int sum = 0;
				int rev = 0;
				while(n>0){
					rev= n%10;
					n=n/10;
					if(rev%2==0){
						sum= sum+rev;
					}
				}
				System.out.println(sum);
			}
}