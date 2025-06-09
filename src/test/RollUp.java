package test;

import java.util.ArrayList;
import java.util.List;

// 13 -> 1 7 5
// 1 -> 1
// 7 -> 3 4
// 5
public class RollUp {

    public static void main(String[] args) {

    }


    public static int rollUp(Node node){

        if(node == null){
            return 0;
        }

        int totalValue = node.value;

        for(Node node1 : node.child){
            totalValue += rollUp(node1);
        }
        return totalValue;
    }
}

class Node{
    int value;
    List<Node> child;

    Node(int value){
        this.value = value;
        this.child = new ArrayList<>();
    }


}

