class Demo{
				public static void main(String [] args){
					Child c = new Child ();
					c.education();
					c.shopping();
				}
}
class Parent{
		int paise = 100;
}
class Child extends Parent{
		void education(){
			System.out.println("btech :"+paise);	
		}

		void shopping(){
			System.out.println("shopping :"+paise);	
		}
}

/*
o/p-
btech :100
shopping :100
*/