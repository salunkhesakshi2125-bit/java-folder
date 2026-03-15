class Demo{
			public static void main(String [] args){
				Child c = new Child();
				c.fun();
			}
}
class Parent {
			int paise = 100;
}
class Child{
			int paise = 23;
			void fun(){
				System.out.println(paise);
			}
}

/*
o/p- 23
*/