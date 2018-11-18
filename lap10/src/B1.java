import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class B1 {
    private static ArrayList<String> allFunctions = new ArrayList<>();

    public static ArrayList<String> getAllFunctions(File path) throws IOException {

        String data = "";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        while (bufferedReader.ready()) {
            data += bufferedReader.readLine();
            data += "\n";
        }

        // Xử lý data
        String elements[] = data.split("public static");
        for (int i = 1; i < elements.length; i++) {
            String function = "public static";
            //Biến đếm ngoặc
            int count1 = 0;
            int count2 = 0;
            for (int j = 0; j < elements[i].length(); j++) {
                if (elements[i].charAt(j) == '{') {
                    count1++;
                }
                if (elements[i].charAt(j) == '}') {
                    count2++;
                }
                function += elements[i].charAt(j);
                if (count1 == count2 && count1 != 0) {
                    allFunctions.add(function);
                    break;
                }
            }
        }
        return allFunctions;
    }

    /**
     * find Function By Name
     * @param name
     * @return
     */
    public static String findFunctionByName(String name) {
        for (int i = 0; i < allFunctions.size(); i++) {
            if (allFunctions.get(i).contains(name))
                return allFunctions.get(i);
        }
        System.out.println("Không tìm thấy!!");
        return null;
    }

    public static void main(String[] args) throws IOException {
        //Get Funtion Test
        ArrayList<String> a = new ArrayList<>();
        File file = new File("src\\Utils.java");
        a = getAllFunctions(file);
        System.out.println(a);

        //Find test
        System.out.println("-------------------------------------");
        String s = findFunctionByName("writeContentToTheEndOfFile");
        System.out.println(s);
    }
}
