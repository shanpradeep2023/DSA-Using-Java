package finacle;

public class CamelCase {
    public static void main(String[] args) {
        String str = "Convert-this_TOOO-lOWeR.CASE";
        System.out.println(convert(str));
    }

    public static String convert(String s){
        String[] words = s.split("[^a-zA-Z0-9]");
        StringBuilder b = new StringBuilder();

        for(int i=0;i<words.length;i++){
            if(s==null)
                return "";

            if(i==0){
                b.append(words[0].toLowerCase());
            }
            else{
                b.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1).toLowerCase());
            }
        }

        return b.toString();
    }
}
