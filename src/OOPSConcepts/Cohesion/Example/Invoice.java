package OOPSConcepts.Cohesion.Example;

import java.util.List;

public class Invoice {

    private List<Item> itemList;

    private double totalAmount;

    public Invoice(List<Item> items)
    {
        this.itemList = items;
        totalAmount = calculateTotalAmount();
    }

    public double calculateTotalAmount()
    {
        return itemList.stream().mapToDouble(Item :: getPrice).sum();
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void addItem(Item item)
    {
        itemList.add(item);
        totalAmount = calculateTotalAmount();
    }

    // Bad example i can other functions
    
}
