class Demo1{
				public static void main(String [] args){
					Codex1 c1 = new Codex1();
					Codex1 c2 = new Codex1();
					System.out.println(c1);
					System.out.println(c2);
					c1.fun();
					c2.fun();
				}
}
class Codex1{

			int a=32;
			void fun(){
				System.out.println(this+"   var :"+a);
			}
}

/*
o/p-
Codex1@2f92e0f4
Codex1@28a418fc
Codex1@2f92e0f4   var :32
Codex1@28a418fc   var :32
*/