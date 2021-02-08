package javamaven;


import java.util.List;

public class Test{
    public static void main( String[] args ) {

        Shop market = new Shop("Market");
        market.addCustomerToShopList(new Customer("Иван", "Дроздов", "Михайлович", "Украина", 11_22_33_44, 12345));
        market.addCustomerToShopList(new Customer("Андрей", "Фамильян", "Иванович", "Россия", 22_33_44_55, 23456));
        market.addCustomerToShopList(new Customer("Богдан", "Мурахоедов", "Франкович", "Болгария", 33_44_55_66, 34567));
        market.addCustomerToShopList(new Customer("Виктор", "Викторян", "Викторович", "Украина", 44_55_66_77, 45678));
        market.addCustomerToShopList(new Customer("Франк", "Ибрагимов", "Ибрагимович", "Латвия", 55_66_77_88, 56789));
        market.addCustomerToShopList(new Customer("Наташа", "Дроздова", "Алексеевна", "Россия", 66_77_88_99, 67890));
        market.addCustomerToShopList(new Customer("Оксана", "Ростинова", "Ростиславовна", "Украина", 77_88_99_00, 78901));
        market.addCustomerToShopList(new Customer("Степан", "Боруков", "Алексеевич", "Россия", 88_99_00_11, 89012));
        market.addCustomerToShopList(new Customer("Коля", "Петров", "Петрович", "USA", 99_00_11_22, 90123));
        market.addCustomerToShopList(new Customer("Александр", "Добрынин", "Станиславович", "Украина", 10_12_23_34, 10234));

        System.out.println("\nSort by name1");
        List<Customer> ListSortByName1 = market.getListByName1();
        for (Customer c: ListSortByName1) {
            System.out.println(c);
        }

        System.out.println("\nSort by name2");
        List<Customer> ListSortByName2 = market.getListByName2();
        for (Customer c: ListSortByName2) {
            System.out.println(c);
        }

        System.out.println("\nPrint customers by diapason of credit card");
        List<Customer> ListSortByDiapasonCreditCard = market.getListByDiapasonCreditCard(22_33_44_55, 66_77_88_99);
        for (Customer c: ListSortByDiapasonCreditCard) {
            System.out.println(c);

        }
    }
}
