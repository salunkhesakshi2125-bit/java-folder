class Demo{
			public static void main(String [] args){
				Teacher t =  new Teacher("priyanka","satara",98765,5000);
				Teacher t1 =  new Teacher("shubhangi","pune",54765,7000);
				Student s = new Student("sakshi","pusegoan",569428,55);
				Student s1 = new Student("arpita","koregoan",569428,55);

				System.out.println("Teachers :");
				System.out.println("name: "+t.getName()+" add:"+t.getAdd());
				System.out.println("name: "+t1.getName()+" add:"+t1.getAdd());

				System.out.println("------------------------------------");
				System.out.println("Students :");
				System.out.println("name: "+s.getName()+" add:"+s.getAdd()+ " mark:"+s.getMark());
				System.out.println("name: "+s1.getName()+" add:"+s1.getAdd()+ " mark:"+s1.getMark());
			}
}
class Teacher{
		String name;
		String add;
		int mob;
		int sal;
		
		Teacher(String name, String add, int mob, int sal){	
			this.name = name;
			this.add = add;
			this.mob = mob;
			this.sal = sal;
		}
		
		String getName(){
			return name;
		}
		String getAdd(){
			return add;
		}
}
class Student extends Teacher{
		int mark;
		Student(String name, String add, int mob ,int mark){
			super(name,add,mob,0);
			this.mark = mark;
		}
		int getMark(){
			return mark;
		}
}

/*
o/p-
Teachers :
name: priyanka add:satara
name: shubhangi add:pune
------------------------------------
Students :
name: sakshi add:pusegoan mark:55
name: arpita add:koregoan mark:55
*/









