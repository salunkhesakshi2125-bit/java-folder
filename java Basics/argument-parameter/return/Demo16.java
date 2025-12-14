class Demo16{
			public static void main(String []args){
				int sum=Demo16.fun(1,2);
				System.out.println(sum);
				int a =Demo16.fun(10,20);
				System.out.println(a);
			}
			static int fun(int a, int b){
				int c=a+b;
				return c;
			}
}