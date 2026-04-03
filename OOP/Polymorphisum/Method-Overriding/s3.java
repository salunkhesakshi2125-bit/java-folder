class Demo{	
			public static void main(String [] args){
				Child c = new Child();
				c.prop(21);
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
			void prop(int a){
				System.out.println("200 and 2acr");
			}
}

/*
ya madhe overriding hota nahi because method prop che parameter different ahet mg tya separate method consider hotat

o/p-200 and 2acr
in child
*/
	