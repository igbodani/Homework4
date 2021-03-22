package edu.isu.cs.cs2263;

public class Dating implements Visitable{
    String name;
    public Dating(String name){
        this.name = name;
    }
    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}