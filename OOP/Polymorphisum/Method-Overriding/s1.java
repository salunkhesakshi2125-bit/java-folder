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
			void prop(){
				System.out.println("200 and 2acr");
			}
}

/*
o/p-200 and 2acr
in child
*/
	