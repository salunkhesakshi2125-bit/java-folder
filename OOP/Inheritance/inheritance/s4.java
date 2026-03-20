class Demo{
				public static void main(String [] args){
					Child c = new Child();
					c.education();
					c.property();
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
}

/*
o/p-
btech :123
2 acr....
*/
//child chya reference ne aapan parent madhal var, method baher direct access karu shakato.