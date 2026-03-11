class Demo{
				public static void main(String [] args){
					Student s =  new Student ();
					Address a =  new Address();
					s.display(s);
				}
}

class Address{
				String add = "satara";
}

class Student{
				String name = "Sakshi";	
	
				void display(String a){
					System.out.println("name :"+name);	
				}
}


/*
o/p-
 error: incompatible types: Student cannot be converted to String
                                        s.display(s);
*/




















































