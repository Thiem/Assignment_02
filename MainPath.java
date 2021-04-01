package Assignment_02;

import java.util.Scanner;

public class MainPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please input Path:");
        String path=sc.nextLine();
        MyFileName fileName = new MyFileName(path);

        System.out.println("Path: " + fileName.getPath());
        System.out.println("File Name: " + fileName.getFileName());
        System.out.println("Extension: " + fileName.getExtension());
        System.out.println("Disk: " + fileName.getDisk());

        var folders = fileName.getFolders();
        System.out.println("List folders:");
        for (var folder : folders) {
            System.out.println(folder);
        }
    }
}
