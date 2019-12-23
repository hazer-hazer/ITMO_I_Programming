package src;

public interface IExecutorFactory <T>{
	T createAction(String type, Human executor);
}