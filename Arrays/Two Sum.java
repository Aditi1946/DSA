class Solution {
    public int[] twoSum(int[] array, int target) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter target:");
        target=sc.nextInt();
        System.out.println("Enter no of elements:");
        n=sc.nextInt();
    
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        for(int j=0;j<n-1;j++){
            for(int k=j+1;k<n;k++){
                if(array[j]+array[k]==target){
                    return {j,k};
                }
            }
        }
        return{};
    }
}