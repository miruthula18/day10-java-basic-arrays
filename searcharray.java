public class searcharray {
    public static void main(String[] args){
        int[] arr={10,30,50,38,59};
        int target=50;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                found=true;
                break;
            }

        }
        if(found){
            System.out.print("found");
        }
        else{
            System.out.print("not found");
        }
    }


    
}
