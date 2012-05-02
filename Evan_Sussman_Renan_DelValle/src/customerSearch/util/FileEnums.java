package customerSearch.util;

public enum FileEnums
{
  Product1("product1.txt"), Product2("product2.txt"), Product3("product3.txt"), Product4("product4.txt"), Product5("product5.txt"), Product6("product6.txt"), Product7("product7.txt"),Product8("product8.txt"),Product9("product9.txt"),Product10("product10.txt"),Product11("product11.txt"),Product12("product12.txt");

  private String descriptionLocation;

  private FileEnums(String c ) {
    this.descriptionLocation = c;
  }

  public String getCode() {
    return descriptionLocation;
  }

}
