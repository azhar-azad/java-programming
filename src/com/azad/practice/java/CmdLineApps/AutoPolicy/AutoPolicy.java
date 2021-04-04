package com.azad.practice.java.CmdLineApps.AutoPolicy;

// Class that represents an auto insurance policy.
public class AutoPolicy {

    private int accountNumber; // policy account number
    private String makeAndModel; // car that the policy applies to
    private String state; // two-letter state abbreviation

    // constructor
    public AutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    // getter and setter
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // predicate method returns whether the state has no-fault insurance
    public boolean isNoFaultState() {

        boolean noFaultState;

        // determine whether state has no-fault auto insurance
        switch (getState()) { // get AutoPolicy object's state abbreviation
            case "MA": case "NJ" : case "NY" : case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }

        return noFaultState;
    }
}
