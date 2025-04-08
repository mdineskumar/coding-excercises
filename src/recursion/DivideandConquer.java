package recursion;

public class DivideandConquer {
    public static Integer findMaximumElement(int[] lst) {
        if (lst.length == 0) {
            return null;
        }
        return findMax(0,lst.length-1,lst);
    }
    private static int findMax(int i, int j, int[] lst){
        if ( i == j ){
            return lst[i];
        }
        int mid =(i+j) / 2;
        return Math.max(findMax(0,mid,lst),findMax(mid+1,j,lst));
    }

    public static Integer findMinimumElement(int[] lst){
        if(lst.length == 0){
            return null;
        }
        return findMin(0,lst.length-1,lst);
    }
    private static int findMin(int i, int j, int[] lst){
        //handle size 1
        if(i == j){
            return lst[i];
        }
        //handle size 2
        if(j - i == 1){
            return Math.min(lst[i],lst[i+1]);
        }
        //handle size 3
        if(j - i == 2){
            return Math.min(lst[i],Math.min(lst[i+1],lst[i+2]));
        }

        //more than four elements
        int third = (j - i)/3;
        int mid1 = i + third;
        int mid2 = i + 2*third;

        return Math.min(findMin(i,mid1,lst),Math.min(findMin(mid1+1,mid2,lst),findMin(mid2+1,j,lst)));
    }

    public static void main(String[] args) {

        System.out.println("===Find Maximum element in the list and return multiple values ======");
        int[] lst1 = {2,1,3,-4,2};
        int[] lst2 = {};
        int[] lst3 = {2,445,563,12,342,234234,4545};
        System.out.println("lst1: "+findMaximumElement(lst1));
        System.out.println("lst2: "+findMaximumElement(lst2));
        System.out.println("lst3: "+findMaximumElement(lst3));
        System.out.println("min lst1: "+findMinimumElement(lst1));
        System.out.println("min lst2: "+findMinimumElement(lst2));

        System.out.println("min lst3: "+findMinimumElement(lst3));
    }
}
