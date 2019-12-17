/*
You are playing the following Bulls and Cows game with your friend: You write down a number and ask your friend to guess what the number is. Each time your friend makes a guess, you provide a hint that indicates how many digits in said guess match your secret number exactly in both digit and position (called "bulls") and how many digits match the secret number but locate in the wrong position (called "cows"). Your friend will use successive guesses and hints to eventually derive the secret number.

Write a function to return a hint according to the secret number and friend's guess, use A to indicate the bulls and B to indicate the cows. 

Please note that both secret number and friend's guess may contain duplicate digits.

Example 1:

Input: secret = "1807", guess = "7810"

Output: "1A3B"

Explanation: 1 bull and 3 cows. The bull is 8, the cows are 0, 1 and 7.
*/

//未优化
class Solution {
    public String getHint(String secret, String guess) {
        List<String> secretList = Arrays.asList(secret.split(""));
        List<String> guessList = Arrays.asList(guess.split(""));

        int bulls = 0, cows = 0;
/*        for (int i=0; i<secretList.size(); i++) {
            if ((secretList.get(i)).equals(guessList.get(i))==true) bulls++;
        }
*/
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i=0; i<secretList.size(); i++) {
            if ((secretList.get(i)).equals(guessList.get(i))==true) bulls++;

            String tmpStr= secretList.get(i);
            if(map.containsKey(tmpStr)==true) {
                int tmpNum = map.get(tmpStr);
                map.put(tmpStr, tmpNum+1);
            }
            else map.put(tmpStr, 1);
        }
        for(int i=0; i<guessList.size(); i++) {
            String tmpStr = guessList.get(i);
            if((map.containsKey(tmpStr)==true)&&(map.get(tmpStr)>0)) {
                cows++;
                int tmpNum = map.get(tmpStr);
                map.put(tmpStr, tmpNum-1);
            }
        }
        cows = cows - bulls;
        String ans = bulls+"A"+cows+"B";
        return ans;
    }
}
