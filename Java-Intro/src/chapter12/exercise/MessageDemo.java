package chapter12.exercise;

public class MessageDemo {

	public static void main(String[] args) {
		
		show(Message.ERROR,"Die Bestellung wurde abgebrochen\n");
		show(Message.INFO,"Die Bestellung wurde abgeschlossen\n");
		show(Message.WARN,"Die Bestellung ist nicht vollständig\n");
	}
	
	public static void show(Message msg, String txt)
	{
		String output = "";
		
		switch(msg)
		{
		case INFO: output = "Information";break;
		case WARN: output = "Warnung";break;
		case ERROR: output = "Error";break;
		default:break; 
		}
		
		System.out.println(output +"\n"+txt);
	}

}
