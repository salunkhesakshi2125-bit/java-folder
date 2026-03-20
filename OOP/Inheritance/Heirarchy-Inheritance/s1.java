//Hierarchical Inheritance
class Demo{
			public static void main(String [] args){
				Student s = new Student ("Sakshi salunkhe",55);
				Teacher t = new Teacher("Priyanka salunkhe",70000);
				
				System.out.println("Student :");
				System.out.println("name:"+s.getName()+" mark:"+s.getMark());
				System.out.println("---------------------------------");
				System.out.println("Teacher :");
				System.out.println("name:"+t.getName()+" salary:"+t.getSal());
			}
}
class College{
		String name;
		College(String name){
			this.name = name;
		}
		String getName(){
			return name;
		}
}
class Teacher extends College{
		int sal;
		Teacher(String name,int sal){
			super(name);
			this.sal = sal;
		}
		int getSal(){
			return sal;
		}
}
class Student extends College{
		int mark;
		Student(String name,int mark){   
			super(name);
			this.mark = mark;
		}
		int getMark(){
			return mark;
		}
}
		
/*
o/p-
Student :
name:Sakshi salunkhe mark:55
---------------------------------
Teacher :
name:Priyanka salunkhe salary:70000
*/





