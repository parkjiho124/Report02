import java.util.Comparator;

public class ProductNameComparator implements Comparator<Product> {

	public int compare(Product p1, Product p2) {
		String productName1 = p1.getProductName();
		String productName2 = p2.getProductName();
		
		//대소문자 무시 정렬
		return productName1.compareToIgnoreCase(productName2);
	}
		
	

}