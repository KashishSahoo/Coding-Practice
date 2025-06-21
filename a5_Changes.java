class a5_Changes{
    public static void main(String[] args) {
        String str="AbccFDSWeeWW";
        String ans=changes(str);
        System.out.println(ans);
    }
    public static String changes(String str){
        int uc=0;
        int lc=0;
        int n=str.length();
        for(int i=0;i<n;i++){
            if(Character.isUpperCase(str.charAt(i))){
                uc++;
            }
        }
        lc=n-uc;
        if(uc>lc){
            return str.toUpperCase();
        }
        else if(lc>uc){
            return str.toLowerCase();
        }
        return str;
    }


}