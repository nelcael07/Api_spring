package br.com.erudio;

public class Greeting {

  private final long id;
  private final String context;
  
  public String getContext() {
    return context;
  }
  public long getId() {
    return id;
  }
  
  public Greeting(long id, String context) {
    this.id = id;
    this.context = context;
  }

}