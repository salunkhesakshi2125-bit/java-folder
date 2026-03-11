class Demo{
			public static void main(String [] args){
				Company c = new Company("Acme","sde");
				Company c1 =  new Company("capg","fsd");

				Employee e = new Employee("sakshi",200,c);
				Employee e1 = new Employee("arpita",300,c1);
		
				System.out.println("name is :"+e.getName() + " salary is:" +e.getSal() +" company is:"+e.getCompany().getCompName());
				System.out.println("name is :"+e1.getName() + " salary is:" +e1.getSal() +" company is:"+e1.getCompany().getCompName());

			}
}
class Company{
		String compName;
		String  dept;

		Company(String compName, String dept){
			this.compName = compName;
			this.dept = dept;
		}

		//getter method
		String getCompName(){
			return compName;
		}

		String getDeptName(){
			return dept;
		}

}

class Employee{
		String name;	
		int sal;
		Company company;
		
		Employee(String name, int sal,Company company  ){
			this.name = name;
			this.sal =  sal ;
			this.company = company;
		}
	
		//getter method
		String getName(){
			return name;
		}
	
		int  getSal(){
			return sal;
		}

		Company getCompany(){
			return company;
		}
		
}

/*
o/p-
name is :sakshi salary is:200 company is:Acme
name is :arpita salary is:300 company is:capg
*/





