import java.util.HashMap;

public class characterCountLoop {
    public static void main(String[] args) {
        String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = str.toLowerCase().toCharArray();
        HashMap<Character, Integer> letterMap = new HashMap<>();
        for (char i : charactersInString) {
            if(letterMap.containsKey(i)){
                letterMap.replace(i, letterMap.get(i)+1);
            } else {
                letterMap.put(i, 1);
            }

            //letterMap.put(i, 1);
        }
        System.out.println(letterMap);
    }
}

