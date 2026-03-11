class Demo9{
				public static void main(String [] args){	
					System.out.println("in main");		
					Codex9 c1 = new Codex9();
				}
}
class Codex9{
				static {
					System.out.println("in static ");
				}
				
				Codex9(){
					System.out.println("in constructor");
				}

}



/*
o/p-
in main
in static
in constructor
*/