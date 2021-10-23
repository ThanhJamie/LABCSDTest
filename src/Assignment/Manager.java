/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

/**
 *
 * @author GMT
 */
public class Manager {
    
    
    public static int menu(){
        System.out.println("================ Dictionary program ================");
        System.out.println("1. Load file");
        System.out.println("2. Build simple balance tree");
        System.out.println("3. Add Word");
        System.out.println("4. Delete Word");
        System.out.println("5. Search Word");
        System.out.println("6. In the road go between 2 node any node on tree");
        System.out.println("7. Exit");
        System.out.println("====================================================");
        System.out.print("Enter your choice: ");
        int choice = Validation.checkInputIntLimit(1, 7);
        return choice;
    }
    
    public static void loadFile(String filename){
        
    }
    
    public static void buildBST(){
        
    }
    
    public static void addWord(){
        
    }
    
    public static void deleteWord(){
        
    }
    
    public static void searchWord(){
        
    }
    
    public static void printWayNode(){
        
    }
}
