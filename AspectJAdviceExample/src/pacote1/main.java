package pacote1;

public class main {

	public static void main(String[] args) {
	    SampleService service = new SampleService();
	
	    // Chama o método performTask para ver o advice "before", "after" e "around"
	    service.performTask();
	
//	    // Chama o método getMessage para ver o advice "afterReturning"
//	    String message = service.getMessage();
//	    System.out.println("Message: " + message);
//	
	    // Chama o método riskyOperation para ver o advice "afterThrowing"
	    try {
	        service.riskyOperation();
	    } catch (Exception e) {
	        // A exceção é capturada pelo advice "afterThrowing"
	    }
	}
}

