class Singleton {
    private float waterInMl;
    private float sugarInGm;
    static private Singleton tea= null;
    private Singleton(){
        waterInMl = 100.5f;
        sugarInGm = 50.6f;
    }
    public static Singleton getInstance(){
        if(tea==null){
            tea = new Singleton();
        }
        return tea;
    }
    public static void main(String[] args) {
        Singleton sg1 = Singleton.getInstance();
        Singleton sg2 = Singleton.getInstance();
        Singleton sg3 = Singleton.getInstance();
        if(sg1==sg2 && sg1==sg3){
            System.out.println("Same instance!");
        }
    }
}

