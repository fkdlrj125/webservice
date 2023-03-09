
interface Box{
    int boxing(int num);

    /*
     * int boxing(int num){
     *  return num*num;
     * }
     */

    default Box compose(Box before){
    	return this.boxing(new Box() {
			@Override
			public int boxing(int num) {
				return before.boxing(num);
			}
		});
    }

    default Box composeLambda(Box before){
        return (int num) -> {
        	System.out.println(this);
        	return boxing(before.boxing(num));
        	};
    }
}

public class FunctionalInterfaceQuiz01 {
    public static void main(String[] args) {
        Box power = (int num) -> num*num;
        Box power2 = (int num) -> num*num;
        Box increment = (int num) -> num+1;

        System.out.println(power.composeLambda(increment).boxing(5));
        System.out.println(power.toString());
        System.out.println(power2.toString());
        // System.out.println(power.composeLambda(increment).boxing(5));
    }
}