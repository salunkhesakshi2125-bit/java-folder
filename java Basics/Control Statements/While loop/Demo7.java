class Demo7{
			public static void main (String args [] ){
				int count=0;
				int n=12345;
				while(n>0){
					count++;
					n=n/10;
				}
				System.out.println(count);
			}
}