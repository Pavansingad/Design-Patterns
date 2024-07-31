package Behavioral;

 class Originator {
	 	private String state;

	 	public void setState(String state) {
	 		this.state = state;
	 	}

	 	public String getState() {
	 		return state;
	 	}

	 	public Memento saveState() {
	 		return new Memento(state);
	 	}

	 	public void restoreState(Memento memento) {
	 		state = memento.getState();
	 	}
 	}
  class Memento {
	    private String state;

	    public Memento(String state) {
	        this.state = state;
	    }

	    public String getState() {
	        return state;
	    }
	}

 class Caretaker {
	    private Memento memento;

	    public void saveMemento(Memento memento) {
	        this.memento = memento;
	    }

	    public Memento retrieveMemento() {
	        return memento;
	    }
	}
public class MomentoPattern {

	public static void main(String[] args) {
		 Originator originator = new Originator();
	        Caretaker caretaker = new Caretaker();

	        originator.setState("State 1");
	        caretaker.saveMemento(originator.saveState());

	        originator.setState("State 2");
	        System.out.println("Current State: " + originator.getState());

	        originator.restoreState(caretaker.retrieveMemento());
	        System.out.println("Restored State: " + originator.getState());
	    }
	}
// TODO Auto-generated method stub
