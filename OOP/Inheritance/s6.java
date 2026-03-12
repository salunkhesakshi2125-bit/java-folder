class Demo{
				public static void main(String [] args){
					Child c = new Child();
					c.education();
					c.property();

					Parent p = new Parent();
					p.property();
					p.childProp();
				}
}
class Parent{
		int paise = 123;
		void property(){
			System.out.println("2 acr....");
		}
}
class Child extends Parent{
		void education(){
			System.out.println("btech :"+paise);
		}
		void childProp(){
			System.out.println("flat");
		}
}

/*
o/p-
: error: cannot find symbol
                                        p.childProp();
                                         ^
  symbol:   method childProp()
  location: variable p of type Parent
*/
//parent fkt tyachya ch property access karu shakato child chya nahi.