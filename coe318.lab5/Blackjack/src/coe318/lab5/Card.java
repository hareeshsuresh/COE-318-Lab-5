/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package coe318.lab5;

/**
 *
 * @author hareeshsuresh
 */
package coe318.lab5;

public class Card implements Comparable {
  //Symbolic constants

  public static final int CLUB = 0;
  public static final int DIAMOND = 1;
  public static final int HEART = 2;
  public static final int SPADE = 3;
  private int rank = 0;
  private int suit =0;
  private boolean faceUp = false;
  

  /**
   * Construct a card of the given rank, suit and whether it is faceup or
   * facedown. The rank is an integer from 2 to 14. Numbered cards (2 to 10)
   * have a rank equal to their number. Jack, Queen, King and Ace have the ranks
   * 11, 12, 13, and 14 respectively. The suit is an integer from 0 to 3 for
   * Clubs, Diamonds, Hearts and Spades respectively.
   *
   * @param rank
   * @param suit
   * @param faceUp
   */
  public Card(int rank, int suit, boolean faceUp) {
      this.rank = rank;
      this.suit = suit;
      this.faceUp = faceUp;
  }

  /**
   * @return the faceUp
   */
  public boolean isFaceUp() {
      if (this.faceUp == true)
      {
          return true;
      }
      else
      {
          return false;
      }    
  }

  /**
   * @param faceUp the faceUp to set
   */
  public void setFaceUp(boolean faceUp) {
      this.faceUp = faceUp;
  }

  /**
   * @return the rank
   */
  public int getRank() {
    return this.rank;
  }

  /**
   * @return the suit
   */
  public int getSuit() {
    return this.suit;
  }

  @Override
  public boolean equals(Object ob) {
    if (!(ob instanceof Card)) {
      return false;
    }
    Card c = (Card) ob;
    if(c.rank == this.rank && c.suit == this.suit)
    {
        return true;
    }
    else
    {
        return false;
    }

  }

  @Override
  public int hashCode() {//DO NOT MODIFY
    int hash = 7;
    hash = 31 * hash + this.getRank();
    hash = 31 * hash + this.getSuit();
    return hash;
  }

  @Override
  public int compareTo(Object obj) {//DO NOT MODIFY
    return compareTo((Card) obj);
  }

  public int compareTo(Card c) {
      // If param rank is larger than class value, returns -1
      if(this.rank < c.getRank())
      {
          return (-1);
      }
      // If param rank is smaller than class value, returns 1
      else if(this.rank > c.getRank())
      {
          return (1);
      }
      
      else{
           // If param suit is larger than class value, returns -1
      if (this.suit < c.getSuit())
      {
          return (-1);
      }
      //If param suit is smaller than class value, returns 1
      else if (this.suit > c.getSuit())
      {
          return (1);
      }
         else
      {
          //If the cards are equal, returns 0
       return 0;
      }  
          
      }
   
   
  }

  /**
   * Return the rank as a String. For example, the 3 of Hearts produces the
   * String "3". The King of Diamonds produces the String "King".
   *
   * @return the rank String
   */
  public String getRankString() {
      switch(this.getRank())
      {
          case 11:
              return("Jack");
          case 12:
              return("Queen"); 
          case 13:
              return("King");
          case 14:
              return("Ace");
          default:
              return (Integer.toString(rank));
      }
  }

  /**
   * Return the suit as a String: "Clubs", "Diamonds", "Hearts" or "Spades".
   *
   * @return the suit String
   */
  public String getSuitString() {
      switch(suit)
      {
          case 0:
            return("Clubs");
          case 1:
              return("Diamonds");
          case 2:
              return("Hearts");
          case 3:
              return("Spades");
          default:
              return("Error in finding suit");
      }
  }

  /**
   * Return "?" if the card is facedown; otherwise, the rank and suit of the
   * card.
   *
   * @return the String representation
   */
  @Override
  public String toString() {
      if(this.faceUp == true)
      {
          return (this.getRankString() + this.getSuitString());
      }
      else
      {
          return("?");
      }
  }
  
  //create new method to keep track of the score of the cards
  // The method will use a switch case
  // Will be used to calculate the score in the BlackjackGame file
  
  public int getScore()
  {
            switch(this.getRank())
      {
          case 11:
              return(10);
          case 12:
              return(10); 
          case 13:
              return(10);
          case 14:
              return(1);
          default:
              return (rank);
  }
  }
  

  public static void main(String[] args) {
    //Create 5 of clubs
    Card club5 = new Card(5, 0, true);
    System.out.println("club5: " + club5);
    Card spadeAce = new Card(14, SPADE, true);
    System.out.println("spadeAce: " + spadeAce);
    System.out.println("club5 compareTo spadeAce: "
            + club5.compareTo(spadeAce));
    System.out.println("club5 compareTo club5: "
            + club5.compareTo(club5));
    System.out.println("club5 equals spadeAce: "
            + club5.equals(spadeAce));
    System.out.println("club5 equals club5: "
            + club5.equals(club5));
  }

    void value() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}