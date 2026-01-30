package week4.day1;

class Browsers {

    public void Chrome() {
        System.out.println("Chrome Browser");
    }
}

class Edge extends Browsers {

    public void Chrome() {
        System.out.println("Edge browser");
    }
}

public class OverRidding {

    public static void main(String[] args) {

       
        Browsers b = new Browsers();
        b.Chrome();   

        Edge e = new Edge();
        e.Chrome();   

    }
}