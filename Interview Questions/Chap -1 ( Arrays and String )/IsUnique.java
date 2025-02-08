// Implement and algorithm to determine if a string has all unique characters. What if you can't use additional data structure?

// Assuming that the string is an ASCII string 

// If its a unicode string then we would have to use hashMap

class Main {
  public static void main(String[] args) {
      System.out.println(isUnique("Helo"));
  }
  
  public static boolean isUnique( String s ){
      boolean[] charExistance = new boolean[256];
      int asciiValue;
      for( char ch : s.toCharArray() ){
          asciiValue = (int) ch;
          if( charExistance[asciiValue] )
              return false;
          charExistance[asciiValue] = true;
      }
      return true;
  }
}