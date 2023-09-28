package Advance_Recursion;
public class permutation {
    public static void printPerm(String str,String permutations){
        if(str.length()==0){
            System.out.println(permutations);
        }

        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newString=str.substring(0, i)+str.substring(i+1);
            printPerm(newString, permutations+currChar);
        }
    }
    public static void main(String args[]){
        String str="abc";
        printPerm(str, "");
    }
}

