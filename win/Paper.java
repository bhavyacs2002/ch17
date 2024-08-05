class Paper
{
	double thickness;
	double size=200;
	String quality;
	String color;
	public void setThickness(double thickness)
	{
		this.thickness=thickness;
	}
	public Paper(String color)
	{
		this.color=color;
	}
	public void display()
	{
		System.out.println("thickness :"+this.thickness);
		System.out.println("size :"+this.size);
		System.out.println("quality :"+this.quality);
		System.out.println("color :"+this.color);
	}
	}