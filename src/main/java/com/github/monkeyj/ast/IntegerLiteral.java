package com.github.monkeyj.ast;

import com.github.monkeyj.Token;

public class IntegerLiteral extends Expression {
    private int value;
    public IntegerLiteral(Token token,int value) {
        super(token);
        this.value = value;
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void expressionNode() {

    }

    public String toString() {
        return token.getLiteral();
    }
}
