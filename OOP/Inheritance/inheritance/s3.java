class Demo{
				public static void main(String [] args){
					Child c = new Child ();
					c.education();
					c.shopping();
					c.childProp();
				}
}
class Parent{
		int paise = 1000;
		void property(){
			System.out.println("2 acr.....");
		}
}
class Child extends Parent{
		void education(){
			System.out.println("btech :"+paise);
		}
		void shopping (){
			System.out.println("shopping :"+paise);
		}
		void childProp(){
			property();
			System.out.println("flat");
		}
}

/*
o/p-
btech :1000
shopping :1000
2 acr.....
flat
*/