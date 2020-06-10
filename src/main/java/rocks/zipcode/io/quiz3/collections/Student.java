package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private List<Lab> labs;
    public Student(){
        this(null);
    }
    public Student(List<Lab> labs){
        if(labs != null) {
            this.labs = labs;
        } else{
             this.labs = new ArrayList<>();
            }
        }

     public Lab getLab(String labName){
        for (Lab l : labs){
            if(l.getName().equals(labName)){
                return l;
            }
        }
        return null;
     }

    public void forkLab(Lab lab) {
        for (Lab l : labs){
            if(l.equals(lab)){
                l.setStatus(LabStatus.PENDING);
                return;
            }
        }
        lab.setStatus(LabStatus.PENDING);
        this.labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        return null;
    }

    public void setLabStatus(String labName, LabStatus completed) {
    }
}
    /*private String labName;
    private LabStatus labStatus;
    public Lab(){
        this(null);
    }
    public Student() {
        this(null);
    }

    public Student(List<Lab> labs) {
    }

    public Lab getLab(String labName) {
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        this.labName = labName;
        this.labStatus = labStatus;
    }

    public void forkLab(Lab lab) {
    }

    public LabStatus getLabStatus(String labName) {
        return LabStatus.COMPLETED;
    }*/

