class Demo{
				public static void main(String [] args){
					Codex c = new Codex("Sakshi","Satara");
					Codex c1 = new Codex("Arpita","Karad");
					c.display();
					c1.display();

					System.out.println("----------------------------------------------");
					System.out.println("After some time address is changed :");
					c.setAdd("pune");
					c1.setAdd("mumbai");

					c.display();
					c1.display();
				}
}
class Codex{
				String name;
				String add;
			
				Codex(String name, String add){
					this.name = name;
					this.add = add;
				}

				//setter or mutator method for update value
				void setAdd(String add){
					this.add = add;
				}


				void display(){
					System.out.println("name :"+name+" address :"+add);
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