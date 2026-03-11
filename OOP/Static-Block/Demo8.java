class Demo8{
				public static void main(String [] args){	
					System.out.println("in main");		
					Codex8 c1 = new Codex8();
				}
}
class Codex8{
				static {
					System.out.println("in static ");
				}
}



/*
o/p-
in main
in static
*/