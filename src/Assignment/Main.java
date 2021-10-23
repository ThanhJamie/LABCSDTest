/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

/**
 *
 * @author GMT
 */
public class Main {
    public static void main(String[] args) {
        while (true) {            
            int choice  = Manager.menu();
            String filename =  "dict.txt";
            switch(choice){
                case 1:
                    System.out.println("Load file");
                    Manager.loadFile(filename);
                    System.out.println("Load file done");
                    break;
                case 2:
                    System.out.println("Build simple balance tree");
                    Manager.buildBST();
                    System.err.println("Done");
                    break;
                case 3:
                    System.out.println("Add Word");
                    Manager.addWord();
                    System.err.println("Done");
                    break;
                case 4:
                    System.out.println("Delete Word");
                    Manager.deleteWord();
                    System.err.println("Done");
                    break;
                case 5:
                    System.out.println("Search Word");
                    Manager.searchWord();
                    System.err.println("Done");
                    break;
                case 6:
                    System.out.println("In the road go between 2 node any node on tree");
                    Manager.printWayNode();
                    System.err.println("Done");
                    break;
                case 7:
                    return;
            }
        }
    }
}
