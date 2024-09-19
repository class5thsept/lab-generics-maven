package edu.grinnell.csc207.util.predicates;

import edu.grinnell.csc207.util.Predicate;

public class SmallObject implements Predicate<Object>{
  public static final SmallObject PRED = new SmallObject();

  public boolean holds(Object val) {
    String dummy = val.toString();
    return dummy.length() < 5;
  }
}
