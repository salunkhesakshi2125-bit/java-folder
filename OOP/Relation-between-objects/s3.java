class Demo{
				public static void main(String [] args){
					Address obj = new Address("Satara city");
					Student s = new Student("Sakshi ");
					s.display(obj);

					System.out.println("-------------------------");
					Address obj1 =  new Address("Pune city");
					Student s1= new Student("Arpita");
					s1.display(obj1);
				}

}
class Address{
		String add;
		
		Address( String add){
			this.add =  add;
		}
}

class Student{
		String name;
	
		Student(String name){
			this.name = name;
		}
		
		void display(Address obj){
			System.out.println("name is : "+name);
			System.out.println("address is : "+obj.add);

		}
}

/*
o/p-
name is : Sakshi
address is : Satara city
-------------------------
name is : Arpita
address is : Pune city
*/