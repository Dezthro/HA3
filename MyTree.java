import de.tu_bs.*;

public class MyTree<K extends Comparable<K>, V> implements Tree<K, V> {

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
    
    public K getKey() {
    
        return key;
    
    }
    
    private V getValue() {
    
        return value;
    
    }
    
    private void setValue(V pValue) {
    
        this.value = pValue;
    
    }
    
    // Methoden
    public boolean isEmpty() {
    
        return (key == null);
    
    }
    
    public int size() {
    
        int counter = 0;
        Iterator temp = this.iterator();
        
        while(temp.hasNext()) {
        
            temp.next();
            counter++;
        
        }
        
        return counter;
    
    }
    
    public boolean containsKey(K pKey) {
    
        boolean containsKey = false;
        Iterator temp = this.iterator();
        
        while(temp.hasNext()) {
        
            if(temp.next().getKey().equals(pKey)) {
            
                containsKey = true;
                break;
            
            }
        
        }
        
        return containsKey;
    
    }
    
    public boolean containsValue(V pValue) {
    
        boolean containsValue = false;
        Iterator temp = this.iterator();
        
        while(temp.hasNext()) {
        
            if(temp.next().getValue().equals(pValue)) {
            
                containsValue = true;
                break;
            
            }
        
        }
        
        return containsValue;
    
    }
    
    public V get(K pKey) {
    
        V retValue = null;
        Iterator temp = this.iterator();
        
        while(temp.hasNext()) {
            
            MyTree<K, V> tempTree = temp.next();
        
            if(tempTree.getKey().equals(pKey)) {
                
                retValue = tempTree.getValue();
                
            }
        
        }
        
        return retValue;
    
    }
    
    public V put(K pKey, V pValue) {
    
        if(this.getKey().compareTo(pKey) == 0) {
        
            return null;
        
        } else if(this.getKey().compareTo(pKey) < 0) {
        
            if(this.hasLeftTree()) {
            
                return this.getLeftTree().put(pKey, pValue);
            
            } else {
            
                this.setLeftTree(new MyTree<K, V>(pKey, pValue));
                return pValue;
                
            }
            
        } else  {
        
            if(this.hasRightTree()) {
            
                return this.getRightTree().put(pKey, pValue);
            
            } else {
            
                this.setRightTree(new MyTree<K, V>(pKey, pValue));
                return pValue;
            
            }
        
        }
    
    }
    
    public V replace(K pKey, V pValue) {
    
        if(this.getKey().compareTo(pKey) == 0) {
            
            this.setValue(pValue);
        
        } else if(this.getKey().compareTo(pKey) < 0) {
        
            if(this.hasLeftTree()) {
            
                return this.getLeftTree().replace(pKey, pValue);
            
            } else {
            
                return null;
                
            }
            
        } else  {
        
            if(this.hasRightTree()) {
            
                return this.getRightTree().replace(pKey, pValue);
            
            } else {
            
                return null;
            
            }
        
        }
    
    }
    
    // Iterator
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
                
                MyTree<K, V> tempTree = current.pop();
                
                if(tempTree.hasRightTree()) {
                
                    current.push(temp.getRightTree());
                
                }
                if(tempTree.hasLeftTree()) {
                
                    current.push(temp.getLeftTree());
                
                }
                
                return temp;
                
           }
            
        };
        
    }

}
