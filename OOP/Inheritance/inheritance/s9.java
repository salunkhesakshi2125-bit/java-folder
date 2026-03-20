class Demo{
			public static void main(String [] args){		
				Employee e = new Employee();
				Company c = new Company();
			}
}
class Company{
			Company(){
				super();
				System.out.println("in comp constr");
			}
}
class Employee extends Company{
			Employee(){
				super();
				System.out.println("in emp contr");
			}
}

/*
o/p-
in comp contr
in emp constr
*/