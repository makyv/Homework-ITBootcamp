public class Functions {

    public static void bilbord(String msg){      
        msg = msg.replaceAll("\\$", "").replaceAll("#", "").replaceAll("@", "");      
        System.out.println(msg);
    }

    public static String uncensore(String censore, String[] kljuc, String[] decode){    
        for (int i = 0; i < kljuc.length; i++) {
            censore = censore.replace(kljuc[i], decode[i]);
        }
        return censore;
    }

    public static boolean isValid(String pass){      
        if (pass.length() <= 8)
            return false;
        char[] chars = pass.toCharArray(); 
        for (int i = 0; i < chars.length; i++) { 
            if (Character.isUpperCase(chars[i])) 
                return true;
        }      
        return false;
    }


    public static void main(String[] args) {       

    }
}
