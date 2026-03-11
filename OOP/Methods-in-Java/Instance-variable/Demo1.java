class Demo1{
				public static void main(String [] args){
					Codex1 c1 = new Codex1();
					c1.fun();
				}
}
class Codex1{
			//instance variable
			int a=19;
			void fun(){
				System.out.println("in fun :"+a);
			}
}