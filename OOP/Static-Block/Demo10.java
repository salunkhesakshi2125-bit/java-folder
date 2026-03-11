class Demo10{
				public static void main(String [] args){	
					System.out.println("in main");		
					Codex10 .fun();
				}
}
class Codex10{
				static void fun(){
					System.out.println("in fun");
				}

				static {
					System.out.println("in static ");
				}
}



/*
o/p-
in main
in static
in fun
*/