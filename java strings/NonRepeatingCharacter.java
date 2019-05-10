class NonRepeatingCharacter
{
    public static void main(String[] args)
    {
      String str = "popokpppppookokokoki";
      for (char ch : str.toCharArray())
      {
          if (str.indexOf(ch) == str.lastIndexOf(ch))
          {
              System.out.println(" non repeated character "+ str + " is:" + ch);
              break;
          }
      }
    }
}