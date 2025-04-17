package backtracking;

public class BacktrackingQuestions {
    public static void main(String[] args) {
        System.out.println("counting paths for (3,3): "+ count(3,3));
      print(3,3);
    }

    public static int count(int r, int c){
        return countingPaths(r,c);
    }
    private static int countingPaths(int r, int c){
        if(r==1 || c==1){
            return 1;
        }

        int left = countingPaths(r-1,c);
        int right = countingPaths(r, c-1);
        return left + right;
    }

    public static void print(int r, int c){
        printingPaths("",r,c);
    }

    private static void printingPaths(String p, int r, int c){
        if (r==1 && c==1){
            System.out.println(p);;
        }
        //to add diagonal paths
        if(r > 1 && c > 1){
            printingPaths(p+"D", r-1,c-1);
        }
        if(r > 1){
            printingPaths(p+"V",r-1,c);
        }
        if(c > 1){
            printingPaths(p+"H",r,c-1);
        }
    }

}
