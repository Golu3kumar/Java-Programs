package data_structure.challenges;

// My favorite one.
public class OneEditAway {
    // read this comments.
    // There are three type of edits that can be performed on strings :
    // 1. insert a character
    // 2. remove a character
    // 3. replace a character
    // Given two strings, write a function to check if they are one edit(or zero edits) away.
    // Example :
    // goal, goat -> true (replace l with t)
    // goal, goals -> true (insert s in the end)
    // goal, goa -> true (remove l in the end)
    // goal, golf -> false (a,l replace with l,f)(two edits.)
    // let's go
    public static void main(String[] args) {

        System.out.println("Is one edit away : "+oneEditAway("goal","goat")); //true
        System.out.println("Is one edit away : "+oneEditAway("goal","goa")); //true
        System.out.println("Is one edit away : "+oneEditAway("goal","golf")); //false
        System.out.println("Is one edit away : "+oneEditAway("goal","goa")); // true
        System.out.println("Is one edit away : "+oneEditAway("goal","goaled")); // false
    }

    private static boolean oneEditAway(String first, String second) {
        if (first.length() == second.length())
            return oneEditReplace(first,second);
        else if (first.length()+1 == second.length())
            return oneEditInsert(first,second);
        else if (first.length()-1 == second.length())
            return oneEditInsert(second,first);

        return false;
    }

    private static boolean oneEditInsert(String first, String second) {
        int index1 = 0,index2 = 0;
        while (index1 < first.length() && index2 < second.length()){
            if (first.charAt(index1) != second.charAt(index2)){
                if (index1 != index2)
                    return false;
                index1++;
            }else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    private static boolean oneEditReplace(String first, String second) {
        boolean isReplaced = false;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)){
                if (isReplaced)
                    return false;
                isReplaced = true;
            }
        }
        return true;
    }
}
