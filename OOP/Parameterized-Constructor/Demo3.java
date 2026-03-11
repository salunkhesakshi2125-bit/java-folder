class Demo3{
				public static void main(String [] args){
					Employee3 e1 =new  Employee3();
				}
}
class Employee3 {
				Employee3(int a){		
					System.out.println("sarvesh salunkhe");
				}
}


/*
o/p-

 error: constructor Employee3 in class Employee3 cannot be applied to given types;
                                        Employee3 e1 =new  Employee3();
                                                      ^
  required: int
  found:    no arguments
  reason: actual and formal argument lists differ in length
1 error

*/