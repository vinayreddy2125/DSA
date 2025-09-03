import java.util.*;
public class StaticExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }
        int left=0,right=al.size()-1,i=0;
        int res[]=new int[al.size()];
        while(left<=right){
            res[i]=al.get(right);i++;right--;
            if(left<right){
                res[i]=al.get(left);i++;left++;
            }
        }
        int sum=0,j=1;
        for(int ik:res){
            sum+=ik*(int)Math.pow(10,j);
            j++;
        }
        System.out.println(sum);
    }
}
