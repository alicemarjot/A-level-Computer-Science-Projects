
package petshop;

import java.util.ArrayList;
import java.util.Scanner;


public class PetShop {

//    private static ArrayList <String> petList = new ArrayList<>();
    
    private static ArrayList <Dog> dogList = new ArrayList<>();
    private static ArrayList <cat> catList = new ArrayList<>();
    private static ArrayList <chinchilla> chinchillaList = new ArrayList<>();
    private static Scanner Input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("What would you like to do?");
        System.out.println("See the dog list? 1");
        System.out.println("See the cat list? 2");
        System.out.println("See the chinchilla list? 3");
        
        
        for (int j = 0; j < 2; j++) {
            
        
        int i = 0;
        i = Input.nextInt();
        if(i==1){
            newDog();
        }
        if(i==2){
            newCat();
        }
        if(i==3){
            newChinchilla();
        }
        else{
            System.out.println("NOT A VALID INPUT. PLEASE TRY AGAIN");
        }
        
        }
        
    }
    
    
    public static void newDog(){
       
        Dog terrier = new Dog("Jefferey");
        dogList.add(terrier);
        Dog labrador = new Dog("GREG");
        dogList.add(labrador);
        Dog retriever = new Dog("Rupert");
        dogList.add(retriever);
        
        System.out.println("What dog would you like to choose?");
        System.out.println("Terrier, 1");
        System.out.println("Labrador, 2");
        System.out.println("Retriever, 3");
        int breed = 0;
        breed = Input.nextInt()-1;
        if(breed == 0){
            System.out.println(dogList.get(0));
        }
        if(breed == 1){
            System.out.println(dogList.get(1));
        }
        if(breed == 2){
            System.out.println(dogList.get(2));
        }
 
    }
    
    public static void newCat(){
        cat black = new cat("Lucifer");
        catList.add(black);
        cat tabby = new cat("Moriarty");
        catList.add(tabby);
        cat patched = new cat("Sheldon");
        catList.add(patched);
       
    }
    
    public static void newChinchilla(){
        chinchilla brown = new chinchilla("Jeff");
        chinchillaList.add(brown);
    }
    
    
    
//    public static void petList(){
//        //System.out.println("Types of pet:");
//        System.out.println(petList);
//
//        /*
//        String a = "dogs";
//        String b = "cats";
//        String c = "tortoises";
//        String d = "rabbits";
//        String e = "chinchillas";
//        petList.add(a);
//        petList.add(b);
//        petList.add(c);
//        petList.add(d);
//        petList.add(e);
//*/      }
        
        
    
    public static void foodList(){
        System.out.println("Types of food:");
        int doggoDins = 10;
        int catKibble = 10;
        int chinchillaChips = 15;
        int tortreats = 5;
        int RabBits = 5;
    }
}

