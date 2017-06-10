import java.lang.Math;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        IntegerDataSource integers = new IntegerDataSource();
        StringDatasource strings = new StringDataSource();
        Iterator string = strings.iterator();
        Iterator integer = integers.iterator();
        
        Mytree<String, Integer> tree = new MyTree();
        System.out.println();
        
        // hinzufuegen und erfassen
        while(string.hasNext() && integer.hasNext()) {
        
            tree.put(string.next(), integer.next());
            System.out.println(tree.toString());
            System.out.println();
        
        }
        
        // loeschen
        Iterator treeIterator = tree.iterator()
        MyTree tempTree = null;
        
        for(int i = 0; i < ((int) (Math.random() * 5)); i++) {
        
            if(treeIterator.hasNext()) {
            
                tempTree = treeIterator.next()
            
            }
        
        }
        
        System.out.println("geloeschter Wert: " + tempTree.remove());
        System.out.println();
        System.out.println(tree.toString());

    }

}
