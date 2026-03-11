class Demo{
				public static void main(String [] args ){	
					Codex c = new Codex ("Arpita","koregoan");
					Codex c1 = new Codex ("Sakshi","visapur");

					System.out.println("name is : "+c.getName()+ " address is : "+c.getAdd());
					System.out.println("name is : "+c1.getName()+ " address is : "+c1.getAdd());

					System.out.println ("--------------------------------------------");
					System.out.println("After some time address is changed :");
					
					c.setAdd("mumbai");
					c1.setAdd("satara");

					System.out.println("name is : "+c.getName()+ " address is : "+c.getAdd());
					System.out.println("name is : "+c1.getName()+ " address is : "+c1.getAdd());

				}
}
class Codex{
				String name;
				String add;
				
					Codex(String name, String add){
						this.name = name;
						this.add = add;
					}
		
					//setter method for the updating values
					void setAdd(String add){
						this.add = add;
					}

					// getter method 
					String getAdd(){
						return add;
					}

					String getName(){
						return name;
					}


}

/*
o/p-
name is : Arpita address is : koregoan
name is : Sakshi address is : visapur
--------------------------------------------
After some time address is changed :
name is : Arpita address is : mumbai
name is : Sakshi address is : satara
*/