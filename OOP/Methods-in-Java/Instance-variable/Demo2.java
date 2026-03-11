class Demo2{
				public static void main(String [] args){
					Codex2 c1 = new Codex2();
					c1.fun();
					Codex2.gun();
				}
}
class Codex2{
			//instance variable
			int a=19;
			void fun(){
				System.out.println("in fun :"+a);
			}
			static void gun (){
				System.out.println("in gun"+a);
			}

}



/*o/p-
error: non-static variable a cannot be referenced from a static context
                                System.out.println("in gun"+a);
                                                            ^

*/