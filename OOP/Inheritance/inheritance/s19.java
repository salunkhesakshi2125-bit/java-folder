class Demo{
			public static void main(String [] args){
		
			}
}
class Company{
			Company(int a){
				System.out.println("in para company contr");
			}
}
class Employee extends Company{
			Employee(){
				System.out.println("in  employee contr");
			}
}

/*
o/p-
 error: constructor Company in class Company cannot be applied to given types;
                        Employee(){
                                  ^
  required: int
  found:    no arguments
  reason: actual and formal argument lists differ in length
*/
				