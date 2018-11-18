
import java.io.*;

public class Utils {

    /**
     * Read content from file
     *
     * @param path
     * @return content
     * @throws IOException
     */
    public static String readContentFromFile(String path) throws IOException {
        BufferedReader br = null;
        FileReader fr = null;
        String line = null;
        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            //br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {

                if (br != null) {
                    br.close();
                }

                if (fr != null) {
                    fr.close();
                }

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }
        return line;
    }

    /**
     * write Content To File
     *
     * @param path
     * @throws IOException
     */
    public static void writeContentToFile(String path) throws IOException {
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            String content = "he he";
            fw = new FileWriter(path);
            bw = new BufferedWriter(fw);
            bw.write(content);
            System.out.println("done");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {

                if (bw != null) {
                    bw.close();
                }

                if (fw != null) {
                    fw.close();
                }

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }
    }

    /**
     * write Content To The End Of File
     *
     * @param path
     * @throws IOException
     */
    public static void writeContentToTheEndOfFile(String path) throws IOException {
        try {
            String data = "\n this is new content.";
            FileWriter fw = new FileWriter(path, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void findFileByName(String folderPath, String fileName) {
        File file = new File(folderPath);
        if (file.exists()) {
            if (file.isFile()) {
                if (file.getName().endsWith(fileName)) {
                    System.out.println(file.getAbsolutePath());
                }
            }
            File[] listFile = file.listFiles();
            if (listFile != null) {
                for (File f : listFile) {
                    findFileByName(f.getAbsolutePath(), fileName);
                }
            }
        } else {
            System.out.println("folderPath không tồn tại");
        }
    }

    public static void main(String[] args) throws IOException {
        String source = "C:\\Users\\Manh Nguyen\\Documents\\NetBeansProjects\\";
        String key = "";

        Utils file = new Utils();
        file.findFileByName(source, key);

        
        
        // writeContentToFile("okok.txt");
        writeContentToTheEndOfFile("deptrai.txt");

        String x = file.readContentFromFile("deptrai.txt");
    }
}
