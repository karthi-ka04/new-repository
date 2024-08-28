package oopsConceptExamples;

 class ProductMc {
	
	public ProductMc productId() {
		System.out.println("product id done");
		return this;
	}
	public ProductMc productName() {
		System.out.println("product name done");
		return this;
	}
	public ProductMc productType() {
		System.out.println("product type is done");
		return this;
	}
	
	public static void main(String[] args) {
		ProductMc p=new ProductMc();
	       p.productId().productName().productType();
	}
	

}
 
