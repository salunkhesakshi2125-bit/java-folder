class Demo{
			public static void  main(String [] args){
				Codex c = new Codex();
				c.fun();
				c.fun(12);
			}
}
class Codex{
		void fun(){
			System.out.println("in fun with no para");

		}
		void fun(int a){
			System.out.println("in fun with para");
		}
}

/*
o/p-
in fun with no para
in fun with para 
*/
