
interface IMember {
    void callback();
}

class Store{
    IMember[] mem =  new IMember[25];
    int count = 0;

    void register(IMember m){
        mem[count++] = m;
    }

    void saleInvite(){
        for(int i=0; i<count; i++){
            mem[i].callback();
        }
    }
}

class Customer implements IMember{
  String name;
  public Customer(String name){
    this.name = name;
  }
  public void callback(){
      System.out.println("Got it! I'll be at the sale, " + name);
  }
}

public class JavaCallBack {
    public static void main(String[] args) {
        Store s = new Store();
        Customer john = new Customer("John Cena");
        Customer undertaker = new Customer("The UnderTaker");
        Customer kane = new Customer("Kane");
        s.register(john);
        s.register(undertaker);
        s.saleInvite();
    }
}
