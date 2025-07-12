import java.util.ArrayList;
import java.util.List;

public class Ikeda {
  public static void main(String args[]) {
    List<Bean> beanList = new ArrayList<>();

    Bean a = new Bean(true, "A", 1000);
    Bean b = new Bean(true, "B", 2000);
    Bean c = new Bean(false, "C", 3000);
    Bean d = new Bean(false, "D", 4000);

    beanList.add(a);
    beanList.add(b);
    beanList.add(c);
    beanList.add(d);

    int sum = beanList.stream()
             .filter(Bean::getFlg)
             .mapToInt(Bean::getPrice)
             .sum();
    System.out.println(sum);
  }
}
class Bean {
  private boolean flg;
	private String name;
	private int price;
	public Bean(boolean flg, String name, int price) {
		this.flg = flg;
    this.name = name;
		this.price = price;
	}
  public boolean getFlg() {
    return flg;
  }
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}
