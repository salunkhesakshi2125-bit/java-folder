class Demo{
			public static void main(String [] args){
				Manager m =  new Manager("Girish",50000,"leading");
				Developer d = new Developer("Sakshi", 50000,"software");
				Fd f = new Fd("Ravi",40000,"software","HTML");
				Bd b = new Bd("Diksha",45000,"software","database");

				System.out.println("Manager :");
				System.out.println("Name:"+m.getName()+" Salary:"+m.getSal()+" Lead:"+m.getLeadership());
				System.out.println("-----------------------------------------------");

				System.out.println("Developer :");
				System.out.println("Name:"+d.getName()+" Salary:"+d.getSal()+" Develop:"+d.getDevelop());
				System.out.println("-----------------------------------------------");

				System.out.println("Frontend Developer :");
				System.out.println("Name:"+f.getName()+" Salary:"+f.getSal()+" Develop:"+f.getDevelop()+" Frontend:"+f.getFrontend());
				System.out.println("-----------------------------------------------");

				System.out.println("Backend Developer :");
				System.out.println("Name:"+b.getName()+" Salary:"+b.getSal()+" Develop:"+b.getDevelop()+" Backend:"+b.getBackend());
				System.out.println("-----------------------------------------------");

			}
}
class Employee{
		String name;
		int sal;
			
		Employee(String name, int sal){
			this.name = name;
			this.sal = sal;
		}

		String getName(){
			return name;
		}
		int getSal(){
			return sal;
		}

}
class Manager extends Employee{
		String leadership;

		Manager(String name, int sal, String leadership){
			super(name, sal);
			this.leadership = leadership;
		}

		String getLeadership(){
			return leadership;
		}
}

class Developer extends Employee{
		String develop;
		
		Developer(String name,int sal, String develop){
			super(name, sal);
			this.develop = develop;
		}
		
		String getDevelop(){
			return develop;
		}

}

class Fd extends Developer{
		String frontend;

		Fd(String name, int sal, String develop, String frontend){
			super(name , sal , develop);
			this.frontend = frontend;
		}
		
		String getFrontend(){
			return frontend;
		}

}

class Bd extends Developer{
		String backend;
		
		Bd(String name,int sal, String develop, String backend){
			super(name, sal , develop);
			this. backend = backend;
		}
		
		String getBackend(){
			return backend;
		}
}

/*
o/p-
Manager :
Name:Girish Salary:50000 Lead:leading
-----------------------------------------------
Developer :
Name:Sakshi Salary:50000 Develop:software
-----------------------------------------------
Frontend Developer :
Name:Ravi Salary:40000 Develop:software Frontend:HTML
-----------------------------------------------
Backend Developer :
Name:Diksha Salary:45000 Develop:software Backend:database
-----------------------------------------------
*/



