class Demo{
			public static void main(String [] args){		
				Employee e = new Employee();
				e.fun();
				e.gun();
			}
}
class Company{
			void gun(){
				System.out.println(this);
			}
}
class Employee extends Company{
			void fun(){
				System.out.println(this);
			}

}

/*
o/p-
Employee@276438c9
Employee@276438c9

*/