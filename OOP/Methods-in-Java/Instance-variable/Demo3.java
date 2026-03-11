class Demo3{
					public static void main(String [] args){
						Codex3 c1 = new Codex3();
						c1.fun();
						Codex3.gun(c1);	
					}
}
class Codex3{
					int a=10;
					void fun(){
						System.out.println("in fun :"+a);
					}
		
					static void gun(Codex3 b){
						System.out.println("in gun :"+b.a);
					}
}


/*

o/p-
in fun :10
in gun :10

*/
					