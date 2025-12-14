class Demo11{
			public static void main (String [] args){
				int n= 123;
				int rev= 0;
				while(n>0){
					int rem=n%10;
					rev =rev*10+rem;
					n=n/10;
				}
				System.out.println(rev);
				while(rev>0){
					int rev_rem=rev%10;
					System.out.println(rev_rem);
					rev=rev/10;
				}
			}

}