class Demo6{
				public static void main(String [] args){
					Employee6 e1 = new  Employee6("Sakshi","Acme",30000);
					Employee6 e2 = new  Employee6("Arpita","Tcs",50000);
						
					e1.display();
					System.out.println("----------------------------------");
					e2.display();
				}
	
}
class Employee6{
					String name;
					String company;
					int salary;
				
					Employee6(String n, String c, int s){
						name=n;
						company=c;
						salary=s;
					}
		
					void display(){
						System.out.println("name is :"+name);
						System.out.println("company name is :"+company);
						System.out.println("salary is :"+salary);
					}
}


/*

o/p-
name is :Sakshi
company name is :Acme
salary is :30000
----------------------------------
name is :Arpita
company name is :Tcs
salary is :50000

*/