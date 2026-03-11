class Demo6{
				public static void main(String [] args){
					Codex6  c1 =  new Codex6 ();
					c1.name= "Girish Jagadale";
					c1.salary= 35000;
					c1.display();
					System.out.println("---------------------------");
			
					Codex6 c2 =  new Codex6 ();
					c2.name= "Adesh Kadam";
					c2.salary= 35000;
					c2.display();
					System.out.println("---------------------------");



				}
}	
class Codex6{
				String name;
				int salary;
				
				void display(){
					System.out.println("name is :"+name);
					System.out.println("salary is :"+salary);
				}
}