class Demo4{
					public static void main(String [] args){
						Codex4 c1 = new Codex4();
						c1.fun();
						Codex4.gun(c1);	
					}
}
class Codex4{
					int a=10;
					void fun(){
						System.out.println("in fun :"+this.a);
					}
		
					static void gun(Codex4 b){
						System.out.println("in gun :"+b.a);
					}
}


/*

o/p-
in fun :10
in gun :10

*/
		