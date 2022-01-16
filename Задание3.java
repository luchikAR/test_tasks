import java.lang.String;

public class Main
{
	public static void main(String[] args) {
	   // Задание №3
	   // поиск повторяющихся символов в строке
        String str = "Hello World :)";
        // String str = "ffffaaaaaaagggggggaaaaaatttttt :)";
        
        String result = new String();
        for (int i = 0; i < str.length() ; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && result.indexOf(str.charAt(j)) == -1) {
                    result += str.charAt(i);
                    break;
                }
            }
        }

        System.out.print("Повторяющиеся символы: " + result);
	}
}
