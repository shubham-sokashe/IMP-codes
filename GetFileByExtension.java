package IOPackage;

import java.io.File;
import java.util.*;

// write java code to get file of specific extension from the path
public class GetFileByExtension {
    public static void main(String[] args) {
        File fileList = new File("E:\\JAVA\\JAVA Source Code in NOTEPAD");
        Set<String> fileSet = new TreeSet<>(new ArrayList<String>(Arrays.asList(fileList.list())));
        System.out.println("All files from the path");
        for(String name : fileSet){
            System.out.println(name);
        }
        System.out.println("======================================================================================");
        System.out.println("list out only .java.files");
        List<String> javaFilesList = new ArrayList<>();
        for(String names : fileSet){
            if(names.endsWith(".java")){
                javaFilesList.add(names);
            }
        }for(String name : javaFilesList){
            System.out.println(name);
        }

    }
}
