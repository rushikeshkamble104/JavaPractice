package String;

//String code to convert a string without changing the positon of special characters in given string
// input s = R@U#S$H%I
//output I@H#S$U%R
public class ReverseStringWithoutMovingSpecialChars {
    public static String revString(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int j = s.length()-1;

        while (i<j) {
            if(!Character.isLetter(sb.charAt(i))) {
                i++;
            }
            else if (!Character.isLetter(sb.charAt(j)))  {
                j--;
            }
            else {
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j,temp);
                i++;
                j--;
            }

        }
        return sb.toString();

    }
    public static void main(String[] args) {
        String s = "R@U#S$H%I";
        String revString = revString(s);
        System.out.println(revString);
    }
}