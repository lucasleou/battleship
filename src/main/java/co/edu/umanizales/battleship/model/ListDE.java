package co.edu.umanizales.battleship.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class ListDE {
    private NodeDE head;
    private int size;

    public void add(ShipDistribution shipDistribution) {
        if (this.head == null) {
            NodeDE newNode = new NodeDE(shipDistribution);
            this.head = newNode;
        }
        else {
            NodeDE temp = this.head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            NodeDE newNode = new NodeDE(shipDistribution);
            temp.setNext(newNode);
            newNode.setPrevious(temp);
        }
        this.size++;
    }

    public void addToFirst(ShipDistribution shipDistribution) {
        if (this.head == null) {
            NodeDE newNode = new NodeDE(shipDistribution);
            this.head = newNode;
        }
        else {
            NodeDE newNode = new NodeDE(shipDistribution);
            newNode.setNext(this.head);
            this.head.setPrevious(newNode);
            this.head = newNode;
        }
        this.size++;}

    public List<ShipDistribution> list(){
        List<ShipDistribution> list= new ArrayList<>();
        //Recorre la listade y llenar la List
        return list;
    }


}