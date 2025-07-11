package core_java_udemy.collections.comparator;

import java.util.Comparator;

public class SBComparator implements
        Comparator<StringBuffer>
{

    @Override
    public int compare(StringBuffer o1, StringBuffer o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        //natural ordering
        return s1.compareTo(s2);
    }
}
