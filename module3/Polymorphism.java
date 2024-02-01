package module3;

class Empolyee {
    public void Desg() {
        System.out.println("Cognine Employee");
    }
}

class Dev extends Empolyee {
    public void Desg() {
        System.out.println("Dev Desg");
    }
}

class Qa extends Empolyee {
    public void Desg() {
        System.out.println("QA Desg");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
    	Empolyee emp1 = new Dev();
    	Empolyee emp2 = new Qa();

        emp1.Desg();
        emp2.Desg();
    }
}