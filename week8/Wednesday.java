public static ArrayList<Integer> razlika(ArrayList<Integer> a, ArrayList<Integer> b) {
        TreeSet<Integer> skup = new TreeSet<>(b);
        TreeSet<Integer> skup2 = new TreeSet<>();
        for (Integer i : a){
            if(!skup.contains(i))
                skup2.add(i);
        }

        return new ArrayList<>(skup2);
    }

-----------------------------------------------------------------------------------------


    public static boolean anagram(String s1, String s2) {

        char[] S1 =  s1.toCharArray();
        char[] S2 =  s2.toCharArray();
        ArrayList<Character> res1 = new ArrayList<>();
        ArrayList<Character> res2 = new ArrayList<>();
        for(Character c : S1){
            res1.add(c);
        }
        for(Character c : S2){
            res2.add(c);
        }

        TreeSet<Character> skup1 = new TreeSet<>(res1);
        TreeSet<Character> skup2 = new TreeSet<>(res2);

        if (skup1.equals(skup2)) {
            return true;
        }
        return false;
    }
