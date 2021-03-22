package edu.isu.cs.cs2263;


public interface Visitor {
     public String visit(Friends friends);
     public String visit(Dating dating);
}