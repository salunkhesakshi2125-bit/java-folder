class Demo14{
				public static void main(String [] args){
					codex14   c1 = new  codex14();
					c1.name="Sakshi";
					c1.add="visapur";
					c1.mark=55;
					c1.fun();

					codex14  c2 = new  codex14();
					c2.name= "Arpita";
					c2.add="satara";
					c2.mark = 60;
					c2.fun();
				}
}
class codex14{
				String name;
				String add;
				int mark;
				
				void fun(){
					System.out.println("name is  : "+name+ ", address is : "+add+", marks : "+mark);
				}
}