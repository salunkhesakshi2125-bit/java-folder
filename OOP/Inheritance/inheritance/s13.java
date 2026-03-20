class Demo{
			public static void main(String [] args){
				Employee e = new Employee();
				e.fun();
			}
}
class Company{
			int paise = 100;
}
class Employee extends Company{
			void fun(){	
				System.out.println(this);			
				System.out.println(super);			
			}
}

/*
o/p-error: '.' expected
                                System.out.println(super);                                                   
*/