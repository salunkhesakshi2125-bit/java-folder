class Demo{
			public static void main(String [] args){
				Department it = new Department("cse","ganesh dangat");
				Teacher t = new Teacher ("Priyanka Salunkhe ",null);
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
		String dept;

		Teacher(String name, String dept){
			this.name = name;
			this.dept = dept;
		}
}

/*
o/p-
teacher name:Priyanka Salunkhe
department name:null
*/


