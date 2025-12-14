class Demo14{
			public static void main(String []args){
				int sum=Demo14.fun(12,13);
				System.out.println(sum);
			}
			static int fun(int a, int b){
				int c=a+b;
				return c;
				System.out.println("in fun");
			}
}