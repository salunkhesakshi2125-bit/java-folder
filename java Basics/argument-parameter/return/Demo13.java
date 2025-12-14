class Demo13{
			public static void main (String []args){
				int sum=Demo13.fun(12,12);
				System.out.println(sum);
			}
			static int fun(int a, int b){
				System.out.println("in fun");
				int c=a+b;
				return c;
			}
}