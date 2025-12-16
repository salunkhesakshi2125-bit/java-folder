class Demo27{
				public static void main(String[]args){
					int [] arr={4,3,6,5};
					int count=0;
					for(int i=0;i<arr.length;i++){
						if (arr[i]%2!=0){
							count++;
						}
					}
					System.out.println(count);		
				}
}