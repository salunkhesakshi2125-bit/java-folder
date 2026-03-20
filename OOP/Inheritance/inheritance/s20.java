class Demo{
			public static void main(String [] args){
				Employee e = new Employee();
			}
}
class Company{
			Company(int a){
				System.out.println("in para company contr");
			}
}
class Employee extends Company{
			Employee(){
				super(12);
				System.out.println("in  employee contr");
			}
}

/*
o/p-
 in para company contr
in  employee contr
*/
				