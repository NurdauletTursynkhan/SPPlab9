interface IBeverage {
    double getCost();
    String getDescription();
}

class Coffee implements IBeverage {
    public double getCost() {
        return 50.0;
    }

    public String getDescription() {
        return "Coffee";
    }
}

abstract class BeverageDecorator implements IBeverage {
    protected IBeverage beverage;

    public BeverageDecorator(IBeverage beverage) {
        this.beverage = beverage;
    }

    public double getCost() {
        return beverage.getCost();
    }

    public String getDescription() {
        return beverage.getDescription();
    }
}

class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(IBeverage beverage) {
        super(beverage);
    }

    public double getCost() {
        return super.getCost() + 10.0;
    }

    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}

class SugarDecorator extends BeverageDecorator {
    public SugarDecorator(IBeverage beverage) {
        super(beverage);
    }

    public double getCost() {
        return super.getCost() + 5.0;
    }

    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }
}

class ChocolateDecorator extends BeverageDecorator {
    public ChocolateDecorator(IBeverage beverage) {
        super(beverage);
    }

    public double getCost() {
        return super.getCost() + 15.0;
    }

    public String getDescription() {
        return super.getDescription() + ", Chocolate";
    }
}

class VanillaDecorator extends BeverageDecorator {
    public VanillaDecorator(IBeverage beverage) {
        super(beverage);
    }

    public double getCost() {
        return super.getCost() + 12.0;
    }

    public String getDescription() {
        return super.getDescription() + ", Vanilla";
    }
}

class CinnamonDecorator extends BeverageDecorator {
    public CinnamonDecorator(IBeverage beverage) {
        super(beverage);
    }

    public double getCost() {
        return super.getCost() + 8.0;
    }

    public String getDescription() {
        return super.getDescription() + ", Cinnamon";
    }
}

public class CafeOrderSystem {
    public static void main(String[] args) {
        IBeverage beverage = new Coffee();
        System.out.println(beverage.getDescription() + " : " + beverage.getCost());

        beverage = new MilkDecorator(beverage);
        System.out.println(beverage.getDescription() + " : " + beverage.getCost());

        beverage = new SugarDecorator(beverage);
        System.out.println(beverage.getDescription() + " : " + beverage.getCost());

        beverage = new ChocolateDecorator(beverage);
        System.out.println(beverage.getDescription() + " : " + beverage.getCost());

        beverage = new VanillaDecorator(beverage);
        System.out.println(beverage.getDescription() + " : " + beverage.getCost());

        beverage = new CinnamonDecorator(beverage);
        System.out.println(beverage.getDescription() + " : " + beverage.getCost());
    }
}
