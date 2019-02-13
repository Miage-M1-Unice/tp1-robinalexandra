package miage.java.robin;

import java.io.File;
import java.io.FilenameFilter;

public class App {

    public App(){}

    public void list(String pathname, FilenameFilter filter){
        File root = new File(pathname);
        File[] files = root.listFiles(filter);
        for (File file : files) {
            if(file.isDirectory()){
                this.list(file.getPath(), filter);
            }
            else{
                System.out.println(file);
            }
        }
    }

    public static void main(String[] args) {
        App app = new App();
        JavaFilenameFilter javaFilter = new JavaFilenameFilter();
        app.list(".", javaFilter);
    }
}
