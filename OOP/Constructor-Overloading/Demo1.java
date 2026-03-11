class Demo1{
					public static void main(String [] args ){
						Employee1 e1 = new Employee1();
						Employee1 e2 = new Employee1("sakshi",35000);
						Employee1 e3 = new Employee1("arpita",40000);

						
					}
}
class Employee1{
					String name;
					int salary;
					
					Employee1(){
						System.out.println("in no para constructor");
					}
					Employee1(String s, int a){
						name = s;
						salary =a;
						System.out.println("in para constructor");
					}
				
				
}

/*

o/p-

in no para constructor
in para constructor
in para constructor

*/