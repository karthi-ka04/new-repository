package numberprogram;

public class WhatsappClass implements WhatsappInterface {

	public void send() {
			System.out.println("msg is sent");
		}
	public static void main(String[] args) {
		WhatsappInterface wc=new WhatsappClass();
		wc.send();
	}

	}


