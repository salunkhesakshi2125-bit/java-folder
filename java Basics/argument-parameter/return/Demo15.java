class Demo15{
				public static void main(String [] args){
					int sum= Demo15.fun(10,12);
					System.out.println(sum);
					int a= Demo15.fun();
				}
				static int fun(int a,int b){
					int c=a+b;
					return c;
				}
}