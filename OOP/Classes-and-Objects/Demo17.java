class Demo17{
				public static void main(String [] args){
					codex17  c1 = new  codex17();
					c1.name = "Girish";
					c1.company = "Delval";
					c1.address = "Shirwal";
					c1.salary = 50000;
					c1.display();
					
					System.out.println("-----------------------------------------------");

					codex17  c2 =new  codex17();
					c2.name = "Sakshi";
					c2.company = "Acme";
					c2.address = " Satara";
					c2.salary = 40000;
					c2.display();
				}
}
class codex17{
				String name;
				String company;
				String address;
				int salary;

				void display(){
					System.out.println("Name is : "+name);
					System.out.println("Company is : "+company);
					System.out.println("Address is : "+address);
					System.out.println("Salary is : "+salary);
				}
}