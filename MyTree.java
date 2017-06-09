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
    
    public boolean hasLeftTree() {
    
        return (this.getLeftTree() != null);
    
    }
    
    public boolean hasRightTree() {
    
        return (this.getRightTree() != null);
    
    }
    
    // Methoden
    public boolean isEmpty() {
    
        return (key == null);
    
    }
    
    public int size() {
    
        
    
    }
    
    public Iterator iterator() {
        
        return new Iterator() {
            
            private MyStack<MyTree<K, V>> current = new MyStack<MyTree<K, V>>();
            current.push(MyTree<K, V>.this);

            public boolean hasNext() {
                
                return !current.isEmpty();
                
            }

            public MyTree<K, V> next() {
                
                if (!hasNext()) {
                    
                    throw new NoSuchElementException("");
                    
                }
                
                MyTree<K, V> temp = current.pop();
                
                if(temp.hasRightTree()) {
                
                    current.push(temp.getRightTree());
                
                }
                if(temp.hasLeftTree()) {
                
                    current.push(temp.getLeftTree());
                
                }
                
                return temp;
                
           }
            
        };
        
    }

}
