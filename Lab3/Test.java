// Abstract class Bharatvanshi
abstract class Bharatvanshi {
    abstract void fight();
    abstract void obey();
    abstract void kind();
}

// Concrete class Pandav
class Pandav extends Bharatvanshi {
    void fight() {
        System.out.println("Pandav fights bravely.");
    }

    void obey() {
        System.out.println("Pandav obeys the rules.");
    }

    void kind() {
        System.out.println("Pandav is kind.");
    }
}

// Concrete class Kaurav
class Kaurav extends Bharatvanshi {
    void fight() {
        System.out.println("Kaurav fights fiercely.");
    }

    void obey() {
        System.out.println("Kaurav disobeys the rules.");
    }

    void kind() {
        System.out.println("Kaurav is cruel.");
    }
}

// Subclass Arjun
class Arjun extends Pandav {
    // Inherits fight(), obey(), and kind() from Pandav
}

// Subclass Bheem
class Bheem extends Pandav {
    void kind() {
        System.out.println("Bheem is less kind.");
    }
}

// Subclass Duryodhan
class Duryodhan extends Kaurav {
    // Inherits fight(), obey(), and kind() from Kaurav
}

// Subclass Vikarn
class Vikarn extends Kaurav {
    void obey() {
        System.out.println("Vikarn obeys the rules.");
    }

    void kind() {
        System.out.println("Vikarn is kind.");
    }
}

// Test class
public class Test {
    public static void main(String[] args) {
        Bharatvanshi arjun = new Arjun();
        Bharatvanshi bheem = new Bheem();
        Bharatvanshi duryodhan = new Duryodhan();
        Bharatvanshi vikarn = new Vikarn();

        arjun.fight();
        arjun.obey();
        arjun.kind();

        bheem.fight();
        bheem.obey();
        bheem.kind();

        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
