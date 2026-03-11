class Demo{
				public static void main(String [] args){
					Student s =  new Student ();
					Address a =  new Address();
					s.display(a);
				}
}

class Address{
				String add = "satara";
}

class Student{
				String name = "Sakshi";	
				void display(Address s){
					System.out.println("name :"+name);	
					System.out.println("passed address :"+s);
					System.out.println("address is :"+s.add);

				}
}


/*
o/p-
name :Sakshi
passed address :Address@69b794e2
address is :satara
*/