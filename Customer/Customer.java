public class Customer 
{
  private String nameVar;
  private int idNumVar;
  
  //  constructs a Customer with given name and ID number
  public Customer (String name, int idNum)
  {
    nameVar = name;
    idNumVar = idNum;
  }

  //  returns the customer’s name
  public String getName ()
  {
    return nameVar;
  }

  //  returns the customer’s id
  public int getID ()
  {
    return idNumVar;
  }

  //  returns a string of “Customer name: <name>     id: <idNum>”  (Do not print the angle brackets < > .)
  public String toString ()
  {
    return "Customer name: " + nameVar + "\tid: " + idNumVar;
  }

  //  returns:
  //   1 if this customer is greater than other
  //  -1 if this customer is less than other
  //  0 if they are the same
  public int compare (Customer other)
  {
    int compare = 0;
    if (idNumVar > other.idNumVar)
    {
      compare = 1;
    }
    else if (idNumVar < other.idNumVar)
    {
      compare = -1;
    }
    return compare;
  }
}

