class Demo7{
				public static void main(String [] args){
					System.out.println("in main");
				}
				static {
					System.out.println("in static block1");
				}
				static {
					System.out.println("in static block2");
				}
}


/*
o/p-
in static block1
in static block1
in main
*/