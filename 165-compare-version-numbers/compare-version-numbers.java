class Solution {
    public int compareVersion(String v1, String v2) {
        
        int count1 = 0;
        for(int i = 0; i < v1.length() ;i++){
            if(v1.charAt(i) == '.')count1++;
        }
        int count2 = 0;
        for(int i=0; i<v2.length();i++ ){
            if(v2.charAt(i) == '.')count2++;
        }

        int maxCount = count1 > count2 ? count1 : count2;
        maxCount = maxCount + 1;

        String n1 = "";
        String n2 = "";
        int j = 0;
        int k = 0;



        while(maxCount != 0){
            n1 = "";
            while(j < v1.length() && v1.charAt(j) != '.'){
                n1 = n1 + v1.charAt(j);
                j++;
            }
            j++;

            n2 = "";
            while(k < v2.length() && v2.charAt(k) != '.'){
                n2 = n2 + v2.charAt(k);
                k++;
            }
            k++;

            if(n1.equals(""))n1 = "0";
            if(n2.equals(""))n2 = "0";

            int num1 = Integer.parseInt(n1);
            int num2 = Integer.parseInt(n2);
            System.out.println(n1 + " " + n2);

            if(num1 < num2) return -1;
            if(num1 > num2) return 1;

            maxCount--;
        }

        return 0;

    }
}