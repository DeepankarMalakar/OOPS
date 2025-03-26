// Java program to find all permutations of a given String using recursion.  
// Java program to find all permutations of a given String using recursion.  
// For example, given a String "XYZ", this program will print all 6 possible permutations 
// For example, given a String "XYZ", this program will print all 6 possible permutations  e.g. XYZ, XZY, YXZ, YZX, ZXY, XYX 
// XZY, YXZ, YZX, ZXY, XYX 

class StringPermutations {
    public void permute(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            permute(str.substring(0, i) + str.substring(i + 1), ans + str.charAt(i));
        }
    }
}

class Permutations4 {
    public static void main(String[] args) {
        StringPermutations sp = new StringPermutations();
        sp.permute("XYZ", "");
    }
}