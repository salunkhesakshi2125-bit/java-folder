// single inheritance (one parent and one child)
class Demo{
			public static void main(String [] args){
				Employee e = new Employee("sakshi","satara",24);
				System.out.println("name:"+e.getName()+" address:"+e.getAdd()+" emp-id:"+e.getId());
			}
}
class Company{
		String name;
		String add;
		
		Company (String name, String add){
			this.name = name;
			this.add = add;
		}

		String getName(){
			return name;
		}
	
		String getAdd(){
			return add;
		}
}
class Employee extends Company{
		int id;
		
		Employee(String name,String add,int id){
			super(name,add);
			this.id = id;
		}
		
		int getId(){
			return id;
		}
}

/*
o/p-
name:sakshi address:satara emp-id:24
*/




