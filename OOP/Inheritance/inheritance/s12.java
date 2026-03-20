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
				System.out.println(super.paise);
				System.out.println(this.paise);
			}
}

/*
o/p-
100
100
*/