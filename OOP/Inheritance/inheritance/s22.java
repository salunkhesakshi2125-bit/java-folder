class Demo{
			public static void main(String [] args){
				Employee e = new Employee();
				Company c = new Company(21);
			}
}
class Company{
			int a;
			Company(int a){
				this.a = a;
			}
}
class Employee extends Company{
			Employee(){
				super(12);
			}
}

