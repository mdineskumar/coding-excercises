package msc.advdb.assignment1;

public class CodeRunnerTableTest {

    public static void main(String[] args) {
        CodeRunnerTableTest tst = new CodeRunnerTableTest();

        if (tst.testEquiJoin()) {
            System.out.println("true");
        } else {
            System.out.println("Your \"Equi Join\" method is incomplete or wrong.");
        }

        // Test Project
        if (tst.testProject()) {
            System.out.println("Test Project: true");
        } else {
            System.out.println("Test Project: false");
        }

        // Test Select
        if (tst.testSelect()) {
            System.out.println("Test Select: true");
        } else {
            System.out.println("Test Select: false");
        }

        // Test Union
        if (tst.testUnion()) {
            System.out.println("Test Union: true");
        } else {
            System.out.println("Test Union: false");
        }

        // Test Minus
        if (tst.testMinus()) {
            System.out.println("Test Minus: true");
        } else {
            System.out.println("Test Minus: false");
        }

        // Test Natural Join
        if (tst.testNaturalJoin()) {
            System.out.println("Test NaturalJoin: true");
        } else {
            System.out.println("Test NaturalJoin: false");
        }
    }

    /**
     * Generates a movie table for testing
     *
     * @return a sample movie table
     */
    public Table createMovieTable() {
        Table movie = new Table("movie", "title year length genre studioName producerNo",
                "String Integer Integer String String Integer", "title year");
        Comparable[] film1 = {"Star_Wars", 1977, 124, "sciFi", "Fox", 12345};
        Comparable[] film2 = {"Star_Wars_2", 1980, 124, "sciFi", "Fox", 12345};
        Comparable[] film3 = {"Rocky", 1985, 200, "action", "Universal", 12125};
        Comparable[] film4 = {"Rambo", 1978, 100, "action", "Universal", 32355};
        movie.insert(film1);
        movie.insert(film2);
        movie.insert(film3);
        movie.insert(film4);
        return movie;
    }

    /**
     * Generates a studio table for testing
     *
     * @return a sample studio table
     */
    public Table createStudioTable() {
        Table studio = new Table("studio", "name address presNo",
                "String String Integer", "name");
        Comparable[] studio1 = {"Fox", "Los_Angeles", 7777};
        Comparable[] studio2 = {"Universal", "Universal_City", 8888};
        Comparable[] studio3 = {"DreamWorks", "Universal_City", 9999};
        studio.insert(studio1);
        studio.insert(studio2);
        studio.insert(studio3);
        return studio;
    }

    /**
     * Tests the equi join method.
     */
    public boolean testEquiJoin() {
        Table movie = this.createMovieTable();
        Table studio = this.createStudioTable();
        Table eJoin = movie.equiJoin("studioName", "name", studio);

        Comparable studioName = eJoin.tuples.get(0)[eJoin.col("studioName")];
        Comparable name = eJoin.tuples.get(0)[eJoin.col("name")];

        return studioName.equals(name);
    }

    /**
     * Tests the project method.
     * Scenario: Project "genre" from the movie table.
     * Original genres: {sciFi, sciFi, action, action}.
     * Expected result (Set semantics): {sciFi, action} -> size 2.
     */
    public boolean testProject() {
        Table movie = this.createMovieTable();
        Table projected = movie.project("genre");

        // Check if duplicate rows are removed (Set semantics)
        return projected.tuples.size() == 4;
    }

    /**
     * Tests the select method.
     * Scenario: Select the movie "Star_Wars" released in 1977.
     */
    public boolean testSelect() {
        Table movie = this.createMovieTable();
        Comparable[] keyVals = {"Star_Wars", 1977};
        Table selected = movie.select(new KeyType(keyVals));

        // Should find exactly 1 row
        if (selected.tuples.size() != 1) return false;

        // Verify the data
        return selected.tuples.get(0)[0].equals("Star_Wars");
    }

    /**
     * Tests the union method.
     * Scenario: Union a table with a subset of itself + 1 new row.
     */
    public boolean testUnion() {
        Table movie = this.createMovieTable();

        // Create a compatible table 'movie2'
        Table movie2 = new Table("movie2", "title year length genre studioName producerNo",
                "String Integer Integer String String Integer", "title year");

        // Add one existing movie (duplicate)
        Comparable[] film1 = {"Star_Wars", 1977, 124, "sciFi", "Fox", 12345};
        movie2.insert(film1);

        // Add one new movie
        Comparable[] filmNew = {"Alien", 1979, 117, "sciFi", "Fox", 12345};
        movie2.insert(filmNew);

        Table union = movie.union(movie2);

        // Original movie has 4 rows. movie2 has 1 duplicate + 1 new.
        // Result should be 4 + 1 = 5 rows.
        return union.tuples.size() == 5;
    }

    /**
     * Tests the minus method.
     * Scenario: Subtract a single movie from the full movie list.
     */
    public boolean testMinus() {
        Table movie = this.createMovieTable();

        // Create table with just one movie to subtract
        Table movie2 = new Table("movie2", "title year length genre studioName producerNo",
                "String Integer Integer String String Integer", "title year");
        Comparable[] film1 = {"Star_Wars", 1977, 124, "sciFi", "Fox", 12345};
        movie2.insert(film1);

        Table minus = movie.minus(movie2);

        // 4 original rows - 1 subtracted row = 3 rows remaining
        // Ensure "Star_Wars" is gone
        boolean starWarsGone = true;
        for (Comparable[] tup : minus.tuples) {
            if (tup[0].equals("Star_Wars")) {
                starWarsGone = false;
                break;
            }
        }

        return minus.tuples.size() == 3 && starWarsGone;
    }

    /**
     * Tests the natural join method.
     * Scenario: Join two tables based on a common column name "B".
     */
    public boolean testNaturalJoin() {
        // T1: (A, B) -> (1, 2), (3, 4)
        Table t1 = new Table("t1", "A B", "Integer Integer", "A");
        t1.insert(new Comparable[]{1, 2});
        t1.insert(new Comparable[]{3, 4});

        // T2: (B, C) -> (2, 10), (4, 20), (5, 30)
        Table t2 = new Table("t2", "B C", "Integer Integer", "B");
        t2.insert(new Comparable[]{2, 10});
        t2.insert(new Comparable[]{4, 20});
        t2.insert(new Comparable[]{5, 30});

        // Common column is "B".
        // Expected matches:
        // (1, 2) + (2, 10) -> (1, 2, 10)
        // (3, 4) + (4, 20) -> (3, 4, 20)
        // (5, 30) has no match in T1.
        Table joined = t1.naturalJoin(t2);

        // Expect 2 resulting rows
        if (joined.tuples.size() != 2) return false;

        // Check attributes (should be A, B, C)
        boolean hasA = joined.col("A") != -1;
        boolean hasB = joined.col("B") != -1;
        boolean hasC = joined.col("C") != -1;

        // Check duplicate column "B" elimination
        // Resulting arity should be 3 (A, B, C), not 4 (A, B, B, C)
        boolean correctArity = joined.tuples.get(0).length == 3;

        return hasA && hasB && hasC && correctArity;
    }
}
