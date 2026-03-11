class Demo8{
				public static void main(String [] args){
					Codex obj=new Codex();
					obj.fun();
					Codex obj1=new Codex();
					obj1.fun();
				}
}
class Codex{
			int a=18;
			void fun(){
				System.out.println("in fun : "+a);
			}
}