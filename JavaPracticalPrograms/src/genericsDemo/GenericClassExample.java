package genericsDemo;

class Box <T> { 
	
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

public class GenericClassExample {

	public static void main(String[] args) {
		
		  Box<Integer> integerBox = new Box<>(42);
	      System.out.println("Integer Value: " + integerBox.getValue());

	      Box<String> stringBox = new Box<>("Hello, Generics!");
	      System.out.println("String Value: " + stringBox.getValue());
	}

}
