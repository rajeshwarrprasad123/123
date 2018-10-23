class add4num
{
   public static void main(String args[])
   {
      int x, y, a,b;
      
      System.out.println("Enter four integers to calculate their sum");
      Scanner in = new Scanner(System.in);

      x = in.nextInt();
      y = in.nextInt();
      a = in.nextInt();
      b = in.nextInt();

      System.out.println("Sum of the integers = " + (a+b+x+y));
   }
}


