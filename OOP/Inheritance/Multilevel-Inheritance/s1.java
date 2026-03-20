// multilevel inheritance
class Demo{
			public static void main(String [] args){
				Manager m = new Manager("sakshi",24,"SD");
				System.out.println("name :"+m.getName()+"  emp-id :"+m.getId()+"  department:"+m.getDept());
			}
}
class Company {
	String name;
	Company(String name){
		this.name = name;
	}
	String getName(){
		return name;
	}
}
class Employee extends Company{
	int id;
	Employee (String name, int id){
		super(name);
		this.id = id;
	}
	int getId(){
		return id;
	}
}
class Manager extends Employee{
	String dept;
	Manager(String name,int id, String dept){
		super(name, id);
		this.dept = dept;
	}
	String getDept(){
		return dept;
	}
}

/*
o/p-
name :sakshi  emp-id :24  department:SD
*/



