package DSA_15_Jan_22;

public class JewlsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        int answer = 0;
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j))
                    answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws java.lang.Exception {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }
}