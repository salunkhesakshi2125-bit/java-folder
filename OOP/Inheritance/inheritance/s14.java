class Demo{
			public static void main(String [] args){		
				Employee e = new Employee();
				e.fun();
				e.gun();
			}
}
class Company{
			int paise = 100;
			void gun(){
				System.out.println(this.paise);
			}
}
class Employee extends Company{
			int sal = 120;
			void fun(){
				System.out.println(this.sal);
			}

}

/*
o/p-120
100
*/