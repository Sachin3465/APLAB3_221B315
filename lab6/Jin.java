class Jin extends Decorator{
    Jin (Offering offering){
        this.offering = offering;
    }
    
    int getprice (){
        return offering.getprice() + 55;
    }
    String getname(){
        return offering.getname() + "With Jin";
    }
}