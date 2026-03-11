class Demo{
				public static void main(String [] args){
					Codex c = new Codex("Sakshi","Satara");
					Codex c1 = new Codex("Arpita","Karad");
					c.display();
					c1.display();

					System.out.println("After some time Address is changed : ");
					c.add = "Mumbai";
					c1.add = "pune";
					c.display();
					c1.display();	
				}
}
class Codex{
				String name;
				String add;
				
				Codex(String name,String add){
					this.name=name;
					this.add=add;
				}
					
				void display(){
					System.out.println("name :"+name+" address :"+add);
				}
}

/*
o/p-
name :Sakshi address :Satara
name :Arpita address :Karad
After some time Address is changed :
name :Sakshi address :Mumbai
name :Arpita address :pune
*/