import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




public class subsStringWithCon {


   public static List<Integer> findSubstringIndices(String s, String[] words) {
        List<Integer> indices = new ArrayList<>();
        if (s == null || words == null || words.length == 0) {
            return indices;
        }

        int wordLength = words[0].length();
        int numWords = words.length;
        int concatLength = wordLength * numWords;

        if (s.length() < concatLength) {
            return indices;
        }

        // Create a frequency map for the words
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i < wordLength; i++) {
            // Use a sliding window approach to find all valid substrings
            Map<String, Integer> windowMap = new HashMap<>();
            int left = i;
            int right = i;
            int count = 0;

            while (right + wordLength <= s.length()) {
                String word = s.substring(right, right + wordLength);

                if (wordCountMap.containsKey(word)) {
                    windowMap.put(word, windowMap.getOrDefault(word, 0) + 1);

                    if (windowMap.get(word) <= wordCountMap.get(word)) {
                        count++;
                    } else {
                        while (windowMap.get(word) > wordCountMap.get(word)) {
                            String leftWord = s.substring(left, left + wordLength);
                            windowMap.put(leftWord, windowMap.get(leftWord) - 1);
                            if (windowMap.get(leftWord) < wordCountMap.get(leftWord)) {
                                count--;
                            }
                            left += wordLength;
                        }
                    }

                    if (count == numWords) {
                        indices.add(left);
                    }

                    right += wordLength;
                } else {
                    // Move left and right pointers if the word is not in the word list
                    windowMap.clear();
                    count = 0;
                    left = right = right + wordLength;
                }
            }
        }

        return indices;
    }

    public static void main(String[] args) {
        String s1 = "pjzkrkevzztxductzzxmxsvwjkxpvukmfjywwetvfnujhweiybwvvsrfequzkhossmootkmyxgjgfordrpapjuunmqnxxdrqrfgkrsjqbszgiqlcfnrpjlcwdrvbumtotzylshdvccdmsqoadfrpsvnwpizlwszrtyclhgilklydbmfhuywotjmktnwrfvizvnmfvvqfiokkdprznnnjycttprkxpuykhmpchiksyucbmtabiqkisgbhxngmhezrrqvayfsxauampdpxtafniiwfvdufhtwajrbkxtjzqjnfocdhekumttuqwovfjrgulhekcpjszyynadxhnttgmnxkduqmmyhzfnjhducesctufqbumxbamalqudeibljgbspeotkgvddcwgxidaiqcvgwykhbysjzlzfbupkqunuqtraxrlptivshhbihtsigtpipguhbhctcvubnhqipncyxfjebdnjyetnlnvmuxhzsdahkrscewabejifmxombiamxvauuitoltyymsarqcuuoezcbqpdaprxmsrickwpgwpsoplhugbikbkotzrtqkscekkgwjycfnvwfgdzogjzjvpcvixnsqsxacfwndzvrwrycwxrcismdhqapoojegggkocyrdtkzmiekhxoppctytvphjynrhtcvxcobxbcjjivtfjiwmduhzjokkbctweqtigwfhzorjlkpuuliaipbtfldinyetoybvugevwvhhhweejogrghllsouipabfafcxnhukcbtmxzshoyyufjhzadhrelweszbfgwpkzlwxkogyogutscvuhcllphshivnoteztpxsaoaacgxyaztuixhunrowzljqfqrahosheukhahhbiaxqzfmmwcjxountkevsvpbzjnilwpoermxrtlfroqoclexxisrdhvfsindffslyekrzwzqkpeocilatftymodgztjgybtyheqgcpwogdcjlnlesefgvimwbxcbzvaibspdjnrpqtyeilkcspknyylbwndvkffmzuriilxagyerjptbgeqgebiaqnvdubrtxibhvakcyotkfonmseszhczapxdlauexehhaireihxsplgdgmxfvaevrbadbwjbdrkfbbjjkgcztkcbwagtcnrtqryuqixtzhaakjlurnumzyovawrcjiwabuwretmdamfkxrgqgcdgbrdbnugzecbgyxxdqmisaqcyjkqrntxqmdrczxbebemcblftxplafnyoxqimkhcykwamvdsxjezkpgdpvopddptdfbprjustquhlazkjfluxrzopqdstulybnqvyknrchbphcarknnhhovweaqawdyxsqsqahkepluypwrzjegqtdoxfgzdkydeoxvrfhxusrujnmjzqrrlxglcmkiykldbiasnhrjbjekystzilrwkzhontwmehrfsrzfaqrbbxncphbzuuxeteshyrveamjsfiaharkcqxefghgceeixkdgkuboupxnwhnfigpkwnqdvzlydpidcljmflbccarbiegsmweklwngvygbqpescpeichmfidgsjmkvkofvkuehsmkkbocgejoiqcnafvuokelwuqsgkyoekaroptuvekfvmtxtqshcwsztkrzwrpabqrrhnlerxjojemcxel";
        String[] words = {"dhvf","sind","ffsl","yekr","zwzq","kpeo","cila","tfty","modg","ztjg","ybty","heqg","cpwo","gdcj","lnle","sefg","vimw","bxcb"};


        System.out.println(findSubstringIndices(s1, words));
    }
}
