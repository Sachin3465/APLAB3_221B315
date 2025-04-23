class test {
    public static void main (String[] args) {
        Offering offering = new Coffee();
        offering = new Rum (offering);
        System.out.println(offering.getname() + " " +offering.getprice());
        System.out.println(offering.getname() + " " +);
        
        
    }
} 