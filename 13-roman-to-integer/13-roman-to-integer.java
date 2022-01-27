class Solution {
    public int romanToInt(String s) {
        int res=0,l=s.length(),last=1000;
        for(int i=0;i<l;i++){
            int cur=getValue(s.charAt(i));
            if(cur>last) res-=last*2;
             res+=cur;
            last=cur;
        }
        return res;
    }
    public int getValue(char c){
        switch(c){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
}