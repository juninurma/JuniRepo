package com.javapassion.examples;

public class InjectRef {
    
    private Oracle oracle;
    
    Oracle getOracle() {
        return oracle;
    }
    
    public void setOracle(Oracle oracle) {
        this.oracle = oracle;
    }
}
