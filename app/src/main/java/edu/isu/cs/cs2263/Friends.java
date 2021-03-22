package edu.isu.cs.cs2263;

public class Friends implements Visitable{
    String name;
    Friends(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}