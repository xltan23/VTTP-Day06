package vttp.d6;

import java.util.List;

public class BoxMain {
    public static void main(String[] args) {
        BoxString boxOfStrings = new BoxString();
        boxOfStrings.setContent( "This is a string" );
    
        Box boxOfInts = new Box();
        boxOfInts.setContent(42); //No type checking because content is object

        //boxOfInts.setContent(boxOfStrings);
        //boxOfStrings.setContent("false");

        System.out.printf("Inside the box of strings: %s\n", boxOfStrings.getContent());
        System.out.printf("Inside the box of integers: %d\n", boxOfInts.getContent());

        BoxG<Integer> bInt = new BoxG<>();
        bInt.setContent(23);
        System.out.printf("Inside a random box: %d\n", bInt.getContent());

        BoxG<String> bStr = new BoxG<String>();
        bStr.setContent("Another String Box");
        System.out.printf("Inside a random box: %s\n", bStr.getContent());

        BoxUtil.printBox(boxOfInts);

        // How to set list in content?
        BoxG<List<String>> bListStr = new BoxG<>();
        BoxG<BoxG<Float>> bBoxFloat; 

    }
}
