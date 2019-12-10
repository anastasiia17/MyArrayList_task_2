import java.util.*;

public class MainList {
    public static void main(String[] args) {

        MyArrayList<Integer> MyList = new MyArrayList<>();
        MyList.add(0, 42);
        MyList.add(1, 43);
        MyList.add(2, 4);
        MyList.printArray();
        System.out.println();

        MyList.remove(0);
        MyList.printArray();

        System.out.println(MyList.isEmpty());

        MyList.add(2);
        MyList.add(7);
        MyList.printArray();

        System.out.println();
        MyList.add(2, 5556);
        MyList.get(2);
        System.out.println(MyList.get(2));

        System.out.println();
        System.out.println(MyList.contains(5556));

    }
}

