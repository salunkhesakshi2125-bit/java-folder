class Demo{
			public static void main(String [] args){
				Employee e = new Employee();
				Company c = new Company();
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
			}
}

/*
company chya object la argument nahi dila
o/p-
  error: constructor Company in class Company cannot be applied to given types;
                                Company c = new Company();
                                            ^
  required: int
  found:    no arguments
  reason: actual and formal argument lists differ in length
*/
				