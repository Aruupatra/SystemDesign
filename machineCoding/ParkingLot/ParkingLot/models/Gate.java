package main.java.ParkingLot.models;

public class Gate extends BaseModel{


    private GateType gateType;
    private int gateNumber;
    private Operator currOperator;
    private GateStatus gateStatus;

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public Operator getCurroperator() {
        return currOperator;
    }

    public void setCurroperator(Operator currOperator) {
        this.currOperator = currOperator;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }
}
