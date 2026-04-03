class Demo{	
			public static void main(String [] args){
				Child c = new Child();
				c.prop();
				c.edu();
			}
}
class Parent{
			void prop(){
				System.out.println("200");		
			}
}
class Child extends Parent{
			void edu(){
				System.out.println("in child");
			}
			int prop(){
				System.out.println("200 and 2acr");
			}
}

/*
o/p-error: prop() in Child cannot override prop() in Parent
                        int prop(){
                            ^
  return type int is not compatible with void
1 error
*/
	