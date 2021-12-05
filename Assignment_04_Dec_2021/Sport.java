package Assignment_04_Dec_2021;

class Sports {
    String getName() {
        return "Generic Sports";
    }

    void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getName());
    }
}

class Soccer extends Sports {

    @Override
    String getName() {
        return "Soccer Class";
    }

    void getNumberOfTeamMembers(int n) {
        System.out.println("Each team has " + n + " players in " + getName());
    }
}

public class Sport {
    public static void main(String args[]) {
        Sports obj = new Sports();
        System.out.println(obj.getName());
        obj.getNumberOfTeamMembers();

        Soccer obj1 = new Soccer();
        System.out.println(obj1.getName());
        obj1.getNumberOfTeamMembers(11);
    }
}