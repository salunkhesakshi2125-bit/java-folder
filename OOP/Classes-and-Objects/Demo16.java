class Demo16{
				public static void main(String [] args){
					codex16  c1= new codex16();
					c1.display();
					c1.name="Girish";
					c1.add="Shirwal";
					c1.display();
				}
}
class codex16{
			String name;
			String add;
			
			void display(){
				System.out.println("name : "+name  );
				System.out.println("address : "+add  );

			}
}