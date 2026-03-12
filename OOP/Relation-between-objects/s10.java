class Demo{
			public static void main(String [] args){
				Department it = new Department("cse","ganesh dangat");
				Teacher t = new Teacher ("Priyanka Salunkhe ",it);
				System.out.println("teacher name:"+t.name);
				System.out.println("department name:"+t.dept);
			}
}
class  Department{
		String deptName;
		String hodName;

		Department(String deptName, String hodName ){
			this.deptName = deptName;
			this.hodName = hodName;
		}
}
class Teacher{
		String name;
		Department dept;

		Teacher(String name, Department dept){
			this.name = name;
			this.dept = dept;
		}
}

/*
o/p-
teacher name:Priyanka Salunkhe
department name:Department@564718df
*/


