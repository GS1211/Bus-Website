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
public class Driver {
    @Id
     
    String Driver_Name;
    int Driver_Id;
    int Route_Id;
    int Phone_no;

    public String getDriver_Name() {
        return Driver_Name;
    }

    public void setDriver_Name(String Driver_Name) {
        this.Driver_Name = Driver_Name;
    }

    public int getDriver_Id() {
        return Driver_Id;
    }

    public void setDriver_Id(int Driver_Id) {
        this.Driver_Id = Driver_Id;
    }

    public int getRoute_Id() {
        return Route_Id;
    }

    public void setRoute_Id(int Route_Id) {
        this.Route_Id = Route_Id;
    }

    public int getPhone_no() {
        return Phone_no;
    }

    public void setPhone_no(int Phone_no) {
        this.Phone_no = Phone_no;
    }

 
    
}
