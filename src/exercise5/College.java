package exercise5;

/**
 * Class College
 * Task 5: Create a class College with the following private data members: String name, int rank. Implement setter method for the rank.
 * @author yasiro01
 */
public class College {
    private String name;
    private int rank;
    
    public College(String name, int rank) {
      this.name = name;
      this.rank = rank;
    }
    
    public String getName() {
      return name;
    }

    public int getRank() {
      return rank;
    }
  
    public void setRank(int rank) {
      this.rank = rank;
    }
  
  @Override
  public String toString() {
    return String.format("%s is ranked #%d", name, rank);
  }
}