class Demo3{
			public static void main(String [] args ){
				//instance variable
				int a=9;
				System.out.println(a);
				Demo3.fun();
			}
			static void fun(){
				//static variable
				int b=8;
				System.out.println(b);
			}
}