import java.util.List;
import java.util.Comparator;

public class Solution{
  public static void main(String args[]){
   	Trader raoul = new Trader("Raoul","Cambridge");  //most mistake in  'a' and 'e' or while pronouncing trrrrrrrr
	Trader mario = new Trader("Mario","Milan");
	Trader alan = new Trader("Alan","Cambridge");
	Trader brian = new Trader("Brian","Cambridge");
	
	List<Transaction> transactions =List.of(
		new Transaction(brian,2011,300),
		new Transaction(raoul,2012,1000),
		new Transaction(raoul,2011,400),
		new Transaction(mario,2012,710),
		new Transaction(mario,2012,700),
		new Transaction(alan,2012,950)
	);
   
    //Find all the transactions in the year of 2011 and sort them by value(small to high)?   
	List<Transaction> transactions_2011_sort_by_value=transactions.stream().filter(tx->tx.getYear()==2011).sorted(Comparator.comparingInt(Transaction::getValue)).toList(); 
	System.out.println(transactions_2011_sort_by_value);
	
	//what are all the unique cities where the traders works?
    List<String> unique_cities=transactions.stream().map(Transaction::getTrader).map(Trader::getCity).distinct().toList(); 
	System.out.println(unique_cities);	
	
	//Find all the traders from the cambridge and sort them by name?
	List<Trader> trades_cambridge=transactions.stream().map(Transaction::getTrader).filter(td->"Cambridge".equals(td.getCity())).sorted(Comparator.comparing(Trader::getName)).toList(); 
    System.out.println(trades_cambridge);
	
	//Return a string of all the  traders' names sorted aphabetically.
	List<String> traders_name=transactions.stream().map(Transaction::getTrader).map(Trader::getName).sorted().toList(); 
    System.out.println(traders_name);
	
	//Are any trader based on in Milan?
	Boolean is_traders_cambridge=transactions.stream().map(Transaction::getTrader).anyMatch(td->"Milan".equals(td.getCity()));
    System.out.println(is_traders_cambridge);
	
	//Print all the transactions' values from the traders living in Cambridge
	 transactions.stream()
	.filter(tr->"Cambridge".equals(tr.getTrader().getCity()))
	.map(Transaction::getValue)
	.forEach(System.out::println);
	
	//what is the highest value of transaction?
	Transaction transaction=transactions.stream().max(Comparator.comparing(Transaction::getValue)).get();
	System.out.println(transaction);	
 }
}

final class Transaction{
	private final Trader trader;
	private final int year;
	private final int value;
    
	public Transaction(Trader trader,int year,int value){
		this.trader=trader;
		this.year=year;
		this.value=value;
	}
	
	public Trader getTrader(){
		return this.trader;
	}
    
	public int getYear(){
		return this.year;
	}  	
	
	public int getValue(){
		return this.value;
	}
	
	public String toString(){
		return "{%s, year: %d value %d".formatted(this.trader,this.year,this.value);
	}
	
	
} 

final class Trader{
	private final String name;
	private final String city;
	
	public Trader(String name,String city){
		this.name=name;
		this.city=city;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getCity(){
		return this.city;
	}
	
	public String toString(){
		return "Trader: %s in %s".formatted(this.name,this.city);
	}
}