package co.edu.umanizales.battleship.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor //Se puede crear la lista asi la cabeza este vacia
public class ListDE {
    private NodeDE head;
    private int size;

    public void add(ShipDistribution shipDistribution)
    {
        if(this.head == null)
        {
            this.head= new NodeDE(shipDistribution);
        }
        else
        {
            NodeDE temp= this.head;
            while(temp.getNext() != null) // para pararme en el ultimo
            {
                temp = temp.getNext();
            }
            // Parado en el último
            temp.setNext(new NodeDE(shipDistribution));
            temp.getNext().setPrevious(temp); //temporal.siguiente
        }
        this.size++;
    }

    public void addToStart(ShipDistribution shipDistribution)
    {
        if(this.head == null)
        {
            this.head= new NodeDE(shipDistribution);
        }
        else
        {
            NodeDE newNode= new NodeDE(shipDistribution);
            newNode.setNext(this.head);
            this.head.setPrevious(newNode);
            this.head=newNode;
        }
        this.size++;
    }

    public List<ShipDistribution> listNodes()
    {
        List<ShipDistribution> list=new ArrayList<>();
        //Recorre la listade y llenar la List
        NodeDE temp= this.head;
        while(temp != null)
        {
            list.add(temp.getData());
            temp= temp.getNext();
        }
        return list;
    }

    public ListDE cloneList()
    {
        ListDE listClone = new ListDE();
        NodeDE temp= this.head;
        while(temp != null)
        {
            listClone.add(temp.getData());
            temp = temp.getNext();
        }
        return listClone;
    }

    public boolean validateCoordinatesExist(Coordenate[] coordenates)
    {
        NodeDE temp = this.head;
        while(temp!=null)
        {
            for(Coordenate coord: coordenates)
            {
                if(temp.getData().validateCoordinateExist(coord))
                {
                    return true;
                }
            }
            temp= temp.getNext();
        }
        return false;
    }
}