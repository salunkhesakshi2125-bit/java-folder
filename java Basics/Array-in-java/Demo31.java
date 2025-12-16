class Demo31{
				public static void main(String[] args){
					int [] arr={10,20,30,40,50};
					if(arr.length%2!=0){
						System.out.println(arr[arr.length/2]);
					}
					else{
						int mid=arr.length/2;
						System.out.println(arr[mid]);
						System.out.println(arr[mid]-1);
					}
				}
}