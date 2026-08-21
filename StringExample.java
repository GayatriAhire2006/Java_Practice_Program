public class StringExample {
    public static void main(String[] args) {
        String s1 = "Gayatri Empi";
        int vowels = 0;
        int consonants = 0;
        char ch;
        String Vstr = "";
        String Cstr = "";

            for (int i = 0; i < s1.length(); i++) {
                 ch = Character.toLowerCase(s1.charAt(i));

                 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                     vowels++;
                     Vstr = Vstr + " " + ch;
                 } else {
                     consonants++;
                     Cstr = Cstr + " " + ch;
                 }

            }
            System.out.println("String: " + s1);
            System.out.println("Total vowels: " + vowels);
            System.out.println("Vowels: " + Vstr);

            System.out.println("Total consonants: " + consonants);
            System.out.println("Consonants: " + Cstr);

    }

    }

