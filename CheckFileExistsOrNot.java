package IOPackage;

import java.io.File;

// code to check wether file exists at perticular location or not
public class CheckFileExistsOrNot {
    public static void main(String[] args) {
        File folderToCheck = new File("E:\\JAVA\\JAVA Source Code in NOTEPAD\\Addition.class");
        System.out.println("check weather \"Addition.class\" exists at that location or not");
        if(folderToCheck.exists()){
            System.out.println("File exist at location...");
        }
        else{
            System.out.println("file doesnt exist..");
        }
    }
}

