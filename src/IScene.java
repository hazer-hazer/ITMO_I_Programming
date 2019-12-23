package src;

public interface IScene{
	Scene addAction(String type, Human executor);
	void bindLast();
	void run();
}