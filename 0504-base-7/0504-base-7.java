class Solution {
    public String convertToBase7(int num) {
        StringBuilder sb=new StringBuilder(0);
        if(num==0){
            sb.append(0);
            return sb.toString();
        }
        int n=num;
        if(num<0)num=num*(-1);
        while(num!=0){
            int rem=num%7;
            sb.append(rem);
            num/=7;
        }
        if(n<0)sb.append('-');
        sb=sb.reverse();
        return sb.toString();
    }
}