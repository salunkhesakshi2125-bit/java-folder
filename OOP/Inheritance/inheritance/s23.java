class Demo{
			public static void main(String [] args){
				Address a = new Address(415,"satara");
				Address a1 = new Address(520,"solapur");

				Student s = new Student ("sakshi",95732,55,a);
				Student s1 = new Student ("sarvesh",97283,35,a1);

				System.out.println("Students :");
				System.out.println("name:"+s.getName()+" mob.no :"+s.getMob()+" marks:"+s.getMark()+
				" address:"+s.getAdd().getDist());
				System.out.println("name:"+s1.getName()+" mob.no :"+s1.getMob()+
				" marks:"+s1.getMark()+" address:"+s1.getAdd().getDist());

			}
}
class Person{
		String name;
		int mob;
		
		Person(String name,int mob){
			this.name = name;
			this. mob = mob;
		}
		
		String getName(){
			return name;
		}
		int getMob(){
			return mob;
		}
}
class Student extends Person{
		int mark;
		Address add;

		Student(String name, int mob,int mark,Address add){
			super(name ,mob);
			this.mark = mark;
			this.add = add;
		}
		
		int getMark(){
			return mark;
		}
		Address getAdd(){
			return add;
		}
	
}
class Address{
		int pin;
		String dist;
		
		Address(int pin,String dist){
			this.pin = pin;
			this.dist = dist;
		}
		
		String getDist(){
			return dist;
		}
}

/*
o/p-
Students :
name:sakshi mob.no :95732 marks:55 address:satara
name:sarvesh mob.no :97283 marks:35 address:solapur
*/		




