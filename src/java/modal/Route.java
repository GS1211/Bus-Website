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
public class Route {
    @Id
     int Sr_no;
    int Route_Id;
    String Start;
    String Stop;
    int Driver_Id;

    public int getSr_no() {
        return Sr_no;
    }

    public void setSr_no(int Sr_no) {
        this.Sr_no = Sr_no;
    }

    public int getRoute_Id() {
        return Route_Id;
    }

    public void setRoute_Id(int Route_Id) {
        this.Route_Id = Route_Id;
    }

    public String getStart() {
        return Start;
    }

    public void setStart(String Start) {
        this.Start = Start;
    }

    public String getStop() {
        return Stop;
    }

    public void setStop(String Stop) {
        this.Stop = Stop;
    }

    public int getDriver_Id() {
        return Driver_Id;
    }

    public void setDriver_Id(int Driver_Id) {
        this.Driver_Id = Driver_Id;
    }
    
}
