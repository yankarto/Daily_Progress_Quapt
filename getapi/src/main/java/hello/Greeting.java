package hello;

public class Greeting {
public final long id;
public final String content;
public long getId() {
	return id;
}
public String getContent() {
	return content;
}
public Greeting(long id, String string) {
	super();
	this.id = id;
	this.content = string;
}

}
