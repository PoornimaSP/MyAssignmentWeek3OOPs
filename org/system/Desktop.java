package org.system;

public class Desktop extends Computer {
	public void desktopsize(int size)
	{
		System.out.println("Desktop size is "+size);
		
	}
	public static void main(String[] args) {
		Desktop dt=new Desktop();
		System.out.println("Below are the Desktop's class's own and inherited methods output ");
		dt.desktopsize(10034);
		dt.computerModel("Dell");
		System.out.println("");
		
		Computer ct= new Computer();
		System.out.println("Below are the Computer's class's method output ");
		ct.computerModel("HP");
	}

}
