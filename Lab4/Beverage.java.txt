abstract class Beverage{
    protected void pour(int qty){
        System.out.println("pour"+ qty+"ml of beverage into a glass");
    }
    
    protected abstract void addcondiments();
    
    protected void stir(){}
 
    private void Serve(){
    System.out.println("serve through waiter");
    }

    public void templateMethod(int qty){
     pour(qty);
     addcondiments();
     stir();
     serve();
    }
}