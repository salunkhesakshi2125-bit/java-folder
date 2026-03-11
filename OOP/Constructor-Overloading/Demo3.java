class Demo3{
					public static void main(String [] args){
							Employee3 e1 = new Employee3();
							Employee3 e2 = new Employee3("sakshi",50000);	
							e2.display();
							System.out.println("----------------------");

							e1.display();
							System.out.println("----------------------");

							System.out.println("After some time e1 is modified :");
							e1.name="sai";
							e1.sal=60000;
							e1.display();

					}
		
}
class Employee3{
					String name ;
					int sal;
				
					Employee3(){
						
					}
					Employee3(String s,int b){
						name=s;
						sal=b;
					}
					void display(){
						System.out.println("name is :"+name);
						System.out.println("salary is :"+sal);
					}
}


/*

o/p-

name is :sakshi
salary is :50000
----------------------
name is :null
salary is :0
----------------------
After some time e1 is modified :
name is :sai
salary is :60000

*/