class Demo13{
			public static void main(String[]args){
				int n=5368;
				int max=0;
				int rem=0;
				while(n>0){
					rem= n%10;
					if(rem>max){
						max=rem;
					}
					n=n/10;
				}
				System.out.println(max);		

			}
}