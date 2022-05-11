package opgave5;

public class App {
    public static void main(String[] args) {
        String s = "Jubiiii";
        int k = 5;
        System.out.println(find(s, k));

    }
    public static boolean find(String s, int k){
        boolean found = false;
        int i = 0;
        while(!found && i <= s.length() - k){
            if(kens(s,k)){
                found = true;
            }else{
                i++;
            }
        }
        return found;
    }
    public static boolean kens(String s, int k){
        boolean foundDiff = false;
        int j = 0;
        int i = 0;
        while (!foundDiff && j < s.length()) {
            if(s.charAt(j) == s.charAt(j+1)){
                foundDiff = true;
            } else{
                j++;
            }
        }
        return foundDiff;
    }
}
