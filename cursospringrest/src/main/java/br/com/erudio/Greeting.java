package br.com.erudio;

public class Greeting {

  private final long id;
  private final String context;
  
  // get and set
  public String getContext() {
    return context;
  }
  public long getId() {
    return id;
  }
  // construtor
  public Greeting(long id, String context) {
    this.id = id;
    this.context = context;
  }

}