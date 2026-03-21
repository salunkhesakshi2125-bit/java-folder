//multiple inheritance (java does not support multiple inheritance)
class Demo{
			public static void main(String [] args){
				Child c = new Child();
				c.fun();
			}
}
class A{
	int a = 54;
}
class B{
	int a = 22;
}
class Child extends A,B{
	void fun(){
		System.out.println(a);
	}
}

/*
o/p-
 error: '{' expected
class Child extends A,B{
                     ^
*/