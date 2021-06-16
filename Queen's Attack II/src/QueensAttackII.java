import java.util.*;

class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int rq = sc.nextInt();
        int cq = sc.nextInt();
        int[] ki = new int[k*2];
        for(int i = 0; i < k*2; i++){
            ki[i] = sc.nextInt();
        }
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        List<Integer> l4 = new ArrayList<>();
        List<Integer> l5 = new ArrayList<>();
        List<Integer> l6 = new ArrayList<>();
        List<Integer> l7 = new ArrayList<>();
        List<Integer> l8 = new ArrayList<>();
        boolean c1 = false;
        for(int i = cq-1; i >=1 ; i--){
            for(int f = 0; f < k*2; f+=2) {
                if(ki[f] == rq && ki[f+1] == i ) {
                    c1 = true;
                    break;
                }
            }
            if(c1)
                break;
            else {
                l1.add(rq);
                l1.add(i);
            }

        }
        boolean c2 = false;
        for(int i = cq+1; i <= n; i++){
            for(int f = 0; f < k*2; f+=2) {
                if(ki[f] == rq && ki[f+1] == i ) {
                    c2 = true;
                    break;
                }
            }
            if(c2)
                break;
            else {
                l2.add(rq);
                l2.add(i);
            }
        }
        boolean c3 = false;
        for(int i = rq+1; i <= n; i++){
            for(int f = 0; f < k*2; f+=2) {
                if(ki[f] == i && ki[f+1] == cq) {
                    c3 = true;
                    break;
                }
            }
            if(c3)
                break;
            else {
                l3.add(i);
                l3.add(cq);
            }
        }
        boolean c4 = false;
        for(int i =rq-1; i >=1 ; i--){
            for(int f = 0; f < k*2; f+=2) {
                if(ki[f] == i && ki[f+1] == cq) {
                    c4 = true;
                    break;
                }
            }
            if(c4)
                break;
            else {
                l4.add(i);
                l4.add(cq);
            }
        }
        boolean c5 = false;
        int i = rq+1;
        int j = cq-1;
        while(i <= n || j >= 1){
            if(i <= n && j >= 1) {
                for (int f = 0; f < k * 2; f += 2) {
                    if (ki[f] == i && ki[f + 1] == j) {
                        c5 = true;
                        break;
                    }
                }
                if (c5)
                    break;
                else {
                    l5.add(i);
                    l5.add(j);
                }
            }
                i++;
                j--;

        }
        boolean c6 = false;
        i = rq-1;
        j = cq+1;
        while(j <= n || i >= 1){
            if(j <= n && i >= 1) {
                for (int f = 0; f < k * 2; f += 2) {
                    if (ki[f] == i && ki[f + 1] == j) {
                        c6 = true;
                        break;
                    }
                }
                if (c6)
                    break;
                else {
                    l6.add(i);
                    l6.add(j);
                }
            }
                i--;
                j++;

        }
        boolean c7 = false;
        i = rq-1;
        j = cq-1;
        while(j >= 1 || i >= 1) {
            if (j >= 1 && i >= 1){
                for (int f = 0; f < k * 2; f += 2) {
                    if (ki[f] == i && ki[f + 1] == j) {
                        c7 = true;
                        break;
                    }
                }
            if (c7)
                break;
            else {
                l7.add(i);
                l7.add(j);
            }
        }
            i--;
            j--;
        }
        boolean c8 = false;
        i = rq+1;
        j = cq+1;
        while(j <= n || i <= n){
            if(j <= n && i <= n) {
                for (int f = 0; f < k * 2; f += 2) {
                    if (ki[f] == i && ki[f + 1] == j) {
                        c8 = true;
                        break;
                    }
                }
                if (c8)
                    break;
                else {
                    l8.add(i);
                    l8.add(j);
                }
            }
            i++;
            j++;
        }
        int sum = l1.size() + l2.size() + l3.size() + l4.size() + l5.size() + l6.size() + l7.size() + l8.size();
        sum = sum/2;
        System.out.println(sum);



    }
}
