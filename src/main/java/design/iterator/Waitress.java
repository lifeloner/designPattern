package design.iterator;

import java.util.Iterator;

/**
 * Created by fuyang on 2017/1/27.
 */
public class Waitress {
    private Menu pancke;
    private Menu diner;

    public Waitress() {
        pancke=new PancakeMenu();
        diner=new DinerMenu();
    }

   public void printMenu(){
       Iterator pancakeIterator=pancke.createIterator();
       Iterator dinerIterator=diner.createIterator();
       System.out.println("pancke");
       printMenu(pancakeIterator);
       System.out.println("diner");
       printMenu(dinerIterator);
   }

   public void printMenu(Iterator iterator){
       if(iterator==null){
           return ;
       }
       while(iterator.hasNext()){
           System.out.println(iterator.next());
       }
   }

    public static void main(String[] args) {
        Waitress waitress=new Waitress();
        waitress.printMenu();
    }
}
