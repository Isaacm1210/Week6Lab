
package models;

import java.util.ArrayList;

/**
 *
 * @author mhamed
 */
public class User {
    
    private String username;
    private ArrayList<String> itemList;
    
    public User(){
        username = "";
        itemList = new ArrayList<>();
    }
    
    
    public User(String username, ArrayList<String> itemList){
        this.username = username;
        this.itemList = itemList;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setItemList(ArrayList<String> itemList){
        this.itemList = itemList;
    }
    
    public ArrayList<String> getItemList(){
        return itemList;
    }
}
