package miage.java.robin;

import java.io.File;
import java.io.FilenameFilter;

public class JavaFilenameFilter implements FilenameFilter {

    public boolean accept(File dir, String name) {
        File f = new File(dir.getPath()+"/"+name);
        if(f.isFile()){
            return name.endsWith(".java");
        }
        return true;
    }
}
