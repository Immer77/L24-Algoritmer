package opgave5;

public class App {
    public static void main(String[] args) {
        String s = "Jubiiii";
        int k = 3;
        System.out.println(find(s, k));

    }
    public static boolean find(String s, int k){
        boolean found = false;
        int i = 0;
        while(!found && i <= s.length() - k){
            if(kens(s,i,k)){
                found = true;
            }else{
                i++;
            }
        }
        return found;
    }
    public static boolean kens(String s, int i, int k){
        boolean foundDiff = false;
        int j = 1;
        while (!foundDiff && j < k) {
            if(s.charAt(i) != s.charAt(i+j)){
                foundDiff = true;
            } else{
                j++;
            }
        }
        return !foundDiff;
    }
}
