class Demo{
			public static void main(String [] args){
				Teacher t =  new Teacher ("Priyanka ","satara",5000,909879);
				Teacher t2 =  new Teacher ("shubhangi ","pune",7000,569849);
				
				Student s = new Student("sakshi","pusegoan",569428,55);
				Student s1 = new Student("arpita","koregoan",569428,55);

				System.out.println("Teachers :");
				System.out.println("name: "+t.getName()+" add:"+t.getAdd()+ " sal:"+t.getSal()+" mob:"+t.getMob());
				System.out.println("name: "+t2.getName()+" add:"+t2.getAdd()+ " sal:"+t2.getSal()+" mob:"+t2.getMob());

				System.out.println("------------------------------------");
				System.out.println("Students :");
				System.out.println("name: "+s.getName()+" add:"+s.getAdd()+ " mark:"+s.getMark()+" mob:"+s.getMob());
				System.out.println("name: "+s1.getName()+" add:"+s1.getAdd()+ " mark:"+s1.getMark()+" mob:"+s1.getMob());

			}	
}
class Teacher{
		String name;
		String add;
		int sal;
		int mobNo;
		
		Teacher(String name, String add, int sal, int mobNo){
			this.name = name;
			this.add = add;
			this.sal = sal;
			this.mobNo = mobNo;
		}

		String getName(){
			return name;
		}
		String getAdd(){
			return add;
		}
		int getSal(){
			return sal;
		}
		int getMob(){
			return mobNo;
		}
}
class Student{
		String name;
		String add;
		int mobNo;
		int mark;
		
		Student(String name, String add, int mobNo, int mark){
			this.name = name;
			this.add = add;
			this.mobNo = mobNo;
			this.mark = mark;
		}

		String getName(){
			return name;
		}
		String getAdd(){
			return add;
		}
		int getMob(){
			return mobNo;
		}
		int getMark(){
			return mark;
		}

}

/*
o/p-
Teachers :
name: Priyanka  add:satara sal:5000 mob:909879
name: shubhangi  add:pune sal:7000 mob:569849
------------------------------------
Students :
name: sakshi add:pusegoan mark:55 mob:569428
name: arpita add:koregoan mark:55 mob:569428
*/	








