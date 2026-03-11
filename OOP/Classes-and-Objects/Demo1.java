class Demo1{
			public static void main(String [] args){
				Hospital.opd();
				Hotel.veg();
				System.out.println("in main");
			}
}
class Hospital{
			static void opd(){
				System.out.println("in hospital");
			}
}
class Hotel{
			static void  veg(){
				System.out.println("in hotel");
			}
}