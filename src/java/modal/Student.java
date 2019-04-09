/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 *
 * @author Garru don
 */
@Entity
public class Student {
@Id
    int Id;
//    int Sr_no;
    String Name;
    int Route_Id;
    long Phone_no;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getRoute_Id() {
        return Route_Id;
    }

    public void setRoute_Id(int Route_Id) {
        this.Route_Id = Route_Id;
    }

    public long getPhone_no() {
        return Phone_no;
    }

    public void setPhone_no(long Phone_no) {
        this.Phone_no = Phone_no;
    }

    
    
}
