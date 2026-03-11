class Demo7{
			public static void main(String [] args){
				Codex chavi = new Codex();
				chavi .fun();
			}
}
class Codex{
		int a;
		String s;
		float f;
		char ch;
		boolean b;
		double d;
		void fun(){
			System.out.println("Default value of int :"+a); 	
			System.out.println("Default value of string :"+s); 	
			System.out.println("Default value of float :"+f); 	
			System.out.println("Default value of char :"+ch); 	
			System.out.println("Default value of boolean :"+b); 	
			System.out.println("Default value of double :"+d); 	
		}
}