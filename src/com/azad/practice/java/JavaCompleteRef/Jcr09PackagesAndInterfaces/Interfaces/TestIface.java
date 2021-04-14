package com.azad.practice.java.JavaCompleteRef.Jcr09PackagesAndInterfaces.Interfaces;

class Client implements Callback {

    // Implement Callback's interface
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Classes that implement interfaces " +
                            "may also define other members, too");
    }
}

class TestIface {

    public static void main(String[] args) {

        Callback c = new Client();
        c.callback(42);
    }
}

/**
     callback called with 42
 * */
