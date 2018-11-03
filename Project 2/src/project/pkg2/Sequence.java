package project.pkg2;

import java.util.ArrayList;

/**
 * a generic class to hold sequences of objects
 * 
 * @author brandonedwards
 * @param <E>
 */
public class Sequence<E> {
    
    /**
     * @fields
     * a data array to hold the objects and a size field to track the list size
     */
    private ArrayList<E> data;

    private int size = 0;

    /**
     * default constructor has an initial capacity of ten but grows 
     * automatically to account for more positions
     */
    public Sequence(){
        
        data = new ArrayList<>();
        size = data.size();
    }
    
    /**
     * a constructor with a capacity parameter for predefined custom size 
     * sequences. However, this doesn't prevent the sequence from growing when 
     * more items are added
     * @param capacity 
     */
    public Sequence(int capacity){
        
        data = new ArrayList<>(capacity);
        size = data.size();
        
    }
    
    /**
     * a constructor meant for testing purposes that initializes a sequence
     * of a predefined size and appends the element parameter to the first position
     * of the sequence.
     * @param cap
     * @param element 
     */
    public Sequence(int cap, E element){
        data = new ArrayList<>(cap);
        size = data.size();
        this.append(element);
    }
    
    /**
     * this method add the specified element to the end of the sequence and 
     * increments the size field for accurate readings
     * @param element 
     */
    public void append(E element){
        
        this.data.add(element);
        
        size++;
        
    }
    
    /**
     * a getter method to retrieve data in the sequence
     * 
     * @param index
     * @return the object stored at the specified index
     */
    public E getData(int index) {
       
        
        return data.get(index);
    }

    /**
     * a setter method to change the element at a specific location in the
     * sequence
     * @param index
     * @param element 
     */
    public void setData(int index, E element) {
        
        if(data.isEmpty()){
            this.append(element);
        }else{
        data.set(index, element);
        }
    }

    /**
     * a method to get the size of the sequence without accessing the field
     * directly
     * @return size of the sequence
     */
    public int getSize() {
        return size;
    }
}