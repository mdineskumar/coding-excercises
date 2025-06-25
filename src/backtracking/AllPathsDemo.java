package backtracking;

import core_java_udemy.access_modifiers.p1.A;

import java.util.ArrayList;
import java.util.List;

public class AllPathsDemo {

    //graph path traversal

    public static void allPaths(int[][] g, int s, List path, List ans){

        ans.add(new ArrayList<>(path));

        for(int v : g[s]){
            path.add(v);
            System.out.println(path);
            allPaths(g,v,path,ans);
            path.remove(path.size() - 1);
            System.out.println(path + " backtrack");
        }


    }

    public static void main(String[] args) {
        int[][] al = {{1},{2},{4},{},{3,5},{6},{}};
        List ans = new ArrayList();
        List path = new ArrayList();
        path.add(0);
        allPaths(al,0,path,ans);
    }
}
