import de.tu_bs.*;

public class MyTree<K extends Comparable<K>, V> implements Tree<K, V>{

    // Variabeln
    private K key;
    private V value;
    private MyTree leftTree;
    private MyTree rightTree;
    
    // Konstruktoren
    public MyTree<K, V>() {
    
        key = null;
        value = null;
        LeftTree = null;
        rightTree = null;
    
    }
    
    public MyTree<K, V>(T pKey, V pValue) {
    
        key = pKey;
        value = pValue;
        LeftTree = null;
        rightTree = null;
    
    }
    
    public MyTree<K, V>(T pKey, V pValue, MyTree pLeft, MyTree pRight) {
    
        key = pKey;
        value = pValue;
        LeftTree = pLeft;
        rightTree = pRight;
    
    }
    
    // Hilfsmethoden
    public MyTree<K, V> getLeftTree() {
    
        return leftTree;
    
    }
    
    public MyTree<K, V> getRightTree() {
    
        return rightTree;
    
    }
    
    public void setLeftTree(MyTree<T, V> pLeft) {
    
        leftTree = pLeft;
    
    }
    
    public void setRightTree(MyTree<T, V> pRight) {
    
        rightTree = pRight;
    
    }
    
    // Methoden
    public boolean isEmpty() {
    
        return (key == null);
    
    }
    
    public int size() {
    
        
    
    }
    
    public Iterator iterator() {
        return new Iterator() {
            private MyList<E> current = MyList<E>.this;

            public boolean hasNext() {
                return !current.isEmpty();
            }

            public Comparable<T> next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("");
                }
                Comparable<T> e = current.first();
                current = current.next;
                return e;
           }
            
        };
        
    }

}
