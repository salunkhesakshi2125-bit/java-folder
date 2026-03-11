class Demo5{
					public static void main(String [] args){
						Codex5 c1 = new Codex5();
						c1.fun();
						Codex5.gun(c1);	
					}
}
class Codex5{
					int a=10;
					void fun(){
						System.out.println("in fun :"+this.a);
						this.a=50;
					}
		
					static void gun(Codex5 b){
						System.out.println("in gun :"+b.a);
					}
}


/*

o/p-
in fun :10
in gun :50s

*/
		