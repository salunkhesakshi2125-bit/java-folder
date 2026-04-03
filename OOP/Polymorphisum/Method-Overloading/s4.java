class Demo{
			public static void  main(String [] args){
				Codex c = new Codex();
				c.fun(12);
			}
}
class Codex{
		void fun(int a){
			System.out.println("in fun with no para");

		}
		void fun(int a){
			System.out.println("in fun with para");
		}
}

/*
o/p-
error: method fun(int) is already defined in class Codex
                void fun(int a){
*/
