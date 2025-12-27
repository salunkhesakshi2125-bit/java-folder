class Demo62{
				public static void main(String[] args){
					int [] arr={8,10,5,8,10};
					int mid=arr.length/2;
					if(arr.length%2!=0){
						mid=(arr.length/2+1);
					}
					for (int i=mid;i<arr.length;i++){
						System.out.println(arr[i]);
					}
				}
}