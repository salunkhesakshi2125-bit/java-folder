class Demo{
			public static void main(String [] args){
				Employee e = new Employee("sakshi","Acme",3000,"marketing");
				System.out.println("name is :"+e.getName() +"  company name :"+e.compName() +"  salary is :"+e.getSal() + "  department :"+e.getDept() );

			}
}
class Employee{
		String name;
		String compName;
		int sal;
		String dept;
		
		Employee(String name,	 String compName, int sal, String dept){
			this.name = name;
			this.compName = compName;
			this.sal = sal;
			this.dept = dept;
		}
		
		//getter method 
		String getName(){
			return name;
		}

		String compName(){
			return compName;
		}

		int getSal(){
			return sal;
		}
		String getDept(){
			return dept;
		}

}
	

/*
o/p-
name is :sakshi  company name :Acme  salary is :3000  department :marketing
*/


