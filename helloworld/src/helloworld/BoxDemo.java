package helloworld;

class Box {
	double width;
	double height;
	double length;
}

class BoxDemo {

	public static void main(String[] args) {
		Box mybox = new Box();
		double vol;
		mybox.height=20;
		mybox.width=10;
		mybox.length=20;
		vol=mybox.height*mybox.width*mybox.length;
		System.out.println("volume of mybox is " + vol);
	}

}
