package sessions.lesson11;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        File file = new File("src/sessions/lesson11/serg.txt");
        FileUtil.createFile(file);
        FileUtil.writeFileUtil("Serg", file.getPath());
        String resultActual = FileUtil.readFileContent(file);
        System.out.println(resultActual);
        FileUtil.writeFileUtil(resultActual.replace("e", "и"), file.getPath());
    }
}