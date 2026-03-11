class Demo10{
				public static void main(String [] args){
					Codex10 c1 = new Codex10(55);
				}
}
class Codex10{
			Codex10(){
				System.out.println("in no para constructor");
			}
			Codex10(int a){
				// it call the no para constructor 
				this();
				System.out.println("in  para constructor");
			}
}


/*

o/p-
in no para constructor
in  para constructor

*/