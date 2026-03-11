class Demo2{
					public static void main(String [] args ){
						Employee2  e1 = new  Employee2();
						Employee2  e2 = new  Employee2("sakshi",40000);
						Employee2  e3 = new  Employee2("Arpita");

					}
}
class Employee2{
					String name;
					int salary;
				
					Employee2(){
						System.out.println("in no para constructor");
					}

					Employee2(String s, int a){
						System.out.println("in 2 para constructor");
					}
					
					Employee2(String name){
						System.out.println("in 1 para constructor");
					}
}


/*

o/p-
in no para constructor
in 2 para constructor
in 1 para constructor

*/