package NetflixTitleSearchSystem;

import java.util.*;

public class SearchTitleSystem {


    public static void main(String[] args) {

        // Movie name with miss spelled title for searching record
        String[] title = {"race","raec","reac","rustom","rostum","cars","master","meastr","mastre","maestr"};

        String query = "raec";

        List<ArrayList<String>> gt = getTitle(title);

        for (ArrayList<String> list : gt) {
            if (list.contains(query)){
                System.out.println(list);
            }
        }
    }

    private static List<ArrayList<String>> getTitle(String[] title) {

        Map<String,ArrayList<String>> res = new HashMap<>();

        int[] count = new int[26];
        for (String s : title) {
            Arrays.fill(count,0);
            for (char c:s.toCharArray()) {
                int index = c - 'a';
                count[index]++;
            }

            StringBuilder delimiter = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                delimiter.append("#");
                delimiter.append(count[i]);
            }

            String key = delimiter.toString();
            if (!res.containsKey(key))
                res.put(key,new ArrayList<String>());

            res.get(key).add(s);
        }

        return new ArrayList<>(res.values());
    }
}
