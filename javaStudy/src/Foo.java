import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Foo {
    private static String regex1 = "^([\\d.]+)"; // Client IP (처음에 숫자형식(123.) 이 여러번 나오는 것에 match)
    private static String regex2 = " (\\S+)"; // - (공백 아님)
    private static String regex4 = " \\[([\\w:/]+\\s[+\\-]\\d{4})\\]"; // Date : 대괄호나오고, 여러개의 :, 공백, 숫자연속 4번
    private static String regex5 = " \"(.+?)\""; // request method and url : 따옴표(") ~ 따옴표(")
    private static String regex6 = " (\\d{3})"; // HTTP code : 숫자연속 3번
    private static String regex7 = " (\\d+|(.+?))"; // Number of bytes
    private static String regex8 = " \"([^\"]+|(.+?))\""; // Referer
    private static String regex9 = " \"([^\"]+|(.+?))\""; // Agent

    public static void main(String[] args) {
        String s = "211.181.155.100 - - [22/Apr/2013:09:01:16 +0900] 'GET /edu/ttb/selectBoardList.do HTTP/1.1' 200 37533"; // 원본
        //103.4.50.72 /cyberEdu/swf/02/1010.html
        String s2 = "";

        System.out.println("원본:    " + s);
        System.out.println(); // 줄바꿈

        String rep = "(([\\d]{1,3})\\.([\\d]{1,3})\\.([\\d]{1,3})\\.([\\d]{1,3}))|(\\s((/([\\w]+))+[.[\\w]]+))";
        //String rep = "\\s((/([\\w]+))+[.[\\w]]+)";
        Pattern p = Pattern.compile(rep);
        Matcher m = p.matcher(s);
        
        while(m.find()) {
            s2 += m.group();
            
        }
        System.out.println(s2);
    }
}
