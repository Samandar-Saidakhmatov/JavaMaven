package javamaven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private String shopName;
    private ArrayList<Customer> customersList = new ArrayList<>();  //create CustomersList in the Array List

    Shop(String shopName){
        this.shopName = shopName;
    }

    void addCustomerToShopList(Customer customer){          //method which add customer to the Customer list into the Array list
        customersList.add(customer);
    }

    List<Customer> getListByName1(){                         //method to get the name1
        List<Customer> list = new ArrayList<>(customersList);  //new list with the size customerList
        Collections.sort(list, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getName1().compareToIgnoreCase(o2.getName1());
            }
        });
        return list;
    }

    List<Customer> getListByName2(){
        List<Customer> list = new ArrayList<>(customersList);
        Collections.sort(list, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getName2().compareToIgnoreCase(o2.getName2());
            }
        });
        return list;
    }

    List<Customer> getListByDiapasonCreditCard(int diapasonStart, int diapasonEnd){
        List<Customer> list = new ArrayList<>();
        for (Customer c: customersList) {           //for each loop(enhanced for) uses in collections when don't care about index
            if(c.getCreditCardId() >= diapasonStart && c.getCreditCardId() <= diapasonEnd){
                list.add(c);
            }
        }
        return list;

    }
}
