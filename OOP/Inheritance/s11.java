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
				System.out.println("in emp contr");
				super();
			}
}

/*
o/p-error: call to super must be first statement in constructor
                                super();
*/