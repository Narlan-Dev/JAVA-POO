package schedule;

public class Client {
    private String id;
    private String name;
    private String phone;
    private String description;

    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getPhone(){
        return this.phone;
    }
    public String getDescription(){
        return this.description;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public Client(String name, String phone, String description, int id){
        this.name = name;
        this.phone = phone;
        this.description = description;
        this.id = String.valueOf(id);
    }
}
