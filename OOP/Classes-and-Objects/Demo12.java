class Demo12{
				public static void main(String [] args){
					Codex12 c1=new Codex12();
					c1.fun();
					c1.a=30;
					c1.fun();
				}
}
class Codex12{
				int a;
				void fun(){
					System.out.println("in fun : "+a);
				}
}