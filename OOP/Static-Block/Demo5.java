class Demo5{
				public static void main(String [] args){
					System.out.println("in main : "+a);
				}
				static int a;
				static{
					a=21;
					System.out.println("in static ");
				}
}


/*

o/p-

in static
in main : 21

*/