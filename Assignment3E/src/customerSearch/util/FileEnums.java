public enum FileEnums
{
  Product1("product1.txt"), Product2("product2.txt"), Product3("product3.txt"), Product4("Pr"), Product5("sdasd"), Product6("sdas");

  private String descriptionLocation;

  private FileEnums(String c ) {
    this.descriptionLocation = c;
  }

  public String getCode() {
    return descriptionLocation;
  }

}
