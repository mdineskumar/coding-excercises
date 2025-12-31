package leetcode.strings;

import java.util.*;

interface Master {
    public int guess(String word);
}

class Checker implements Master {
    private String secretWord;
    private List<String> wordList;

    public Checker(String[] words, String secretWord) {
        this.wordList = Arrays.asList(words);
        this.secretWord = secretWord;

    }
    public void setSecretWord(String secretWord) {
        if (secretWord != null && this.secretWord.length() != 6) return;
        this.secretWord = secretWord;
    }

    @Override
    public int guess(String word) {
        if(!wordList.contains(word)){
            return -1;
        }

        int matches = 0;

        for (int i = 0; i < 6; i++) {
            if(secretWord.charAt(i) == word.charAt(i)) matches++;
        }

        return matches;

    }
}

public class GuessWord {
    public void findSecretWord(String[] words, Master master) {
        //random index
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            //choose random index and use that word to make a guess
            String candidate = words[rand.nextInt(words.length)];
            int matches = master.guess(candidate);
            if(matches == candidate.length()) return; //guessed correctly
        }

    }

    private int matches(String a, String b) {
        int matchCount = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) matchCount++;
        }
        return matchCount;
    }

    public void findSecretWordMiniMax(String[] words, Master master) {
        for (int guess = 0; guess < 10; guess++) {
            //picking best word
            //building count map
            Map<String, Integer> count = new HashMap<>();

            //calculate similarity by number of matches
            for (String word1 : words) {
                for (String word2 : words) {
                    if(matches(word1,word2) == 0) continue;
                    count.put(word1,count.getOrDefault(word1,0) +1 );
                }
            }

            System.out.println("End of Count Map: "+count.toString());

            //Step 3: Choosing the Best Candidate to Guess
            String candidate = words[0];

            int minWordsLeft = count.containsKey(candidate) ? count.get(candidate) : 0;

            //choose candidate with highest minimum elimination
            for(String word : words) {
                int minWordEffect = count.getOrDefault(word,0);
                if(minWordEffect <= minWordsLeft) {
                    candidate = word;
                    minWordsLeft = minWordEffect;
                }
            }

            System.out.println("Candidate:" + candidate);
            System.out.println("minWordsLeft:" +minWordsLeft);


            //Step 4: Guessing and Filtering the List
            int matches = master.guess(candidate);
            System.out.println("Match form Master: "+matches);

            List<String> newList = new ArrayList<>();
            for(String word : words) {
                if (matches(candidate,word) == matches) newList.add(word);

            }

            words = newList.toArray(new String[newList.size()]);


        }


    }

    public void findSecretWordOptimize(String[] words, Master master) {
        System.out.println("====findSecretWordOptimize()====");

        List<String> candidates = new ArrayList<>(List.of(words));

        //repeat until found word
        while(!candidates.isEmpty()) {
            //why is it used here?
            int tryIndex = 0;
            int minMaxSize = candidates.size();

            for (int i = 0; i < candidates.size(); i++) {
                int[] group = new int[7];

                for(String s: candidates) {
                    //group candidates by their match count with our
                    group[matches(candidates.get(i),s)]++;
                }

                int maxSize = Arrays.stream(group).max().getAsInt();

                if(maxSize < minMaxSize) {
                    minMaxSize = maxSize;
                    tryIndex = i;
                }

            }
            //found guess
            System.out.println("Try Index: " + tryIndex);


            //did the guess using Master
            String result =  candidates.get(tryIndex);
            int similarityScore = master.guess(result);
            if (similarityScore == 6) {
                System.out.println("You guessed the secret word correctly. And Secret word is "+result);
                return;
            }

            //we need to setup candidates list and repeat again for nextRount
            List<String> nextRound = new ArrayList<>();
            for (String s: candidates) {
                if(matches(s,result) == similarityScore){
                    nextRound.add(s);
                }
            }

            candidates = nextRound;

        }


    }

    public static void main(String[] args) {
        String[] words = {"gaxckt","trlccr","jxwhkz","ycbfps","peayuf","yiejjw","ldzccp","nqsjoa","qrjasy","pcldos",
                "acrtag","buyeia","ubmtpj","drtclz","zqderp","snywek","caoztp","ibpghw","evtkhl","bhpfla","ymqhxk","qkvipb",
                "tvmued","rvbass","axeasm","qolsjg","roswcb","vdjgxx","bugbyv","zipjpc","tamszl","osdifo","dvxlxm","iwmyfb",
                "wmnwhe","hslnop","nkrfwn","puvgve","rqsqpq","jwoswl","tittgf","evqsqe","aishiv","pmwovj","sorbte","hbaczn",
                "coifed","hrctvp","vkytbw","dizcxz","arabol","uywurk","ppywdo","resfls","tmoliy","etriev","oanvlx","wcsnzy",
                "loufkw","onnwcy","novblw","mtxgwe","rgrdbt","ckolob","kxnflb","phonmg","egcdab","cykndr","lkzobv","ifwmwp",
                "jqmbib","mypnvf","lnrgnj","clijwa","kiioqr","syzebr","rqsmhg","sczjmz","hsdjfp","mjcgvm","ajotcx","olgnfv",
                "mjyjxj","wzgbmg","lpcnbj","yjjlwn","blrogv","bdplzs","oxblph","twejel","rupapy","euwrrz","apiqzu","ydcroj",
                "ldvzgq","zailgu","xgqpsr","wxdyho","alrplq","brklfk"};
        String secretWord = "hbaczn";

        String[] word2= {"acckzz","ccbazz","eiowzz","abcczz"};
        String secretWord2 = "acckzz";

        String[] word3 = {"eykdft","gjeixr","eksbjm","mxqhpk","tjplhf","ejgdra","npkysm","jsrsid","cymplm","vegdgt","jnhdvb","jdhlzb","sgrghh","jvydne","laxvnm","xbcliw","emnfcw","pyzdnq","vzqbuk","gznrnn","robxqx","oadnrt","kzwyuf","ahlfab","zawvdf","edhumz","gkgiml","wqqtla","csamxn","bisxbn","zwxbql","euzpol","mckltw","bbnpsg","ynqeqw","uwvqcg","hegrnc","rrqhbp","tpfmlh","wfgfbe","tpvftd","phspjr","apbhwb","yjihwh","zgspss","pesnwj","dchpxq","axduwd","ropxqf","gahkbq","yxudiu","dsvwry","ecfkxn","hmgflc","fdaowp","hrixpl","czkgyp","mmqfao","qkkqnz","lkzaxu","cngmyn","nmckcy","alpcyy","plcmts","proitu","tpzbok","vixjqn","suwhab","dqqkxg","ynatlx","wmbjxe","hynjdf","xtcavp","avjjjj","fmclkd","ngxcal","neyvpq","cwcdhi","cfanhh","ruvdsa","pvzfyx","hmdmtx","pepbsy","tgpnql","zhuqlj","tdrsfx","xxxyle","zqwazc","hsukcb","aqtdvn","zxbxps","wziidg","tsuxvr","florrj","rpuorf","jzckev","qecnsc","rrjdyh","zjtdaw","dknezk"};
        String secretWord3 = "cymplm";


        Master master1 = new Checker(word3,secretWord3);
        GuessWord guessWord = new GuessWord();
        guessWord.findSecretWordMiniMax(word3,master1);
        guessWord.findSecretWordOptimize(word3,master1);
        guessWord.findSecretWord(word3,master1);

    }
}
