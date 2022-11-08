package schedule;
import java.util.*;

public abstract class Registration {
    private static Map<Client, String> clients = new HashMap<>();//hash map aq
    private static Table table = new Table();
    
    public static void updateTable(){
        table.clearTable();
        for(Client costumer : clients.keySet()){
            table.addToTable(costumer.getName(), costumer.getId());
        }
    }
    public static void add(Client c) throws RequiredFieldExcecption{
        if(c.getName().equals("")||c.getPhone().equals("")){  
            throw new RequiredFieldExcecption();   
        }else{
            clients.put(c, c.getId());
            updateTable();
        }
    }
    public static void remove(Client c){
        clients.remove(c, c.getId());  
        updateTable();
    }
    public static void update(Client c, String name, String phone, String description){
        c.setName(name);
        c.setPhone(phone);
        c.setDescription(description);
        updateTable();
    }
    public static Client searchById(String id){
        for(Client idClient : clients.keySet()){
            if(clients.get(idClient).equals(id)){
                return idClient;
            }
        }
        return null;
    }
    public static Client searchByNamePhone(String name, String phone) throws RequiredFieldExcecption, InvalidCustomer{
        if(name.equals("")||phone.equals("")){  
            throw new RequiredFieldExcecption();   
        }else{
            for(Client customer : clients.keySet()){
                if(customer.getName().equals(name)&&customer.getPhone().equals(phone)){
                    return customer;
                }
            }
            throw new InvalidCustomer();
        }
    }
    public static int numberCustomers(){
        int counter = 1;
        for(Client customer : clients.keySet()){
            counter++;
        }
        return counter;
    }
    public static void showTable(){
        table.show();
    }
}
