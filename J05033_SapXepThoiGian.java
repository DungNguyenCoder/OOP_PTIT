import java.util.*;

public class J05033_SapXepThoiGian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Time> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Time time = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
            list.add(time);
        }
        Collections.sort(list);

        for(Time time : list) {
            System.out.println(time);
        }
        sc.close();
    }
}

class Time implements Comparable<Time> {
    private int h;
    private int m;
    private int s;

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    @Override
    public int compareTo(Time other) {
        if(this.h != other.h)
            return this.h - other.h;
        else if(this.m != other.m)
            return this.m - other.m;
        else
            return this.s - other.s;
    }

    @Override
    public String toString() {
        return this.h + " " + this.m + " " + this.s;
    }
}


