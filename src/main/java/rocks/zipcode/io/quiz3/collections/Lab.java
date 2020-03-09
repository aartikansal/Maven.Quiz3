package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    String labName;
    LabStatus labStatus;


    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.labName= labName;


    }

    public String getName() {
        return this.labName;
    }

    public void setStatus(LabStatus labStatus) {
        this.labStatus=labStatus;

    }

    public LabStatus getStatus() {
        return this.labStatus;
    }
}
