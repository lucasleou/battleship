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
        shipDistribution.getShip().setId(this.size+1);
        if(this.head == null)
        {
            this.head= new NodeDE(shipDistribution);
        }
        else{
            NodeDE temp = this.head;
            while(temp.getNext() != null)
            {
                temp = temp.getNext();
            }
            //Posicionado en el último
            temp.setNext(new NodeDE(shipDistribution));
            temp.getNext().setPrevious(temp);
        }
        this.size++;
    }

    public void addToStart(ShipDistribution shipDistribution) {
        shipDistribution.getShip().setId(this.size+1);
        if(this.head == null)
        {
            this.head= new NodeDE(shipDistribution);
        }
        else
        {
            NodeDE newNode= new NodeDE(shipDistribution);
            newNode.setNext(this.head);
            this.head.setPrevious(newNode);
            this.head = newNode;
        }
        this.size++;
    }

    public List<ShipDistribution> listNodes(){
        List<ShipDistribution> list= new ArrayList<>();
        //Recorre la listade y llenar la List
        NodeDE temp= this.head;
        while(temp != null)
        {
            list.add(temp.getData());
            temp = temp.getNext();
        }
        return list;
    }

    public ListDE clonelist()
    {
        ListDE listClone = new ListDE();
        NodeDE temp = this.head;
        while(temp != null)
        {
            listClone.add(temp.getData());
            temp = temp.getNext();
        }
        return listClone;
    }


}