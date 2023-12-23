import java.util.Arrays;

public class RotateArray {



    public static void shiftAndPush(int[] array){
        /*
            This method  acts as a queue  it takes an array as a parameter dequeues 
            the array's element and enqueus it at the end only once 
        *
        */ 
        int dequeuedValue = array[0];

        for(int i= 0;i < array.length-1; i++ ){
            array[i] = array[i + 1]; 

        }

        array[array.length-1] = dequeuedValue;


}


public static void rotate(int[] array, int shiftNumber){
    /*  This method  is the rotator it takes an array and rotate it according to the 
        number of shifts provided
    
    */

    // For loop to perform the rotations
    for( int round  = 0; round < shiftNumber; round++){

        shiftAndPush(array);

    }


}

public static void main(String[] args) {  

    int[] array = {1,2,3,4,5,};

    //Prints Array before rotation
    System.out.println(Arrays.toString(array)); 


    rotate(array, 4); // Prints [5, 1, 2, 3, 4] after rotation


    // Prints Array after rotation
    System.out.println(Arrays.toString(array)); 
}



}