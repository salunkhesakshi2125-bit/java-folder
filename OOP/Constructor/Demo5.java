class Demo5{
				public static void main(String [] args){
					System.out.println("data of object 1 :");
					Codex5  c1 = new Codex5();
					c1.display();

					System.out.println("-----------------------------");

					System.out.println("data of object 2 :");
					Codex5  c2 = new Codex5();
					c2.display();
					

				
				}
}
class Codex5{
			int a;
			Codex5(){
				a=21;
			}
			void display(){
				System.out.println("data is:"+a);
			}
}