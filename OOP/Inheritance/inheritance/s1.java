class Demo{
			public static void main(String [] args){
				Child c = new Child ();
				c.display();
			}
}
class Parent{
		int paise = 100;
}
class Child  {
		void display(){
			Parent p = new Parent();
			System.out.println(p.paise);
		}		
}

/*
o/p- 100
*/
		