package src;

public interface IActionFactory <T>{
	T createAction(String type, Human executor);
}