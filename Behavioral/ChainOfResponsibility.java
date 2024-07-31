package Behavioral;
//The Chain of Responsibility design pattern is a behavioral pattern that allows multiple objects to handle a request 
//without specifying which object will handle it. 
//It creates a chain of handlers, and each handler decides whether to process the request or pass it to the next handler in the chain.


 abstract class Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(String request);
}

class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("request1")) {
            System.out.println("ConcreteHandler1 handled the request");
        } else {
            if (next != null) {
                next.handleRequest(request);
            }
        }
    }
}

 class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("request2")) {
            System.out.println("ConcreteHandler2 handled the request");
        } else {
            if (next != null) {
                next.handleRequest(request);
            }
        }
    }
}
public class ChainOfResponsibility {

	public static void main(String[] args) {
		Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();

        handler1.setNext(handler2);

        handler1.handleRequest("request1");
        handler1.handleRequest("request2");
        handler1.handleRequest("request3");// TODO Auto-generated method stub
	}
	}

