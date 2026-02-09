package org.example;

public class GroceryCounter {
    
    int[] counter = {0,0,0,0};
    int overflow = 0;

    public void tens() {
        counter[0]++;
        System.out.println("Tens incremented.");
        if(counter[0] == 10) {
            counter[0] = 0;
            overflow++;
        }
    }

    public void ones() {
        counter[1]++;
        System.out.println("Ones incremented.");
        if(counter[1] == 10) {
            counter[1] = 0;
            tens();
        }
    }

    public void tenths() {
        counter[2]++;
        System.out.println("Tenths incremented.");
        if(counter[2] == 10) {
            counter[2] = 0;
            ones();
        }
    }

    public void hundredths() {
        counter[3]++;
        System.out.println("Hundredths incremented.");
        if(counter[3] == 10) {
            counter[3] = 0;
            tenths();
        }
    }

    public void clear() {
        for (int i : counter) {
            i = 0;
        }
        System.out.println("Counter cleared.");
    }

    public void overflows() {
        System.out.println("Counter has overflowed " + overflow + " times.");
    }

    public void total() {
        if(counter[0] == 0) {
        System.out.printf("Counter total: $%d.%d%d\n", counter[1],counter[2],counter[3]);
        }
        else {
        System.out.printf("Counter total: $%d%d.%d%d\n", counter[0],counter[1],counter[2],counter[3]);    
        }
    }

}
