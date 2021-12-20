package co.micol.fly;

public class Superman extends Human implements Flyer{
@Override
public void takeOff() {
	System.out.println("내린다");
}
@Override
public void fly() {
	System.out.println("난다");
}
@Override
public void land() {
	System.out.println("착륙하다");
}

}
