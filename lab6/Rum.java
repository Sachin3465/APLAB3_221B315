class Rum extends Decorator {
    Rum(Offering offering){
        this.offering = offering;
    }
    String getname(){
        return offering.getname() + " with rum";
    }
    int getprice(){
        return offering.getprice() + 50;
    }
}