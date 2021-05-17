package IOPackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// write a code to get list of all files/directories from given path
public class ListOfFiles {

    public static void main(String[] args) {
        File directory = new File("E:\\JAVA\\NOTES");
        List<String> fileList = new ArrayList<>(Arrays.asList(directory.list()));
        System.out.println("file list is : ");
        for(String name : fileList){
            System.out.println(name);
        }
    }
}
