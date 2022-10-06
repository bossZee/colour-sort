/**
 *
 * @author Zinhle
 */
public class WaterSort {

    static Character red= new Character('r');
    static Character blue= new Character('b');
    static Character yellow= new Character('y');
    
    static int numBottles=5;
    static StackAsMyArrayList[] bottles=new StackAsMyArrayList[numBottles];
//    static int numBottles=5;
    
    public static void ShowAll(){
        for(int i=0; i<numBottles; i++){
            System.out.println("Bottle "+i+": "+bottles[i].toString());
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StackAsMyArrayList<Character> tube1= new StackAsMyArrayList<Character>();
        
        System.out.println("Initial List: ");
        System.out.println(tube1);
        
        System.out.println("\nAdd one item");
        tube1.push(blue);
        System.out.println(tube1);
        
        System.out.println("\nAdd more");
        tube1.push(yellow);
        tube1.push(red);
        tube1.push(blue);
        System.out.println(tube1);
        
        System.out.println("\nCheck Uniform");
        System.out.println(tube1.checkStackUniform());
        
        System.out.println("\nPeek from tube");
        System.out.println(tube1.peek());
        
        System.out.println("\nGet stack size");
        System.out.println(tube1.getStackSize());
        
        System.out.println("\nRemove items from each");
        tube1.pop();
        tube1.pop();
        tube1.pop();
        System.out.println(tube1);
        
        System.out.println("\nGet stack size");
        System.out.println(tube1.getStackSize());
          
        System.out.println("\nAdd more");
        tube1.push(blue);
        tube1.push(blue);
        tube1.push(blue);
        System.out.println(tube1);
        
        System.out.println("\nCheck Uniform");
        System.out.println(tube1.checkStackUniform());
        
        int n=5;
        //StackAsMyArrayList[] bottles=new StackAsMyArrayList[n];
        
        for(int i=0; i<n; i++)
            bottles[i]= new StackAsMyArrayList();
        
        bottles[1].push(blue);
        bottles[1].push(red);
        bottles[1].push(yellow);
        bottles[1].push(red);
        bottles[2].push(red);
        bottles[2].push(yellow);
        bottles[2].push(blue);
        bottles[2].push(yellow);
        bottles[3].push(blue);
        bottles[3].push(yellow);
        bottles[4].push(red);
        bottles[4].push(blue);
        
       ShowAll();
        
    }
    
}
