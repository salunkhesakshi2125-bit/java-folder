class Demo{
				public static void main(String [] args){
					Codex c = new Codex("Sakshi","Satara");
					Codex c1 = new Codex("Arpita","Karad");
				
					System.out.println("name is : "+c.name+" address is : "+c.add);
					System.out.println("name is : "+c1.name+" address is : "+c1.add);

					System.out.println("----------------------------------------------");
					System.out.println("After some time address is changed :");

					c.setAdd("pune");
					c1.setAdd("mumbai");
		
					System.out.println("name is : "+c.name+" address is : "+c.add);
					System.out.println("name is : "+c1.name+" address is : "+c1.add);

				}
}
class Codex{
				String name;
				String add;
				
				Codex(String name,String add){
					this.name = name;
					this.add = add;
				}
				
				//setter method for update values 
				void setAdd(String add){
					this.add = add;
				}
}

/*
o/p-
name :Sakshi address :Satara
name :Arpita address :Karad
----------------------------------------------
After some time address is changed :
name :Sakshi address :pune
name :Arpita address :mumbai
*/


