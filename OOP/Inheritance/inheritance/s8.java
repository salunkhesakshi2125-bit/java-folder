class Demo{
			public static void main(String [] args){
				Employee e = new Employee();
			}
}
class Company{
			Company(){
				System.out.println("in company contr");
			}
}
class Employee extends Company{
			Employee(){
				System.out.println("in employee contr");
			}
}

/*
o/p-
in company contr....
in employee contr
*/