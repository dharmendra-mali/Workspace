package cards;



import java.util.Comparator;



public class Card {
	
	private String value; 
    private String shape; 
    private String color; 
     

    
   public Card(String value, String shape, String color) 
    { 
        
        this.value = value; 
        this.shape = shape; 
        this.color = color; 
    }
    
    
    
    
    
   public String getValue() {
		return value;
	}





	public void setValue(String value) {
		this.value = value;
	}





	public String getShape() {
		return shape;
	}





	public void setShape(String shape) {
		this.shape = shape;
	}





	public String getColor() {
		return color;
	}





	public void setColor(String color) {
		this.color = color;
	}





public String toString()
{
	   return  this.value + " " + this.shape + " " + this.color ; 
    	
}
public static Comparator<Card> cardValue = new Comparator<Card>()
{
	public int compare(Card value1, Card value2)
	{
		String vCard1= value1.getValue();
		String vCard2= value2.getValue();
		
		switch(vCard1)
		{
		case "Ace":
			vCard1="1";
			break;
		case "jack":
			vCard1="11";
			break;
		case "queen":
			vCard1="12";
			break;
		case "king":
			vCard1="13";
			break;
		}
		
		
		switch(vCard2)
		{
		case "Ace":
			vCard2="1";
			break;
		case "jack":
			vCard2="11";
			break;
		case "queen":
			vCard2="12";
			break;
		case "king":
			vCard2="13";
			break;
		}
		
		int r1 = Integer.valueOf(vCard1);
		int r2 = Integer.valueOf(vCard2);
		
		return r1-r2;
	}
};
   

public static Comparator<Card> cardShape = new Comparator<Card>()
{
	public int compare(Card value1, Card value2)
	{
		String vCard1= value1.getShape();
		String vCard2= value2.getShape();
		
		switch(vCard1)
		{
		case "Heart":
			vCard1="1";
			break;
		case "Flower":
			vCard1="2";
			break;
		case "Diamond":
			vCard1="3";
			break;
		case "Leaf":
			vCard1="4";
			break;
		case "joker":
			vCard1="5";
			break;
		}
		
		
		switch(vCard2)
		{
		case "Heart":
			vCard2="1";
			break;
		case "Flower":
			vCard2="2";
			break;
		case "Diamond":
			vCard2="3";
			break;
		case "Leaf":
			vCard2="4";
			break;
		case "joker":
			vCard2="5";
			break;
		}
		
			int r1 = Integer.valueOf(vCard1);
		int r2 = Integer.valueOf(vCard2);
		
		return r1-r2;
	}
};
}
