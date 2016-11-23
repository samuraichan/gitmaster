package com.mycompany.model;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum Type {
  risk(0), endorsement(1), cancellation(2), specialacceptance(3);

  private static final Map<Integer, Type> lookup = new HashMap<Integer, Type>();

  static {
    for (Type s : EnumSet.allOf(Type.class))
      lookup.put(s.getCode(), s);
  }

  private int code;

  private Type(int code) {
    this.code = code;
  }

  public int getCode() {
    return code;
  }

  public static Type get(int code) {
    return lookup.get(code);
  }
}
