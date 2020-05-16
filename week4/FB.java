public class FB {
    public int sol(int n){
        if(n <= 0)
            return -1;
        if(n == 1){
            return 1;
        }
        int pre = 1;
        int pree = 1;
        int temp = 0;
        for(int i = 2; i <n; i++){
            temp = pre + pree;
            pree = pre;
            pre = temp;

        }
        return pre;
    }
    public int rec(int n){
       if(n <= 0){
           return 0;
       }else if(n < 3){
           return 1;
       }
       return helper(n,3,1,1);
    }
    private int helper(int n ,int cur, int pre, int pree){
        if(cur == n)
            return pre+pree;
        return helper(n,cur+1,pre+pree,pre);
    }
    public static void main(String[] args){
        FB fb = new FB();
        System.out.print(fb.sol(4));
    }
}
