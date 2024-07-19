class Minister
{
	public static void serve()
	{
		System.out.println("minister has to serve ");
		Assistant.help();
	}
}
class Assistant
{
	public static void help()
	{
		System.out.println("Assistant are there to help ");
		Driver.drive();
	}
}
class Driver
{
	public static void drive()
	{
		System.out.println("Driver drives ");
		Vehicle.transport();
	}
}
class Vehicle
{
	public static void transport()
	{
		System.out.println("Vehicle used for transport ");
		MusicSystem.play();
	}
}
class MusicSystem
{
	public static void play()
	{
		System.out.println("MusicSystem play music ");
		application.run();
	}
}
class application
{
	public static void run()
	{
		System.out.println("application runs ");
		Internet.stream();
	}
}
class Internet
{
	public static void stream()
	{
		System.out.println("Internet  streaming");
		Server.connect();
	}
}
class Server
{
	public static void connect()
	{
		System.out.println("Server connection is enabled");
		Location.display();
	}
}
class Location
{
	public static void display()
	{
		System.out.println("Location is displayed ");
		Building.openGate();
	}
}
class Building
{
	public static void openGate()
	{
		System.out.println("Building has openGate");
		Metal.strength();
	}
}
class Metal
{
	public static void strength()
	{
		System.out.println("metal has strength");
		Factory.make();
	}
}
class Factory
{
	public static void make()
	{
		System.out.println("Factory make machines");
		Machine.design();
	}
}
class Machine
{
	public static void design()
	{
		System.out.println("machine is designed");
		Engineer.nothing();
	}
}
class Engineer
{
	public static void nothing()
	{
		System.out.println("Engineer is nothing to do with marks");
	}
}

