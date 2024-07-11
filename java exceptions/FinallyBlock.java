public class FinallyBlock {
    static void meth1() throws Exception{
        try{
            throw new Exception("Exception occurred fam");
        }finally{
            System.out.println("I'll print regardless");
        }
    }
    public static void main(String[] args) {
        try{
            meth1();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
