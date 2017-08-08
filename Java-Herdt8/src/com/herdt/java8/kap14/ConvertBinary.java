package com.herdt.java8.kap14;

class ConvertBinary
{
  public static int parseBinary(String s)
  {
    int result = 0;

    for (int i = 0; i < s.length(); i++)
    {
      char c = s.charAt(i);
      if ((c != '1') && (c != '0'))
      {
        return -i;
      }
      else
      {
        result *= 2;
        if (c == '1')
        {
          result++;
        }
      }
    }
    return result;
  }
}