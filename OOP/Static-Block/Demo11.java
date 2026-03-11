class Demo11{
				public static void main(String [] args){	
					System.out.println("in main");		
					Codex11 .fun();
				}
}
class Codex11{
				static void fun(){
					System.out.println("in fun");
				}

				static {
					System.out.println("in static1 ");
				}
				static {
					System.out.println("in static2 ");
				}
				static {
					System.out.println("in static3");
				}

}



/*
o/p-
in main
in static1
in static2
in static3
in fun
*/